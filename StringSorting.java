import java.io.*;
public class StringSorting
{
    public static void main (String args[])throws IOException{
        int p=0;
        String [] names = new String [15];
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter 15 names");
        for(int i=0;i<15;i++){
            names[i]=br.readLine();
        }
        for(int k=0; k<15;k++){
            for(int j=0;j<14-p-1;j++){
                String a= names[j].toLowerCase();
                String c= names[j+1].toLowerCase();
               if(a.compareTo(c)>0){
                   String b=a;
                  names[j]=names[j+1];
                  names[j+1]=b;
                }
           }
         }
         System.out.println("The new list is:");
         for(int v=0;v<15;v++){
             System.out.println(names[v]);
          }
       }
     }
