package multithreading;

public class ThreadSynchronizationExample {
	public synchronized void m1(String name) {

		for (int i = 1; i <= 5; i++) {
            System.out.println(name + " prints: " + i);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
	}
}

class ExampleSych extends Thread {
	private ThreadSynchronizationExample ThreadSynchronizationExample;
	private String name;

	public ExampleSych(multithreading.ThreadSynchronizationExample threadSynchronizationExample, String name) {
		super();
		ThreadSynchronizationExample = threadSynchronizationExample;
		this.name = name;
	}

	@Override
	public void run() {
		ThreadSynchronizationExample.m1(name);
		
	}
}

class Main{
	public static void main(String[] args) {
		ThreadSynchronizationExample th= new ThreadSynchronizationExample();
		ExampleSych t1= new ExampleSych(th, "A");
		ExampleSych t2= new ExampleSych(th, "B");

		t1.start();
		t2.start();
	}
}
