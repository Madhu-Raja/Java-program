interface one{
    void area();
    
}
public class two implements one
{
    public void area(){
        int s=3;
        System .out.println(s*s);
        
    }
    

public static void main(String args[])
{
    two o=new two();
    o.area();
}
}
output
9
