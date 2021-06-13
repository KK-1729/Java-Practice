public class notifyall {
    public static void main(String[] args) throws InterruptedException {
        bank_account karthik = new bank_account(20000);
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
                try {
                    karthik.withdraw_amount(70000);
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                karthik.deposit(50000);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println(karthik.balance);
    }
}

class bank_account {
    public int balance;
    public bank_account(int a) {
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
        System.out.println("Depositing " + Thread.currentThread().getId());
        this.balance += deposit_amount;
        System.out.println("Notifying " + Thread.currentThread().getId());
        notifyAll();
    }
}