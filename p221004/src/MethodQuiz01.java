import java.util.Scanner;

public class MethodQuiz01 {

	public static void add (int n1, int n2) {
		int result = 0;
		int tmp;
		
		if (n1 > n2) {
			tmp = n2;
			n2 = n1;
			n1 = tmp;
		}
		
		for (int i = n1; i <= n2; i++) 
			result += i;
		System.out.println(result);
	}

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		add(n1, n2);

		sc.close();
	}

}
