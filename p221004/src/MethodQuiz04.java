import java.util.Scanner;

public class MethodQuiz04 {
	
	public static int factorial (int n1) {
		int result = 1;
		for (int i = 1; i <= n1; i++) {
			result *= result;
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		System.out.println(n1 + "! = " + factorial(n1));
		
		sc.close();
	}

}
