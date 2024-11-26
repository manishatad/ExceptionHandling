public class Program2 {
    static void fun(){
        System.out.println("start fun ");
        System.out.println(x/y);
        System.out.println("end fun");
    }
    static void gun(){
        System.out.println("start gun");
        System.out.println(x/y);
        Program2.fun();
    }
   
    public static void main(String[] args) {
        int x=10;
        int y=0;
        System.out.println("Start ");
        System.out.println(x/y);
        System.out.println("end code");
        Program2.gun();
    }
    
}
