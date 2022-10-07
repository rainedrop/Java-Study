import java.util.Scanner;

public class Quiz01Check {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int userValue = 0;
		
		// 1. 정수 1개 입력 - > 조건 검사
		
		do {
			System.out.println("1~10 사이의 정수 입력 >> ");
			userValue = sc.nextInt();
			
			Cat cat = new Cat();
			System.out.println("cat >> " + cat);
			
			int sum = 0;
			sum += userValue;
			System.out.println("sum >> " + sum);
		} while (userValue < 1 || userValue > 10);
		
		sc.close();
	}

}