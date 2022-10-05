import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			int input = sc.nextInt();
			for (int j = 1; j <= input; j++) {
				System.out.print("=");
			}
			System.out.println();
		}
	}

}
