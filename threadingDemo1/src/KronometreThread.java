public class KronometreThread implements Runnable{ // runnable implement etmek zorundayız

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName=threadName;
        System.out.println("oluşturuluyor: "+threadName);
    }
    @Override
    public void run() { // threadimizin kendisidir.

        System.out.println("Çalıştırılıyor :"+threadName);  //burası değişkenlik gösteriyor aşağıdaki ve yukardaki kodlar standarttır.

            try {
                for (int i = 1; i < 10; i++) {
                    System.out.println(threadName + " : " + i);
                    Thread.sleep(1000); // Yukardakini yaz 1000 saniye bekle demek.
                }
            }catch (InterruptedException exception) {
                System.out.println("kesildi : "+threadName);
            }
            System.out.println("Thread bitti :"+threadName);
        }
        public void start(){
            System.out.println("Thread nesnesi oluşuyor.");
            if(thread==null){
                thread= new Thread(this,threadName);
                thread.start();
            }

    }

    }

