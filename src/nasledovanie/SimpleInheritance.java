package nasledovanie;

public class SimpleInheritance {
	public static void main(String[] args) {
		A superOb = new A();
		B supOb = new B();
		
		//суперклас может использоватся самостоятельно
		superOb.i = 10;
//		superOb.j = 20;
		System.out.println("Содержимое объекта superOb:");
		superOb.showij();
		System.out.println();
		
		/*
		Подкласс имеет доступ ко всем открытым членм своего суперкласса.
		 */
		supOb.i = 7;
//		supOb.j = 8;
		supOb.k = 9;
		System.out.println("Содержимое объекта subOb: ");
		supOb.showij();
		supOb.showk();
		System.out.println();
		System.out.println(" Сумма i, j и k в обьекте subOb:");
		supOb.sum();
	}
}
