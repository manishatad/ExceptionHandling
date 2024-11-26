 class nullpointerexception {
    void fun(){
        System.out.println("in fun");
    }
    void gun(){
        System.out.println("In Gun");
    }
}
public class Client{
    public static void main(String[] args) {
        nullpointerexception obj=new nullpointerexception();
        obj.fun();
        obj=null;
        obj.gun();
    }
}
