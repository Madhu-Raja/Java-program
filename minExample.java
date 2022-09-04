import java.util.Scanner;
public class minExample {
	 static int[] get(){
		 return new int[]{1,3,4,5};
		 
	 }
		
	 

	public static void main(String[] args) {
		int arr[]=get();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the element to be searched:");
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				System.out.println("Found");
			}
		}
				
			
		


	}

}
