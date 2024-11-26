import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

class fileexceptiondemo{
    public static void main(String[] args)throws FileNotFoundException{
        File obj=new File("abc.txt");
        FileReader fr=new FileReader(obj);
    }
}