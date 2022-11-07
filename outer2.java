import java.util.*;
public class outer2 {
	class inner{
		public void m1() {
			System.out.println("this is inner class");
		}
	}
	public void m2() {
		inner i=new inner();
		i.m1();
	}
public static void main(String[]args) {
	outer2 o=new outer2();
	o.m2();
	
}
}
