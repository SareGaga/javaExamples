public class Main {
    public static void main(String[] args) {

        try{

        int[] sayilar=new int[]{1,2,3};
        System.out.println(sayilar[5]);

        }
        catch (StringIndexOutOfBoundsException exception){

            System.out.println("hata oluştu  "+exception);
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }
        catch (Exception exception){
            System.out.println("Loglandı :"+exception);
        }
        finally { // ister try çalışsın ister catch finally bloğu her zaman çalışır
            System.out.println("ben her türlü çalışırım");

        }

    }
}