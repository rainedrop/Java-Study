import java.util.Scanner;

public class SwitchQuiz03Refac {

	public static void main(String[] args) {

		// 1. 정수 1개 입력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력 > > ");
		int user = sc.nextInt();
		System.out.println("당신은 " + user + "입니다.");
		
		// 2. COM 랜덤값
		
		int com = (int)(Math.random() * 3) + 1;
		System.out.println("컴퓨터는 " + com + "입니다.");
		
		// 3. 비교 : 가위, 바위, 보
		
		switch (user - com) {
			case 1, -2 : System.out.println("당신이 이겼습니다.");
				 		 break;
			case 2, -1 : System.out.println("당신이 졌습니다.");
						 break;
			case 0 : System.out.println("비겼습니다.");
		}
		
		sc.close();
	}

}
