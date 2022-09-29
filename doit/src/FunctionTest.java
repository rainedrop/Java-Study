import java.util.Scanner;

public class FunctionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int sum = add(num1, num2);
		System.out.println(num1 + "+" + num2 + " = " + sum + "입니다");
		
	}

	public static int add (int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
