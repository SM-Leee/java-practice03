package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while( true ) {

			System.out.print( ">> " );
			String expression = scanner.nextLine();
			if(expression.equals("quit")) {
				break;
			}
			String[] tokens = expression.split(" ");
						
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);

			switch(tokens[1]) {
			case "+":
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(">> "+add.calculate());
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(">> "+sub.calculate());
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(">> "+mul.calculate());
				break;
			case "/":
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(">> "+div.calculate());
				break;
			default :
				System.out.println("다시입력해주세요. 정확한 수식이 아닙니다.");
				break;
			}

			/*  코드를 완성 합니다 */

		}
	}
}
