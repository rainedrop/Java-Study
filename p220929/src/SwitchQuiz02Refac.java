import java.util.Scanner;

public class SwitchQuiz02Refac {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result = 0;
		boolean printIs = true;
		
		// 1. 입력 부분 : 정수 2개 , 사칙연산 기호 1개
		
		System.out.print("정수 2개를 입력하시오. ");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		
		System.out.print("사칙연산(+,-,*,/) 중 하나를 입력하시오. ");
		String oper = sc.next();
		
		// 2. if 부분
		
		if (oper.equals("+")) 
			result = n1 + n2;
		else if (oper.equals("-"))
			result = n1 - n2;
		else if (oper.equals("*"))
			result = n1 * n2;
		else if (oper.equals("/"))
			result = n1 / n2;
		else {
			System.out.println("잘못된 연산자를 입력하셨습니다");
			printIs = false;
		}
		
		// 3. 출력 부분
		
		if (printIs) 
		System.out.println(n1 + " " +  oper + " " + n2 + " = " + result);
	}

}