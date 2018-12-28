package prob2;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;
	//final을 변수에서 넣어주면 더이상 바꿀수 없다. final을 이용하여 변수처럼 사용한다.
	public static void main(String[] args) {
		
		Goods[] arrayGoods = new Goods[COUNT_GOODS];
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<COUNT_GOODS;i++) {
			String line = scanner.nextLine();
			String[] tokens = line.split(" ");
			
			String name = tokens[0];
			int price = Integer.parseInt(tokens[1]);
			int amountOfStorage = Integer.parseInt(tokens[2]);
			arrayGoods[i] = new Goods(name, price, amountOfStorage);
		}
		
		for(int i=0;i<COUNT_GOODS;i++) {
			arrayGoods[i].show();
		}
	}
}
