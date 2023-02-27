
// built-in paketler javanın içinde var demek.

import matematik. *; // matmerik paketindeki tüm methoları import ettik
;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Adınız : ");

       String isim = scanner.nextLine(); // nextLine scanner sınıfının parametre olarak aldığı string değişkeninde ilk cümleden sonra satır altı verip olup olmadığını kontrol etmke için kullanılan fonk

       System.out.println("merhaba "+isim);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2,6);
        Logaritma logaritma = new Logaritma();

    }
}