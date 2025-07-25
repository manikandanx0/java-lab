import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String args[]) throws IOException{
        System.out.print("Enter a number: ");
        // int num = System.in.read();
        
        InputStreamReader in =  new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt( bf.readLine());
        System.out.println(num);
        
        bf.close();
    }
}