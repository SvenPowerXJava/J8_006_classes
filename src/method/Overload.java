package method;

public class Overload {
	public static void main(String[] args) {
		OverloadDemo ob = new OverloadDemo();
		double result;
		int i = 88;
		
		
		ob.test();
		ob.test(10);
		ob.test(10,20);
		result = ob.test(123.25);
		System.out.println("result = " + result);
		System.out.println("\nВнутрение преобразование типа");
		ob.test(i);
		ob.test2(i);
	}
}
