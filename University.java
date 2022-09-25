class universityExample{
	String Clg_name;
	String Address;
	universityExample(String Clg_name,String Address){
		this.Address= Address;
		this.Clg_name=Clg_name;
	
	}
	
}
public class University {
	String type;
	universityExample Address;
	
public 	 University(String type, universityExample Address) {
	this.type=type;
	this.Address=Address;
	
	
}
void display() {
	System.out.println("Type :"+type);
	System.out.println("College Name: "+Address.Clg_name+" "+", College Address: "+Address.Address);
}
public static void main(String[]args) {
	universityExample u1=new universityExample("Rajalakshmi institute of technology","chennai");
	universityExample u2= new universityExample("Saveetha college of engineering", "thandalam");
	 
	University uni1=new University ("Affilated",u1);
	University uni2= new University ("Deemed",u2);
	uni1.display();
	uni2.display();
	
}

}
