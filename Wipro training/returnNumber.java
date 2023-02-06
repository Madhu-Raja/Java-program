import java.io.*;
import java.util.Scanner;

public class returnNumber {
public static void main(String args[]) {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number 1");
  int input=s.nextInt();
  System.out.println("Enter the number 2");
  int input2=s.nextInt();
  int res=input+input2;
  
  
  if(res%2==0) {
	  System.out.println("Even ");
  }
  
  else {
	  System.out.println("Odd number");
  }
}
}
