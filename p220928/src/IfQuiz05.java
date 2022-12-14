import java.util.Scanner;

public class IfQuiz05 {

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
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 97)
				option = '+';
			else if (score >= 94)
				option = '0';
			else if (score >= 90)
				option = '-';
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 87)
				option = '+';
			else if (score >= 84)
				option = '0';
			else if (score >= 80)
				option = '-';
		} else if (score >= 70) {
			grade = 'C';
			if (score >= 77)
				option = '+';
			else if (score >= 74)
				option = '0';
			else if (score >= 70)
				option = '-';
		} else {
			grade = 'F';
			option = ' ';
		}
		
		
		System.out.println("당신의 학점은 " + grade + option + "입니다.");
		sc.close();
	}

}
