import java.util.Scanner;

public class SwitchQuiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		System.out.print("정수 2개를 입력하시오.");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		
		System.out.print("사칙연산(+,-,*,/) 중 하나를 입력하시오.");
		String oper = sc.next();
		
		switch (oper) {
		case "+" : 
			result = n1 + n2;
			break;
		case "-" :
			result = n1 - n2;
			break;
		case "*" :
			result = n1 * n2;
			break;
		case "/" :
			result = n1 / n2;
			break;
		default :
			System.out.println("잘못된 사칙연산을 입력하셨군요");
			return;
		}
		
		System.out.println(n1 + " " +  oper + " " + n2 + " = " + result);
	}

}
