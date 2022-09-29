// Num.2440

import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i,j,k;
		
		for(i=N; i>0; i--) {
			for(j=i; j>0; j--) {
				System.out.print("*");
			}
			for(k=0; k<=N; k++) {
				System.out.print("");
			}
			System.out.println("");
			
		}
	}
}
