import java.util.Scanner;

public class NestedLoopQuiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. 입력
		
		System.out.print("짝수 단은 0, 홀수 단은 1을 입력 : ");
		int userNum = sc.nextInt();
		int result = 0, i = 0, j = 0;
		
		// 2. 연산
		
		for (i = 2; i < 10; i++)
			for (j =1; j < 10; j++) {
				result = i * j;
				if ( userNum == 0 && i % 2 == 0 ) 
					System.out.println(i + " * " + j + " = " + result);
			    else if ( userNum == 1 && i % 2 != 0) 
					System.out.println(i + " * " + j + " = " + result);
			}
			sc.close();
	}

}
