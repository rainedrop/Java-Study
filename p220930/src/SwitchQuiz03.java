import java.util.Scanner;

public class SwitchQuiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력 >> ");
		
		int userNum = sc.nextInt();
		System.out.println("당신은 " + userNum + "입니다.");
		
		int cpuNum = (int)(Math.random() * 3 + 1);
		System.out.println("컴은 " + cpuNum + "입니다.");
		
		if (userNum == 1) {
			switch (cpuNum) {
			case 1 : System.out.println("비겼습니다");
					 break;
			case 2 : System.out.println("당신은 졌습니다");
					 break;
			case 3 : System.out.println("당신은 이겼습니다");
			}
		}
		
		if (userNum == 2) {
			switch (cpuNum) {
			case 1 : System.out.println("당신은 이겼습니다");
					 break;
			case 2 : System.out.println("비겼습니다");
					 break;
			case 3 : System.out.println("당신은 졌습니다");
			}
		}
		

		if (userNum == 3) {
			switch (cpuNum) {
			case 1 : System.out.println("당신은 졌습니다");
					 break;
			case 2 : System.out.println("당신은 이겼습니다");
					 break;
			case 3 : System.out.println("비겼습니다");
			}
		}
		
		sc.close();
		
	}

}
