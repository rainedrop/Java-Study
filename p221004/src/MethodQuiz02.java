import java.util.Scanner;

public class MethodQuiz02 {
	
	public static void square (int n1) {
		System.out.println(n1 + "의 제곱은 " + (n1 * n1) + "입니다.");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		square(n1);
		
		sc.close();
	}

}
