public class seat_availability {
    public static void main(String[] args) throws InterruptedException {
        CourseRegistration cr = new CourseRegistration();
        Thread t1 = new Thread((Runnable) () -> {
            try {
                cr.Register_seat();
            }
            catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread t2 = new Thread((Runnable) () -> {
            try {
                cr.Register_seat();
            }
            catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread t3 = new Thread((Runnable) () -> {
            try {
                cr.Allot_Seats(30);
            }
            catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        });

        Thread t4 = new Thread((Runnable) () -> {
            System.out.println("Seats available after alloting - " + cr.NumberOfSeats);
        });

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        t4.start();
    }
}

class CourseRegistration {
    public String CourseName;
    public String FacultyName;
    public int NumberOfSeats;

    CourseRegistration() {
        this.CourseName = "Java Programming";
        this.FacultyName = "Satish";
        this.NumberOfSeats = 0;
    }

    CourseRegistration(String a, String b, int c) {
        this.CourseName = a;
        this.FacultyName = b;
        this.NumberOfSeats = c;
    }

    public synchronized void Register_seat() throws InterruptedException {
        while(NumberOfSeats <= 0) {
            System.out.println(Thread.currentThread().getId() + " - waiting to register one seat");
            wait();
        }
        System.out.println(Thread.currentThread().getId() + " - registering one seat");
        NumberOfSeats -= 1;
    }

    public synchronized void Allot_Seats(int Seats) throws InterruptedException {
        System.out.println(Thread.currentThread().getId() + " - allocating " + Seats + " seats");
        NumberOfSeats = Seats;
        System.out.println("Notifying waiting processes");
        notifyAll();
    }
}