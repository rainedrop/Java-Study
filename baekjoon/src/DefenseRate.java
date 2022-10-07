import java.util.Scanner;

public class DefenseRate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double def = sc.nextInt();
		double penetrate_rate = sc.nextInt();
		
		double result = 1;
		
		result = def - (def * penetrate_rate/100);
		
		System.out.println(result >= 100 ? 0 : 1);
		
		
	}

}
