public  class VarrgExample {
public static void sum(int...x) {
	int total=0;
	for(int i=0;i<x.length;i++) {
		total=total+x[i];
	}
	System.out.println("Total is "+total);
	
}
public static void main(String[]args) {
	sum(10,20);
	sum(22,33,4);
    
	
}
}
