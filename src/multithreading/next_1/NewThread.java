package multithreading.next_1;

public class NewThread implements Runnable {
	String name;
	Thread t;
	boolean suspendFlag;
	
	public NewThread(String name) {
		this.name = name;
		t = new Thread(this, name);
		System.out.println("Новый поток: " + t);
		suspendFlag = false;t.start();
	}
	
	@Override
	public void run() {
		try {
			for (int i = 15; i < 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(200);
				synchronized (this) {
					while (suspendFlag) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println(name + " прерван.");
		}
		System.out.println(name + " Завершен.");
	}
	synchronized void  mysuspend() {
		suspendFlag = true;
	}
	synchronized void myresume() {
		suspendFlag = false;
		notify();
	}
}
