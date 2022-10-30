class A{
	private test2 obj;
// parameterized constructor with object test2
	A(test2 obj){
		this.obj=obj;
		obj. display();
//calling the display method of test2
	}
}
public class test2{
	int x=5;
//creating the empty constructor and assigning the value of a in test2  
	test2(){
		A obj=new A(this);
		
	}
	void display() {
		System.out.println("Valu of x= "+x);
		
	}
	public static void main(String[]args) {
		test2 ob=new test2();
	}
}















