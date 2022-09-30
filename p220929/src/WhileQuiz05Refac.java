import java.util.Scanner;

public class WhileQuiz05Refac {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int sum = 0;
		
		// 1. 반복문 : 입력 - > 누적합
		while (true) {
			
		// 1-1. 입력
			
			System.out.print("정수를 입력하시오 >> ");
			n1 = sc.nextInt();
			
		// 1-2. 탈출 조건
			
			if (n1 == -1)
				break;
			
		// 1-3. 누적 합
			
			sum += n1;
		}
		
		// 2. 누적합 출력
			System.out.println("누적합 >> " + sum);
	}

}
