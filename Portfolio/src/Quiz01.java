import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int userValue, result = 1;
		
		while (true) {
			System.out.print("1~10 사이의 정수 입력 : ");
			userValue = sc.nextInt();
		if (userValue > 0 && userValue < 11)
			break;
		}
		
		for (int i = 1; i <= userValue; i++)
			result *= i;
		System.out.println(userValue + "! : " + result);
		sc.close();
	}

}