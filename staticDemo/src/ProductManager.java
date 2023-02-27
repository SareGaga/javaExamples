public class ProductManager {
    public void add(Product product){

        if (ProductValidator.isValid(product)){ // ProductValidatorı static yapınca böyle çağırdık.
            System.out.println("Eklendi");

        }else{
            System.out.println("ürün bilgileri geçersizdir.");
        }



    }
}

// manager sınıfları static yapılmaz.
