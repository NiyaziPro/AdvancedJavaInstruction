package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {

        //Threadpool is used to do more work with fewer threads.
        ExecutorService service = Executors.newFixedThreadPool(3);

        Thread courier1 = new ThreadCreator("A",2000);
        Thread courier2 = new ThreadCreator("B",8000);
        Thread courier3 = new ThreadCreator("C",5000);
        Thread courier4 = new ThreadCreator("D",4000);
        Thread courier5 = new ThreadCreator("E",3000);
        Thread courier6 = new ThreadCreator("F",9000);
        Thread courier7 = new ThreadCreator("G",7000);
        Thread courier8 = new ThreadCreator("H",2000);
        Thread courier9 = new ThreadCreator("I",6000);

        /*courier1.start();
        courier2.start();
        courier3.start();
        courier4.start();
        courier5.start();
        courier6.start();
        courier7.start();
        courier8.start();
        courier9.start();*/

        service.execute(courier1);
        service.execute(courier2);
        service.execute(courier3);
        service.execute(courier4);
        service.execute(courier5);
        service.execute(courier6);
        service.execute(courier7);
        service.execute(courier8);
        service.execute(courier9);

        service.shutdown();// terminate the pool, otherwise threads will continue to wait in the pool.


    }
}

class ThreadCreator extends Thread{

    public String task;

    public int duration;

    //Constructor with parameters
    public ThreadCreator(String task, int duration) {
        this.task = task;
        this.duration = duration;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" \u001B[33mstarted work. Task :  "+this.task);
        System.out.println();
        //Our threads complete their work at different times.
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" \u001B[34mcompleted his work.");
        System.out.println();
    }
}
