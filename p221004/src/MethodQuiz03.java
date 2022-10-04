import java.util.Scanner;

public class MethodQuiz03 {
	
	public static void devide (int n1, int n2) {
		if (n2 == 0) 
			System.out.println("분모가 0으로 계산 불능");
		else 
			System.out.println("나눗셈 결과 >> " + n1 / n2);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		devide(n1, n2);
		
		sc.close();
	}

}
