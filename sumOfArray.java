// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public void sumOfArray(){
        int sum=0;
        int [] array= new int[5];
        Scanner ob=new Scanner (System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<5;i++){
            array[i]=ob.nextInt();
            if(array[i]%2==0){
                sum= sum+array[i]; 
            }
            else{
                continue;
            }
            
           
        }
         System.out.println(sum);
        }
    
    public static void main(String[] args) {
        HelloWorld h= new HelloWorld();
        h.sumOfArray();
        
    }
}
