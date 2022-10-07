import java.util.Scanner;

public class Quiz01Refac {

	public static int factorial (int userValue) { 	// 메서드의 바디 {}는 생략할 수 없음
		if (userValue == 1)
			return 1;
		return userValue * factorial(userValue - 1);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int userValue, result = 1;
		
		while (true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = sc.nextInt();
		if (userValue > 0 && userValue < 11)
			break;
		}
		
		System.out.println(userValue + "! : " + factorial(userValue));
		sc.close();
		
	}
	
}