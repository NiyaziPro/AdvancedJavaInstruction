package threads;

public class Volatile01 {
    public static volatile int flag =0; // cache

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag==0){
                    System.out.println("It's just a risk. ");
                }
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            flag=1;
            System.out.println("flag=1 loop will stop");
        });

        thread2.start();

    }
}
