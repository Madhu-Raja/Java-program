public class ebill
{
public static void main (String args[])
{
customerdata ob = new customerdata();
ob.getdata();
ob.calc();
ob.display();
}
}
class customerdata
{
Scanner in = new Scanner(System.in);
Scanner ins = new Scanner(System.in);
String cname,type;
int bn;
double current,previous,tbill,units;
void getdata()
{
System.out.print ("\n\t Enter consumer number  ");
bn = in.nextInt();
System.out.print ("\n\t Enter Type of connection  (D for Domestic or C for Commercial) ");
type = ins.nextLine();
System.out.print ("\n\t Enter consumer name  ");
cname = ins.nextLine();
System.out.print ("\n\t Enter previous month reading  ");
previous= in.nextDouble();
System.out.print ("\n\t Enter current month reading  ");
current= in.nextDouble();
}
void calc()
{
units=current-previous;
if(type.equals("D"))
{
if (units<=100)
tbill=1 * units;
else if (units>100 && units<=200)
tbill=2.50*units;
else if(units>200 && units<=500)
tbill= 4*units;
else
tbill= 6*units;
}
else 
{
if (units<=100)
tbill= 2 * units;
else if(units>100 && units<=200)
tbill=4.50*units;
else if(units>200 && units<=500)
tbill= 6*units;
else
tbill= 7*units;
}
}
void display()
{
System.out.println("\n\t Consumer number = "+bn);
System.out.println ("\n\t Consumer name = "+cname);
if(type.equals("D"))
System.out.println ("\n\t type of connection  = DOMESTIC ");
else
System.out.println ("\n\t type of connection  = COMMERCIAL ");
System.out.println ("\n\t Current Month  Reading = "+current);
System.out.println ("\n\t Previous Month  Reading = "+previous);
System.out.println ("\n\t Total units = "+units);
System.out.println ("\n\t Total bill = RS "+tbill);
}
} 
output
Enter consumer number  3655
	 
	 Enter Type of connection  (D for Domestic or C for Commercial) D
	 
	 Enter consumer name  Mohan
	 
	 Enter previous month reading  35.56
	 
	 Enter current month reading  45.56
	 
	 Consumer number = 3655

	 Consumer name = mMohan

	 type of connection  = DOMESTIC 
	 
	 Current Month  Reading = 45.56

	 Previous Month  Reading = 35.56
	 
	 Total units = 10.0

	 Total bill = RS 10.0
