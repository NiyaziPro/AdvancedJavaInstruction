package threads;

public class Multithreading01 {

    public static void main(String[] args) {


        //Let's count from one to ten
        long start = System.currentTimeMillis();
        Counter counter1 = new Counter("Mert");
        Counter counter2 = new Counter("Melek");
        counter1.count();
        counter2.count();

        long finish = System.currentTimeMillis();

        System.out.println("Time spent with the main thread : "+(finish-start)); // 10202

        System.out.println(">>>>>>>>>Multithreading<<<<<<<<<");
        long start2 = System.currentTimeMillis();
        Thread thread1 = new CounterThread("Denis");
        Thread thread2 = new CounterThread("Melek");
        thread1.start();
        thread2.start();

        //Main thread should wait until thread1 and thread2 finish their work
        try {
            thread1.join(); // Main thread waits until thread1 finishes its work.
            thread2.join(); // Main thread waits until thread2 finishes its work.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long finish2 = System.currentTimeMillis();

        System.out.println("Time spent with multithreading : "+(finish2-start2)); // 5080

    }


}

class Counter {
    public String name;

    public Counter(String name) {
        this.name = name;
    }

    public void count() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + "    " + this.name);

        }
    }
}

class CounterThread extends Thread{
    public String name;

    public CounterThread(String name){
        this.name = name;
    }


    public void count() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + "    " + this.name);

        }
    }

    @Override
    public void run() {
        count();
    }
}
