package first_demo;

public class BoxDemo2 {
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;
		
		mybox1.with = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		mybox2.with = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		vol = mybox1.with * mybox1.height * mybox1.depth;
		System.out.println("Обьём первого vol = " + vol);
		
		vol = mybox2.with * mybox2.height * mybox2.depth;
		System.out.println("Обьём второго vol = " + vol);
	}
}
