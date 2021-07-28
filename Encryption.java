import java.io.*;
import java.lang.*;
public class Encryption
{
  String message;
  String EncMsg;
  Encryption(){
      message="";
      EncMsg="";
     }
  void readMessage() throws IOException{
      BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
      System.out.println("Enter a word");
      message=br.readLine();
    }   
    String rot13(String s){
        int l=s.length();
        char c[]=new char[l];
        for (int i=0;i<l;i++){
            c[i]=s.charAt(i);
            int v=(int)c[i];
                if (v>=110){
                v=v-13;
            }
            else{
                v=v+13;
            }
            c[i]=(char)v;
        }
        s="";
        for(int i=0;i<l;i++){
            s=s+c[i];
        }
        return s;
    }
    void encrypt(){
        EncMsg=rot13(message);
    }
    void display (){
        System.out.println("The original string:\t"+message);
        System.out.println("The encrypted string:\t"+EncMsg);
    }
    public static void main (String args[]) throws IOException{
        Encryption ob=new Encryption ();
        ob.readMessage();
        ob.encrypt();
        ob.display();
    }
}
