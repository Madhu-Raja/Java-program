
 class Address {
	String city, state;
	Address(String city,String state){
		this.city=city;
		this.state=state;
	}
}
public class Emp{
	int id;
	Address address;
	public Emp(Address address, int id){
		this.id=id;
		this.address=address;
		
	}
	void display() {
		System.out.println("Emp id"+id);
		System.out.println("Emp city"+address.city + " " +"emp State"+address.state);
	}
	


public static void main(String[]args) {
	Address ad=new Address("chennai","TN");
	
	Emp emp=new Emp(ad,103);
	emp.display();
	
}
}

