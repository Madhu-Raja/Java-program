interface one{
     void palindrome();
}
public class MyClass{
    public void palindrome(){
        int num=2211, rev=0;
        int rem=num%10;
        rev=rev*10+num;
        num=num/10;
        System.out.println("The reverse of the number"+ rev);
        
    }
        
    public static void main(String[] args) {
    
        MyClass o=new MyClass();
        o.palindrome();
         
    } 
}
output
The reverse of the number2211
