package threads;

// Wait-Notify : Provides communication between threads

/* Producer - Consumer
      Application for deposit and withdrawal transactions for a student's bank account
           If there is no money in the account, wait for the deposit (balance to increase).
           When the balance increases (when it is sufficient), the withdrawal will take place.
       */
public class WaitNotify {
    public static int balance = 0;

    //Deposit process
    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " wants to deposit money.");
        this.balance += amount;
        System.out.println("Deposit transaction successful, available balance: " + this.balance);
        notify(); // threads that are awaited with wait send notifications
    }

    //Withdrawal process
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " wants to withdraw money.");
        //Is the balance sufficient?
        if (balance == 0 || balance < amount) {
            System.out.println("Insufficient balance!!! Current balance: " + this.balance);
            System.out.println("Waiting for balance to update...");
            try {
                wait(); // temporarily releases the monitored object, until notified with notify
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //If the balance is sufficient
        if (balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawal transaction successful. Current balance: " + this.balance);
        }else {
            System.out.println("Insufficient balance!!! Current balance: " + this.balance);
            System.out.println("Waiting for balance to update...");
        }
    }


    public static void main(String[] args) {

        WaitNotify object = new WaitNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                object.withdraw(1000);
            }
        });
        thread1.setName("Student");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                object.deposit(2000);
            }
        });
        thread2.setName("Parent");
        thread2.start();


    }
}
