import java.util.Scanner;

public class sapariWorld {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long n1 = sc.nextInt(), n2 = sc.nextInt();
		
		System.out.println(Math.abs(n1 - n2));
	}

}
