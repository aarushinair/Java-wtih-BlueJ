import java.io.*;
public class Mirror
{
   public static void main(String args[])throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int l=0;
      System.out.println("Enter the array size");
      int nl=Integer.parseInt(br.readLine());
      if((nl>2)&&(nl<20)){
          l=nl;
        }
        else{
            System.out.println("ARRAY SIZE OUT OF BOUNDS");
        }
      int a1[][]=new int [l][l];
      int [][] arr=new int [l][l];
       System.out.println("Enter values for the array");
       for(int i=0;i<l;i++){
           for(int j=0;j<l;j++){ 
               a1[i][j]=Integer.parseInt(br.readLine());
                 }
        }
        
        System.out.println("The original array is:");
        for(int i=0;i<l;i++){
           for(int j=0;j<l;j++){
               System.out.print(a1[i][j]+"\t");
            }
            System.out.println();
        }
        
        for(int i=0;i<l;i++){
          for(int j=0;j<l;j++){
            arr[i][j]=a1[i][l-j-1];
            }
        }    
             System.out.println("The mirror array is:");
        for(int i=0;i<l;i++){
           for(int j=0;j<l;j++){
               System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
