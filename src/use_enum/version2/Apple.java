package use_enum.version2;

public enum Apple {
	Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);
	private int price;
	
	Apple(int p){price = p;}
	Apple(){price = -1;}
	
	public int getPrice() {
		return price;
	}
}
