import java.util.Scanner;
public class nprandncr {
public static int fact(int num)
{
int fact=1, i;
for(i=1; i<=num; i++)
{
fact = fact*i;
}
return fact;
}
public static void main(String args[])
{
int n, r;
Scanner scan = new Scanner(System.in);
System.out.print("Enter Value of n : ");
n = scan.nextInt();
System.out.print("Enter Value of r : ");
r = scan.nextInt();
System.out.print("NCR = " +(fact(n)/(fact(n-r)*fact(r))));
System.out.print(" \n nNPR = " +(fact(n)/(fact(n-r))));
}
}
output
Enter Value of n : 5
Enter Value of r : 2
NCR = 10 
 nNPR = 20
