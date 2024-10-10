package threads;

import java.util.concurrent.CountDownLatch;

/*
When we want some threads to run before the main thread and other threads
and to continue where they left off after completing their work,
we can start a counter for the number of threads we want to give priority to
with the methods of the CountDownLatch class
and make the other threads(worker threads) wait until the counter reaches 0.
 */
public class CountDownLatch01 {
    public static void main(String[] args) {

        // TASK : The main thread and thread0 wait until the worker threads complete their work.
        System.out.println("\u001B[31mMain Thread started to work...");

        CountDownLatch latch = new CountDownLatch(3);
        System.out.println("\u001B[36mStart counter value : "+latch.getCount());


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " started work.");
                try {
                    latch.await();//Wait until worker threads complete their work
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " continues to work...");
                System.out.println(Thread.currentThread().getName() + " comleted his work.");

            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    latch.await();//Wait until worker threads complete their work
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " started work.");
                System.out.println(Thread.currentThread().getName() + " continues to work...");
                System.out.println(Thread.currentThread().getName() + " comleted his work.");

            }
        });
        thread2.start();

        WorkerThreads worker1 = new WorkerThreads("A", 5000, latch);
        WorkerThreads worker2 = new WorkerThreads("B", 7000, latch);
        WorkerThreads worker3 = new WorkerThreads("C", 3000, latch);
        worker1.start();
        worker2.start();
        worker3.start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\u001B[31mMain Thread continues to work...");


    }
}

class WorkerThreads extends Thread {
    public int duration;

    public CountDownLatch latch;

    //Constructor with parameters

    public WorkerThreads(String name, int duration, CountDownLatch latch) {
        super(name);
        this.duration = duration;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " \u001B[33mstarted work...");
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " \u001B[34mcompleted his work...");
        latch.countDown();
        System.out.println(latch.getCount());
    }
}