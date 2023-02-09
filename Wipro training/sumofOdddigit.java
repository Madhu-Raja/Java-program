import java.util.*
import java.io*;
class sumofOdddigit{
public static void main(String[]args){
  Scanner obj=new Scanner(System.in);
  int input =sc.nextInt();
  int sum=0;
  int r;
  while(input>0){
    r=input%10;
    if(r%2==1){
      sum=sum+r;
    }
    input=input/10;
  }
  System.out.println(sum);
}
}
    
