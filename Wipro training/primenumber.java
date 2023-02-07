
import java.util.*;
class primenumber{
 public static  void main(String args[]){
     Scanner ob= new Scanner(System.in);
     System.out.println("Enter the element");
     int input =ob.nextInt();
  int flag=0;
  int count =0;
  int m=input/2;
  if(input==0||input==1){
        System.out.println("not a prime");
  }
    else{
      for(int i=1;i<=input;i++){
         if(input%i==0){
            count ++;
         }
      }
      if(count ==2){
        System.out.println("Prime number");
      }
    }
  }
}
