package multithreading;

public class CreateThreadExtendingThread extends Thread{
	
	@Override
	public void run() {
        try {
            Thread.sleep(1000); // simulate some work
            System.out.println("Thread created extending thread class");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
 public static void main(String[] args) {
	 CreateThreadExtendingThread thr= new CreateThreadExtendingThread();
	 thr.start();
	 String name = thr.getName();
	 System.out.println(name);
	 
	 State state = thr.getState();
	 System.out.println(state);
	 
		boolean alive = thr.isAlive();
		System.out.println(alive);
}
}
