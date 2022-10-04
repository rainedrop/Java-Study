import java.util.Scanner;

public class MethodEx07 {

	public static void main(String[] args) {

		int num = 5;
		increment(num);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1개 입력 >> ");
		int userValue = sc.nextInt();
		increment(userValue);
		
		int var = 10;
		increment(var);
		
		sc.close();
	}		// end of method
	// [메서드 정의]
	
	public static void increment (int num) {
		num++;
		System.out.println(num);
	}
	
} // end of class
