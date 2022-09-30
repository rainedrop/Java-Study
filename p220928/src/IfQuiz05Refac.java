import java.util.Scanner;

public class IfQuiz05Refac {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. 점수 입력
		
		System.out.print("점수를 입력하세요 >> ");
		int score = sc.nextInt();
		char grade = ' ';
		char option = '0';
		
		if (score < 0 || score > 100) {
			System.out.print("올바른 점수 값을 입력해주세요 (0~100)");
			sc.close();
			return;
		}
		
		// 2. 학점 
		
		if (score % 10 >= 7 || score == 100) 
			option = '+';
		else if (score % 10 <= 3)
			option = '-';
		
		if (score >= 90) 
			grade = 'A';
		else if (score >= 80) 
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else {
			grade = 'F';
			option = ' ';
		}
		
		// 3. 출력 부분
		
		System.out.println("당신의 학점은 " + grade + option + "입니다.");
		sc.close();
	}

}
