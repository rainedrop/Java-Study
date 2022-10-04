import java.util.Arrays;
import java.util.Scanner;

public class ArrayRest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			num[i] = num[i] % 42;	
		}
		System.out.println(Arrays.toString(num));
		}
	}


