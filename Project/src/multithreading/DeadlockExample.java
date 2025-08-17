package multithreading;

public class DeadlockExample {
    static final Object resource1 = "Printer"; // First resource
    static final Object resource2 = "Scanner"; // Second resource

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1 (Printer)");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2 (Scanner)");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 2 (Scanner)");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource 1 (Printer)");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
