public class ThrowException{
	public void display() throws ArithmeticException{
		int c = 10/0;
	}
	public void show(){
		System.out.println("Executed");
	}
	public static void main(String[] args){
		ThrowException t = new ThrowException();
		t.show();
		t.display();
	}
}