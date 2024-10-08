package threads;

public class Multithreading02 {

    public static volatile int counter = 0;

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                CounterTicket.count();
            }
        });
        thread1.setName("Tom");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                CounterTicket.count();
            }
        });
        thread2.setName("Jerry");
        thread2.start();


    }
}

class CounterTicket {
    //In this method, threads must reach in order.
    public static synchronized void count() {
        for (int i = 1; i < 1001; i++) {
            Multithreading02.counter++; // 1-read;2-increase;3-assign
            System.out.println(Thread.currentThread().getName() + "---> counter : " + Multithreading02.counter);//2000
        }

    }
}