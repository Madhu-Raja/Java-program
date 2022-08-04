
public class mirrorinverse {
   static boolean  ismirrorinverse(int arr[]) {
	   for (int i=0;i<arr.length;i++) {
		   if(arr[arr[i]]!=1) {
			   return false;
		   }
		   
	   }
	 return true;
   }
 public static void main(String args[]) {
	 int arr[]= {1,3,7,7,9};
	 if(ismirrorinverse(arr))
		 System.out.println("yes");
	 else
		 System.out.println("no");
	 
			 
 }
}
