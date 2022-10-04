import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		int i, j, k;
		
		for (i = 1; i <= Num; i++) {
			for (j = i-1; j <= Num; j++ ) {
				System.out.print("*");
			}
			for (k = Num; k > 0; k--) { 
				System.out.print(" ");
			}
			System.out.println("");
		}
		
	}

}
