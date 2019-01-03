package prob6.refactoring;

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

			String operater = tokens[1];
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);

			Arith arith = null;	//로컬 변수(지역변수)는 자동적으로 초기화되지 않으므로 최기화 시켜줘야됨.
			switch(operater) {
			case "+":
				arith = new Add();
				break;
			case "-":
				arith = new Sub();
				break;
			case "*":
				arith = new Mul();
				break;
			case "/":
				arith = new Div();
				break;
			default :
				break;			
			}
			if(arith==null) {
				System.out.println(">> 알수 없는 연산입니다.");
				continue;
			}
			arith.setValue(a,b);
			int result = arith.calculate();
			System.out.println(">> " + result);

			/*  코드를 완성 합니다 */

		}
	}
}
