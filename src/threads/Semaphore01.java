package threads;

import java.util.concurrent.Semaphore;

/*
Semaphore allows us to allow n (2,3,4,5...) threads to access a common resource at the same time.

Synchronized allows only one thread to access a common resource (block/method) at a time.
 */
public class Semaphore01 {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(5);

        Thread car1 = new Car("Audi", 9000, semaphore);
        Thread car2 = new Car("Mercedes", 8000, semaphore);
        Thread car3 = new Car("Porsche", 4000, semaphore);
        Thread car4 = new Car("BMW", 7000, semaphore);
        Thread car5 = new Car("Volvo", 7000, semaphore);
        Thread car6 = new Car("Toyota", 9000, semaphore);
        Thread car7 = new Car("Honda", 2000, semaphore);
        Thread car8 = new Car("Volkswagen", 6000, semaphore);

        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();
        car6.start();
        car7.start();
        car8.start(); //There are 8 live threads, but only 5 threads can access the shared resource at the same time.


    }
}

class Car extends Thread {
    public String carName;
    public int duration;

    public Semaphore semaphore;

    // Constructor with parameters
    public Car(String carName, int duration, Semaphore semaphore) {
        this.carName = carName;
        this.duration = duration;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(this.carName + " \u001B[31mwants to park...");
        try {
            semaphore.acquire(); // Checks permission to access shared resource
            //common source start
            System.out.println("-->" + this.carName + " \u001B[32mentered the parking lot ==>");
            System.out.println("-->" + this.carName + " \u001B[33mwaiting in the parking lot");
            Thread.sleep(duration);
            System.out.println("<--" + this.carName + " \u001B[34mleaving the parking area.");
            //common source end
            semaphore.release(); //The permit is released, meaning the capacity number is increased.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}