import java.util.*;
 class Myclass{
	 public void disp() {
		 System.out.println("parent class method");
	 }
	
}
public class superKeywordExample extends Myclass{
	public void disp() {
		super.disp();
		System.out.println("child class method");
		
	}
	public static void main(String[]args) {
		superKeywordExample obj=new superKeywordExample();
		obj.disp();
		
	}
	

}
