import java.util.Scanner;

public class SwitchQuiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result = 0;
		boolean printIs = true;
		// 1. 입력 부분 : 정수 2개 , 사칙연산 기호 1개
		
		System.out.print("정수 2개를 입력하시오. ");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		
		System.out.print("사칙연산(+,-,*,/) 중 하나를 입력하시오. ");
		String oper = sc.next();
		
		// 2. 스위치 부분
		
		switch (oper) { // 스위치의 입력변수는 정수여야 하지만 어차피 주소값(정수)를 받아오기 때문에 
						// String oper 또한 받을 수 있다. 해당 기능은 JAVA7에서 추가됨
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
			printIs = false;
			System.out.println("잘못된 연산자를 입력하셨군요");
		}
		
		// 3. 출력 부분
		if (printIs) 
		System.out.println(n1 + " " +  oper + " " + n2 + " = " + result);
	}

}
