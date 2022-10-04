import java.util.Scanner;

public class MethodEx07Refac {

	public static void main(String[] args) {

		int num = 5;
		
		num++;
		System.out.println(num);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1개 입력 >> ");
		int userValue = sc.nextInt();
		
		userValue++;
		System.out.println(userValue);
		
		int var = 10;
		
		var++;
		System.out.println(var);
		
		sc.close();
	}

}
