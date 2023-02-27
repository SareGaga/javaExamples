//Exception oluşturduk.
public class BalanceInsufficentException extends Exception{
    String message;
    public BalanceInsufficentException(String message){
        this.message = message; // Yukardaki String message buradaki parametreli gönderilen message eşittir.

    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
