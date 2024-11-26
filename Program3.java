import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program3 {
    void fun()throws InterruptedException,IOException{
        System.out.println("in fun");
    }
    public static void main(String[] args)throws InterruptedException,IOException {
        Program3 obj=new Program3();
        obj.fun();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        System.out.println(str);
    }
    
}
