import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			 long OddOrEven = sc.nextInt();
			 if (OddOrEven % 2 == 0) {
				 System.out.println("even");
			 } else {
				 System.out.println("odd");
			 }
		}
		sc.close();
	}

}