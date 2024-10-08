package threads;

public class SynchronizedBlock {
    public static void main(String[] args) {
        //Task : We need to see this in 14 lines on the screen : [ [ [ [ [ ] ] ] ] ]

        Brackets brackets = new Brackets();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 7; i++) {
                    brackets.printBrackets();
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 7; i++) {
                    brackets.printBrackets();
                }
            }
        });

        long start = System.currentTimeMillis();

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long finish = System.currentTimeMillis();
        System.out.println("The passing time : "+(finish-start));

        //synchronized method : 35493
        //synchronized block : 17803

    }
}

class Brackets {

    //Since this method creates a pattern, the codes must run synchronously
    // only 1 thread should be able to access this method at the same time
    public /*synchronized*/ void printBrackets() {

        //If there is code that can work asynchronously in the method that the object calls,
        // we can only make the blog synchronous.

        synchronized (this) {
            for (int i = 1; i < 11; i++) {
                if (i < 6) {
                    System.out.print("[ ");
                } else {
                    System.out.print("] ");
                }

            }
            System.out.println("---> " + Thread.currentThread().getName());
        }

        //other codes that do not need to be synchronous
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //System.out.println(i + "-->" + Thread.currentThread().getName());

        }
    }


}