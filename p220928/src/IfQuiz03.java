import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		if (n1 >= n2)
			System.out.println("큰 값 :" + n1 + ", " + "작은 값 : " + n2);
		else 
			System.out.println("큰 값 :" + n2 + ", " + "작은 값 : " + n1);
		sc.close();
	}

}
