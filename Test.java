class A1{
	void info() {
		System.out.println("This is the parent class");
	}
}
class B extends A1{
	void info() {
		System.out.println("This  is the child class ");

	}
	void show() {
		info();
		super.info();
	}
}
public class Test {
	public static void main(String[]args) {
		B ob=new B();
		ob.show();
		
	}

}
