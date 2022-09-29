import java.util.Scanner;

/*
 * [if문 사용]
 * 사용자에게 (서로 다른) 정수 2개를 입력받은 후,
 * 큰 값, 작은 값을 출력하시오.
 */

public class IfQuiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = 0, min = 0;
		
		System.out.print("정수 두 개를 입력해주세요. ");
		int num1 = sc.nextInt(), num2 = sc.nextInt();
		
		if (num1 >= num2 ) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		System.out.println("큰 값 >> " + max + ",  작은 값 >> " + min);	
	}

}