// num.10818

import java.util.Scanner;

public class ArrayMaxMin {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int n1 = sc.nextInt();
		int[] Arr = new int[n1];
		
		for (int i = 0; i < n1; i++) {
			Arr[i] = sc.nextInt();
		}
		
		int max = Arr[0];
		int min = Arr[0];
		
		for (int j = 1; j < Arr.length; j++) {
			if (Arr[j] > max) {
				max = Arr[j];
			} 
			if (Arr[j] < min) {
				min = Arr[j];
			}
			
		}
		
		System.out.print(min + " ");
		System.out.print(max);
		
	}

}
