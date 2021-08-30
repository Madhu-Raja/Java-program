import java.util.Scanner;
public class sum{
    public static void main (String args[]){
        float x,y,sum;
        Scanner sc= new Scanner(System.in);
        x= sc.nextFloat();
        System.out.println("Enter the no.1");
        y=sc.nextFloat();
        System.out.println("Enter the no.2");
        sum= sum(x,y);
        System.out.println("Sum "+sum);
    }
    public static float sum(float a,float b){
    float sum= a+b;
    return sum;
        
    }
}
output
13.4
12.4
Enter the no.1
Enter the no.2
Sum 25.8
