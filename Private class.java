	class A{  
	private int data=40;  
	private void msg(){System.out.println("Hello java");}  
	}  
	  
	public class Simple{  
	 public static void main(String args[]){  
	   A obj=new A();  
	   System.out.println(obj.data);//Compile Time Error  
	   obj.msg();//Compile Time Error  
	   }  
	}  
output
/Simple.java:9: error: data has private access in A
	   System.out.println(obj.data);//Compile Time Error  
	                         ^
/Simple.java:10: error: msg() has private access in A
	   obj.msg();//Compile Time Error  
	      ^
2 errors

