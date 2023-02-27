import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=null;
        int total=0;
        try {
            //BufferReader classı dosya okumamızı sağlar
            reader= new BufferedReader(new FileReader("C:\\Users\\asus\\IdeaProjects\\readingFileDemo\\src\\sayilar.txt"));
            String line =null;
            while((line= reader.readLine())!= null){
                total += Integer.valueOf(line); // Değeri integera çevirdik

            }
            System.out.println("toplam ="+total);
        }
        catch (FileNotFoundException e) { // bu hatayı ele almamızı zorunlu tutuyor FileReader paketi
            throw new RuntimeException(e);
        }finally {
            reader.close();// bunu try catch içine alıcaksın almadın yukardaki gibi IOExceotion fırlatıcaksın
        }

    }

}