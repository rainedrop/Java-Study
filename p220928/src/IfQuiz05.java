import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 >> ");
		int score = sc.nextInt();
		String result;
		
		if (score < 0 || score > 100) {
			System.out.println("올바른 점수 값을 입력해주세요 (0~100)");
			return;
		}
		if (score >= 97) 
			result = "A+";
		else if (score >= 94) 
			result = "A0";
		else if (score >= 90)
			result = "A-";
		else if (score >= 87) 
			result = "B+";
		else if (score >= 84)
			result = "B0";
		else if (score >= 80)
			result = "B-";
		else if (score >= 77) 
			result = "C+";
		else if (score >= 74)
			result = "C0";
		else if (score >= 70)
			result = "C-";
		else 
			result = "F";
		
		System.out.println("당신의 학점은 " + result + "입니다.");
		sc.close();
	}

}
