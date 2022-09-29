import java.util.Scanner;

public class WhileQuiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result = 0, count = 0;
		
		System.out.print("1부터 10까지의 정수 1개 입력 >> ");
		int num = sc.nextInt();
		
		while (true) {
			result = (int)(Math.random() * 10) + 1;
			System.out.print(result + " ");
			
			count++;
			
			if (result == num)
				break;
		}
		System.out.println("\n" + count + "회 실행해서 찾았다!");
	}

}
