public class wait_notify {
    public static void main(String[] args) throws InterruptedException {
        account_holder karthik = new account_holder(20000);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    karthik.withdraw_amount(30000);
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                karthik.deposit(50000);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(karthik.balance);
    }
}

class account_holder {
    public int balance;
    public account_holder(int a) {
        this.balance = a;
    }
    public synchronized void withdraw_amount(int with_amount) throws InterruptedException {
        System.out.println("Withdrawing " + Thread.currentThread().getId());
        while(with_amount > this.balance) {
            System.out.println("Thread on hold " + Thread.currentThread().getId());
            wait();
        }
        System.out.println("Withdrawal processing " + Thread.currentThread().getId());
        this.balance -= with_amount;
    }
    public synchronized void deposit(int deposit_amount) {
        System.out.println("Deposit " + Thread.currentThread().getId());
        this.balance += deposit_amount;
        System.out.println("Notifying " + Thread.currentThread().getId());
        notify();
    }
}