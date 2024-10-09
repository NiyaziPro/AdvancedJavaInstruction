package threads;

/* Producer - Consumer
      Application for deposit and withdrawal transactions for a student's bank account
           If there is no money in the account, wait for the deposit (balance to increase).
           When the balance increases (when it is sufficient), the withdrawal will take place.
       */

//In multithreading applications,
// if a thread needs to be run in order for another thread to continue,
// communication can be provided with wait/notify or wait/interrupt.
public class WaitInterrupt {

    public static int balance = 0;

    //Deposit process
    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " wants to deposit money.");
        this.balance += amount;
        System.out.println("Deposit transaction successful, available balance: " + this.balance);

    }

    //Withdrawal process
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " wants to withdraw money.");
        //Is the balance sufficient?
        if (balance == 0 || balance < amount) {
            System.out.println("Insufficient balance!!! Current balance: " + this.balance);
            System.out.println("Waiting for balance to update...");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("\u001B[31mBalance updated. Processing in progress...");
            }
        }

        //If the balance is sufficient
        if (balance >= amount) {
            this.balance -= amount;
            System.out.println("\u001B[32mWithdrawal transaction successful. Current balance: " + this.balance);
        }else {
            System.out.println("Insufficient balance!!! Current balance: " + this.balance);
            System.out.println("Waiting for balance to update...");
        }
    }


    public static void main(String[] args) {

        WaitInterrupt object = new WaitInterrupt();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                object.withdraw(1000);
            }
        });
        thread1.setName("Consumer");
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
                thread1.interrupt(); // Forcefully stops the waiting process of thread1
            }
        });
        thread2.setName("Producer");
        thread2.start();




    }
}
