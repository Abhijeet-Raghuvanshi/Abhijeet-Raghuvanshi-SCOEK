public class Maxheap {
    static void buildHeap(int arr[], int n){
        int start=(n/2)-1;
        for(int i=start;i>=0;i--){
            heapify(arr,n,i);
        }
    }
    static void heapify(int[] arr,int n,int i){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n && arr[l]>arr[largest]){
            largest = l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest = r;
        }
        if(largest !=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest]= temp;
             heapify(arr, n, largest);
            }
       
    }
    static void printHeap(int arr[], int n){
        System.out.println("Array represtation of Heap:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {4,10,3,5,1};
        int n = arr.length;
        buildHeap(arr, n);
        printHeap(arr,n);
    }
}