public class main{
  public int void oddDigitsum(int input){
    int r,sum=0;
    while(input>0){
      r=input%10;
      if(r%2==1){
        sum=sum+r;
      }
      input=input/10;
    }
    return sum;
  }
  public static void main(String args[]){
    main ob=ew main();
    ob.oddDigitsum(6);
  }
}
