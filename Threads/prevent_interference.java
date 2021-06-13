public class prevent_interference {
    public static void main(String[] args) throws InterruptedException {
        acc karthik = new acc(20000);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    karthik.withdraw_amount(10000);
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                karthik.deposit(7000);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(karthik.balance);
    }
}

class acc {
    public int balance;
    public acc(int a) {
        this.balance = a;
    }
    public synchronized void withdraw_amount(int with_amount) throws InterruptedException {
        System.out.println("Withdrawal");
        Thread.currentThread().sleep(5000);
        this.balance -= with_amount;
    }
    public synchronized void deposit(int deposit_amount) {
        System.out.println("Deposit");
        this.balance += deposit_amount;
    }
}