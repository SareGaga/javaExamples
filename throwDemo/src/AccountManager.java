public class AccountManager {
    private double balance;

    public void deposit(double amount){  //para yatırma
        balance = getBalance() + amount;
    }
    public void withdraw(double amount) throws BalanceInsufficentException {    // para çekme
        if(balance>=amount){

            balance = getBalance() - amount;

        }else{
           throw new BalanceInsufficentException("bakiye yetersiz");
        }
  ;
    }


    public double getBalance() { //hesaptaki parayı okumamızı sağlıyor.
        return balance;
    }
}
