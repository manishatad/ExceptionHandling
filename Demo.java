public class Demo extends RuntimeException {
    public static void main(String[] args, Object str) {
        
        Demo(String str){
            Super(str);
        }
    }
}
    class Client{

        static void fun(){
            throw new Demo{"hello from demo"};
        }
        public static void main(String[] args) {
            fun();
        }
    }


