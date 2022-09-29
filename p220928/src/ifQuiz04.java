import java.util.Scanner;

public class ifQuiz04 {

	public static void main(String[] args) {

		// 점수를 입력 받은 후  
		// 점수 범위 : 0 ~ 100
		// 학점 출력 : 90 ~ 100 , A
		//			   80 ~ 89 , B
		//			   70 ~ 79 , C
		//			   70 미만 , D
		
		// [출력 형태]
		// 당신의 학점은 A입니다.
		
		Scanner sc = new Scanner(System.in);
		char result;
		
		System.out.print("점수를 입력해주세요 ");
		int score = sc.nextInt();
		
		if (score < 0 || score > 100) { 
			System.out.println("올바른 점수값을 입력해주세요 (0 ~ 100)");
		return;
	    }
		
		if (score >= 90) 
			result = 'A';
		else if (score >= 80)
			result = 'B';
		else if (score >= 70)
			result = 'C';
		else 
			result = 'D';
		
		System.out.println("당신의 학점은 " + result + "입니다.");
	}

}
