import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		int i, j, k;
		
		for (i = 1; i <= Num; i++) {
			for(j=0; j < Num; j++) {
				System.out.print(" ");
			}
			for(k=1; k<=Num; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
