public class MyClass{
    public static void main(String []args)
    {
        int num =2211,rev=0;
        while (num!=0)
        {
            int rem=num%10;
            num=num/10;
            rev=rev*10+ rem;
            
        }
        System.out.println("The reverse of number is:"+rev);
    }
}
output
The reverse of number is:1122
