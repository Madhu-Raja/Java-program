import java.util.*;
public class StackDemo {
	static void showPush(String a, Stack st) {
		st.push(new String(a));
		System.out.println(a);
		System.out.println(st);
		
		
	}
	static void showPop(Stack st) {
		System.out.println("pop--->");
		String a= (String)st.pop();
		System.out.println(a);
		System.out.println(st);
		
	}
	

	public static void main(String[] args) {
		try {
			Stack st =new Stack();
			System.out.println(st);
			System.out.println("Is empty"+st.empty());
			showPush("Tamil",st);
			showPush("English",st);
			showPush("Science",st);
			showPush("Maths",st);
			showPush("Social",st);
			showPop(st);
			showPop(st);
			showPop(st);
			showPop(st);
			showPop(st);
			
			
		}
		catch(EmptyStackException e) {
			System.out.println("empty stack");
		}

	}

}
