package multithreading.version3;

public class DemoJoin {
	public static void main(String[] args) {
		NewThread ob1 = new NewThread("Один");
		NewThread ob2 = new NewThread("Два");
		NewThread ob3 = new NewThread("Три");
		
		System.out.println("Поток Один запущен: " + ob1.t.isAlive());
		System.out.println("Поток Два запущен: " + ob2.t.isAlive());
		System.out.println("Поток Три запущен: " + ob3.t.isAlive());
		
		try {
			System.out.println("Ожидание завершения потков.");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван");
		}
		System.out.println("Поток Один запущен?: " + ob1.t.isAlive());
		System.out.println("Поток Два запущен?: " + ob2.t.isAlive());
		System.out.println("Поток Три запущен?: " + ob3.t.isAlive());
		
		System.out.println("Главный поток завершен.");
	}
}
