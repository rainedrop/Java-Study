import java.util.Scanner;

/*
 * [문] 사용자에게 정수 2개를 입력받은 후 큰 값을 출력
 *      삼항 연산자를 사용
 *      
 *      import 단축키 : Ctrl + Shift + O
 */

public class OperatorQuiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요 ");
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		int max = 0;
		
//		int max = ((n1 >= n2) ? n1 : n2);
		
		if (n1 >= n2)
			max = n1;
		else 
			max = n2;
		
		
		System.out.println("큰 값 >> " + max);
	}

}
