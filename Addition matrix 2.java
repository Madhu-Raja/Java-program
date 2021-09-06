public class Addition{
    public static void main(String args[]){
        int a[][]={{1,2},{2,1}};
        int b[][]={{2,2},{2,1}};
        int c[][]= new int[2][2];
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(c[i][j]+" ");
                
                
            }  
        System.out.println();
        }

    }
}
ouput
3 
4 

4 
2 
