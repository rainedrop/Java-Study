import java.util.Scanner;

public class SwitchQuiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. 월 입력
		
		System.out.print("현재 월을 입력하세요 >>> ");
		int month = sc.nextInt();
		String season = "";
		
		// 2. 계절 구분
		
		switch (month) {
		case 3,4,5 : 
			season = "봄";
			break;
		case 6,7,8 :
			season = "여름";
			break;
		case 9,10,11 : 
			season = "가을";
			break;
		case 12,1,2 : 
			season = "겨울";
		}
		
		// 3. 출력 부분
		
		System.out.println("현재의 계절은 " + season + "입니다.");
	}

}
