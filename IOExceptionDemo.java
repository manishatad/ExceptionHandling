import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExceptionDemo {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter first string");
        String str1=br.readLine();
        System.out.println(str1);
        br.close();
        System.out.println("enter second string");
        String str2=br.readLine();
        System.out.println(str1);

    }
    
}
