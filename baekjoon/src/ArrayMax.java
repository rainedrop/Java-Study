import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		int max = num[0];
		int count = 1;
		
		for (int i = 0; i < 9; i++) {
			num[i] = sc.nextInt();
		}
		for (int j = 0; j < 9; j++) {
			if ( max < num[j]) {
				max = num[j];
				count = j+1;
			}
		}
		System.out.println(max);
		System.out.println(count);
		
	}

}
