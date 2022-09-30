import java.util.Scanner;

public class SwitchQuiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char judge = ' ';
		
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력 >> ");
		
		int userNum = sc.nextInt();
		System.out.println("당신은 " + userNum + "입니다.");
		
		int cpuNum = (int)(Math.random() * 3 + 1);
		System.out.println("컴은 " + cpuNum + "입니다.");
		
		if (userNum == 1) {
			switch (cpuNum) {
			case 1 : judge = 'C';
					 break;
			case 2 : judge = 'B';
					 break;
			case 3 : judge = 'A';
			}
		}
		
		if (userNum == 2) {
			switch (cpuNum) {
			case 1 : judge = 'A';
					 break;
			case 2 : judge = 'C';
					 break;
			case 3 : judge = 'B';
			}
		}
		

		if (userNum == 3) {
			switch (cpuNum) {
			case 1 : judge = 'B';
					 break;
			case 2 : judge = 'A';
					 break;
			case 3 : judge = 'C';
			}
		}
		
		if (judge == 'A') {
			System.out.println("당신은 이겼습니다.");
		} else if (judge == 'B') {
			System.out.println("당신은 졌습니다.");
		} else if (judge == 'C') {
			System.out.println("당신은 비겼습니다.");
		}
		sc.close();
		
	}

}
