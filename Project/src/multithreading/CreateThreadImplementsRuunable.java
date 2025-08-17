package multithreading;

public class CreateThreadImplementsRuunable implements Runnable {

	@Override
	public void run() {
		System.out.println("Create Thread Implementsing by Ruunable interface");
		
	}
	public static void main(String[] args) {
		CreateThreadImplementsRuunable task= new CreateThreadImplementsRuunable();
		 Thread thread = new Thread(task);
	        thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
	}

}
