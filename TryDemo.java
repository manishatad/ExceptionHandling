import java.util.Scanner;

public class TryDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0;
        int y=0;
        try{
            x=sc.nextInt();
            y=sc.nextInt();
        }catch(Exception e){
            System.out.println("intput missmatch");

        }try {
            System.out.println(x/y);
        } catch (Exception er) {
            // TODO: handle exception
            System.out.println("zero divide error");
        }
        System.out.println("end main");
    }
    
}
