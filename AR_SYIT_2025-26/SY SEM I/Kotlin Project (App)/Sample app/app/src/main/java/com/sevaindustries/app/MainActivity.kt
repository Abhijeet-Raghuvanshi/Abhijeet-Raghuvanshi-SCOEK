package com.sevaindustries.app

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.navigation.NavigationBarView
import com.sevaindustries.app.databinding.ActivityMainBinding

private var androidx.swiperefreshlayout.widget.SwipeRefreshLayout.isRefreshing: Boolean

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

	private lateinit var binding: ActivityMainBinding

	private val baseUrl = "https://sevaindustries.in/"
	private val productsUrl = "https://sevaindustries.in/products/"
	private val contactUrl = "https://sevaindustries.in/contact/"

	@SuppressLint("SetJavaScriptEnabled")
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		setSupportActionBar(binding.toolbar)

		val webSettings: WebSettings = binding.webView.settings
		webSettings.javaScriptEnabled = true
		webSettings.domStorageEnabled = true
		webSettings.loadsImagesAutomatically = true
		webSettings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
		webSettings.userAgentString =
			webSettings.userAgentString + " SevaIndustriesApp/1.0"

		binding.webView.apply {
			overScrollMode = WebView.OVER_SCROLL_NEVER
			webChromeClient = object : WebChromeClient() {
				override fun onProgressChanged(view: WebView?, newProgress: Int) {
					super.onProgressChanged(view, newProgress)
					binding.progressBar.progress = newProgress
					binding.progressBar.visibility = if (newProgress < 100) View.VISIBLE else View.GONE
				}
			}
			webViewClient = object : WebViewClient() {
				override fun shouldOverrideUrlLoading(
					view: WebView?,
					request: WebResourceRequest?
				): Boolean {
					return false
				}
				override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
					binding.progressBar.visibility = View.VISIBLE
				}
				override fun onPageFinished(view: WebView?, url: String?) {
					binding.swipeRefresh.isRefreshing = false
					binding.progressBar.visibility = View.GONE
				}
			}
		}

		binding.swipeRefresh.setOnRefreshListener {
			binding.webView.reload()
		}

		binding.bottomNav.setOnItemSelectedListener(this)

		if (savedInstanceState == null) {
			binding.bottomNav.selectedItemId = R.id.nav_home
			loadUrl(baseUrl)
		}

		onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
			override fun handleOnBackPressed() {
				if (binding.webView.canGoBack()) {
					binding.webView.goBack()
				} else {
					isEnabled = false
					onBackPressedDispatcher.onBackPressed()
				}
			}
		})
	}

	private fun loadUrl(url: String) {
		binding.webView.loadUrl(url)
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean {
		return super.onOptionsItemSelected(item)
	}

	override fun onNavigationItemSelected(item: MenuItem): Boolean {
		return when (item.itemId) {
			R.id.nav_home -> {
				loadUrl(baseUrl)
				true
			}
			R.id.nav_products -> {
				loadUrl(productsUrl)
				true
			}
			R.id.nav_contact -> {
				loadUrl(contactUrl)
				true
			}
			else -> false
		}
	}
}

private fun androidx.swiperefreshlayout.widget.SwipeRefreshLayout.setOnRefreshListener(function: () -> Unit) {}

