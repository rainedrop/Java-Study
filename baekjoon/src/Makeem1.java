

import java.util.Scanner;

public class Makeem1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int count1 = 0, result = 0;
		
		while (num != 1) {
			if (num%3 == 0) {
				num = num/3;
				count1++;
			} else if (num%2 == 0) {
				num = num/2;
				count1++;
			} else {
				num -= 1;
				count1++;
			}
			
		}
		System.out.println(count);
		System.out.println("탈출");
	}

}
