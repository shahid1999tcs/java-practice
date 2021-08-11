package threads;

public class Worker implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(9999);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
