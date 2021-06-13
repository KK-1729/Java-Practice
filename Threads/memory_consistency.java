public class memory_consistency {
    public static void main(String[] args) throws InterruptedException {
        account karthik = new account(20000);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 50; i++) {
                    karthik.withdraw_amount(100);
                }
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i = 0; i < 50; i++) {
                    karthik.withdraw_amount(100);
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(karthik.balance);
    }
}

class account {
    public int balance;
    public account(int deposit) {
        this.balance = deposit;
    }
    public void withdraw_amount(int with_amount) {
        this.balance -= with_amount;
    }
}