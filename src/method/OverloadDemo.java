package method;

/**
 * Перегрузка методов
 */
public class OverloadDemo {
	void test() {
		System.out.println("    Параметры отсутствуют");
	}
	
	void test(int a) {
		System.out.println("    a = " + a);
	}
	
	void test(int a, int b) {
		System.out.println("    a = " + a + ", b = " + b );
	}
	
	double test(double a) {
		System.out.println("    a = " + a);
		return a * a;
	}
	double test2(double a) {
		System.out.println("    a = " + a);
		return a * a;
	}
	
}
