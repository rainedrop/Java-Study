import java.util.Scanner;

public class WhileQuiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result = 0, count = 0;
		
		// 1. 정수 입력 부분
		
		System.out.print("1부터 10까지의 정수 1개 입력 >> ");
		int num = sc.nextInt();
		
		// 2. 반복문 내에서 랜덤값 생성
		
		while (true) {
			count++;
			
			result = (int)(Math.random() * 10) + 1;
			System.out.print(result + " ");
			
			if (result == num)
				break;
		}
		
		// 3. 출력
		
		System.out.print("\n" + count + "회 실행해서 찾았다!");
		sc.close();
	}

}
