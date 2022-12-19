import java.util.*;
class Account{
	String accname;
	String accno;
	String acctype;
	Account(String accname, String accno, String acctype){
		this.accno=accno;
		this.accname=accname;
		this.acctype=acctype;
	}
	}
class Bank{
	public ArrayList<Account>getArrayList(ArrayList<Account>al){
		al.add(new Account("xxx", "222", "saving"));
		al.add(new Account("yyy", "123", "saving"));
		al.add(new Account("eee", "223", "deposit"));
		return al;
		
		
	}
	
}

public class genericsExample {
public static void main(String[]args) {
	ArrayList<Account>al= new ArrayList<Account>();
	Bank b=new Bank();
	ArrayList <Account>acc_list=b.getArrayList(al);
	for(Account acc:acc_list)
		System.out.println(acc.accno+"\t"+acc.accname+"\t"+acc.acctype);
	
			
			
}
}
