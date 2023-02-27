// Parametreli(arguman) method
public class Main {
    public static void main(String[] args) {

        String mesaj ="Bugün hava çok güzel";
       String  yeniMesaj=mesaj.substring(0,2); // substring bir değer döndürüyor ve bunu bir şeye atamalyız.
       System.out.println(yeniMesaj);
       int sayi = topla(5,7); // void olmayan method olduğu için atama yapabildik.
        System.out.println(sayi);
        int toplam = topla2(2,2,8,9,5,3,4,7); // arka planda bunu diziye çeviriyor.
        System.out.println(toplam);
    }
    // void fonk bir şeye atanmaz.
    // örneğin : String mesaj = ekle() olmazz !! çünkü ekle methodu void ile oluşuruldu

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2){  // bu methodda voidi kullanmadık o yüzden return kullanmka zorundayız.
        // parantez içinde parametreleri belirttik.
        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){  // birden fazla parametre göndericek isek int in sonuna üç nokta konulur. Bunun adı variable arguments
        int toplam =0;
        for(int sayi:sayilar){
            toplam += sayi;
        }
        return  toplam;
    }
    public static String sehirVer(){
        return "Istanbul";
    }
}