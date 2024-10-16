package threads;
/*
DeadLock: occurs when two or more threads want to access the same resource to work.
As a result of them constantly waiting for each other to access the resource,
system resources are negatively affected and even the application becomes unresponsive.
 */

public class DeadLock {
    public static void main(String[] args) {
        String sugar = "sugar";
        String coffee = "coffee";

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (coffee) {
                    System.out.println(Thread.currentThread().getName() + " uses " + coffee + "...");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " wants " + sugar);
                    synchronized (sugar) {
                        System.out.println(Thread.currentThread().getName() + " uses " + sugar + "...");
                    }
                }
                System.out.println(Thread.currentThread().getName() + " added hot water and sipped his coffee.");
            }
        });
        thread1.setName("Tom");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (sugar) {
                    System.out.println(Thread.currentThread().getName() + " uses " + sugar + "...");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " wants " + coffee);
                    synchronized (coffee) {
                        System.out.println(Thread.currentThread().getName() + " uses " + coffee + "...");
                    }
                }
                System.out.println(Thread.currentThread().getName() + " added hot water and sipped his coffee.");

            }
        });
        thread2.setName("Jerry");
        thread2.start();


    }
}
