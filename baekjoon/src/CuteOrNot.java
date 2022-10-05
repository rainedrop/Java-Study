import java.util.Scanner;

public class CuteOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int cute = 0, notcute = 0;
		
		for (int i = 1; i <= num; i++) {
			int input = sc.nextInt();
			if (input == 1) {
				cute++;
			} else
				notcute++;
		}
		if (cute > notcute) {
			System.out.println("Junhee is cute!");
		} else {
			System.out.println("Junhee is not cute!");
		}
	}

}
