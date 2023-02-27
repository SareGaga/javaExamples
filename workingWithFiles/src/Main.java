import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //createFile();
    //getFileInfo();
    readFile();
    writeFile();
    readFile();


    }
    public static void createFile(){
        File file = new File("C:\\Users\\asus\\IdeaProjects\\files\\students.txt"); // File classı var hazır ve java.io paketinden geliyor.
        try {
            if(file.createNewFile()) { // createnewfile otomatik try catche alıyor.
                System.out.println("Dosya oluşturuldu.");
            }else{
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\Users\\asus\\IdeaProjects\\files\\students.txt");
        if(file.exists()){ // dosya var mı
            System.out.println("Dosya adı "+file.getName()); //dosyanın ismini okuyoruz.
            System.out.println("Dosya yolu "+file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi: "+file.canWrite());
            System.out.println("Dosya adı: "+file.canRead());
            System.out.println("Dosya boyutu (byte): "+file.length());
        }

    }
    public static void readFile(){
        File file = new File("C:\\Users\\asus\\IdeaProjects\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file); // Scanner classını oluşturduk çünkü konsoldan bilgi almamızı sağlıyor.
            while(reader.hasNextLine()){  //hasnextLine okunacak satır varsa tek tek okuyor.
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close(); // dosyayı kapatmamız lazım !!!
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(){ // yazma fonk üstüne yazıyor ama aşağıdaki gibi true verirsek append çalışır ve üstüne yazmaz.
        try {
            // buffered java sınıfıdır dosyaları okuyan,yazan
            BufferedWriter writer = new BufferedWriter( new FileWriter("C:\\Users\\asus\\IdeaProjects\\files\\students.txt",true)); // true verdik
            writer.newLine(); // yeni satır oluştur
            writer.write("Ahmet");
            System.out.println("dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}