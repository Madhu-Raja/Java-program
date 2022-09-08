
public class withandWithoutObjectExample {
	public int add(int a,int b) {
		int s=a+b;
		return s;
		
	}
	public static void add_1(int x,int y) {
		int result=x+y;
		System.out.println(result);
	}

	public static void main(String[] args) {
		int a=10;
		int b=5;
		add_1(a,b);
		withandWithoutObjectExample ob=new withandWithoutObjectExample();
		System.out.println(ob.add(12, 4));
		

	}

}
