package prob2;

public class Goods {
	private String name;
	private int price;
	private int amountOfStorage;
	
	public Goods(String name, int price, int amountOfStorage) {
		this.name = name;
		this.price = price;
		this.amountOfStorage = amountOfStorage;
	}
	
	public void show() {
		System.out.println(name+
							"(가격: "+price+"원)이 "+
							amountOfStorage+"개 입고 되었습니다.");
	}

}
