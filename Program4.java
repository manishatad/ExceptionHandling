import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Program4
 */
public class Program4 {

    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=10;
        int y=0;
        try{
            x=Integer.parseInt(br.readLine());
            y=Integer.parseInt(br.readLine());
            Thread.sleep(5000);
            System.out.println(x/y);
        }catch(IOException io){
            System.out.println("IOexception block");

        }catch(InterruptedException ir){
            System.out.println("interrupted exception");
        }
        catch(RuntimeException re){
            System.out.println("RUntimeException");
        }

        
    }
}