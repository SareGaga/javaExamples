public class ProductValidator { // Ana class static olamıyor !!

    static{
        System.out.println("static yapıcı blok çalıştı.");
    }
    public ProductValidator(){ // constructor.
        System.out.println("yapıcı blok çalıştı."); // Constructorın çalışabilmesi için Bu claasın newlenmesi lazım !!!!!
    }
    public static boolean isValid(Product product){
        if(product.price>0&& !product.name.isEmpty()){
            return true;
        }else{
           return false;
        }
    }
    public void As(){

    }

    public static class BaskaBirClass{ // Classın içinde başka class oluşturduk. Ve buna İnner class deniliyor işte bu claasın önüne static yazabiliyoruz.

        public static void sil(){

        }

    }

}
// static olunca diğer classlarda newlemeden kullanabiliyoruz arkada nesnesi oluşuyor zaten. Ve uygulama bitinceye dek bellekten atılmıyor nesne
// c# da yapıcı blok staticde de çalışır.