//Multiple interface using inheritance 
interface Square{
    void area();
    
}
interface rectangle extends Square{
    void area1();
}
public class MyClass implements rectangle{
    public void area(){
        int s=5;
        System.out.println(s*s);
    }
    public void area1(){
        int a=3,b=5;
        System.out.println(a*b);
        
    }
    public static void main(String[]args){
        MyClass o=new MyClass();
        o.area();
        o.area1();
    }
}
output
25
15
