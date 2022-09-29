import java.util.Scanner;

public class WhileQuiz05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int result = 0;
		
		while (true) {
			System.out.print("정수를 입력하시오(종료 : -1) >> ");
			int num = sc.nextInt();
			
			if(num == -1) 
				break;
			
			result += num;
		}
			System.out.println("총합 >> " + result);
	}

}
