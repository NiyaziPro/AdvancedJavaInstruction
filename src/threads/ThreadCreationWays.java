package threads;

public class ThreadCreationWays {
    public static void main(String[] args) {


        // In every Java program, 1 thread is started by default: main thread

        System.out.println("Current Thread : " + Thread.currentThread().getName());

        //1.Way
        Thread thread1 = new MyThread();
        //thread1.run(); Thread is not started !!!!!!!!
        thread1.start(); // Start thread, call run method
        thread1.setName("First Thread");

        //2.Way
        Runnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        thread2.setName("Second Thread");

        //2.Way : anonymous class

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Running Thread : " + Thread.currentThread().getName());
                System.out.println("Started thread3 prepared with Anonymous class.");
            }
        });
        thread3.start();
        thread3.setName("Thirth Thread");


    }
}

// There are ONLY 2 ways to create a thread
// 1.Way : with extend Thread class

class MyThread extends Thread {
    @Override
    public void run() {
        //The operations (codes) we want to perform in threads
        System.out.println("Running Thread : " + Thread.currentThread().getName());
        System.out.println("Mythread thread1 is running. GREAT :)");
    }
}

// 2.Way : with implements Runnable Interface

class MyRunnable implements Runnable {

    @Override
    public void run() {
        //The operations (codes) we want to perform in threads
        System.out.println("Running Thread : " + Thread.currentThread().getName());
        System.out.println("Started thread2 prepared with Runnable.");
    }
}