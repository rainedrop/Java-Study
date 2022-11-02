import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cpuNum = (int)(Math.random() * 10 )+ 1;
		int userValue = 0, count = 0;
		
		while (true) {
			System.out.print("숫자 입력 : ");
			userValue = sc.nextInt();
			count++;
			if (userValue == cpuNum)
				break;
			else
				System.out.println(userValue > cpuNum ? "컴퓨터의 숫자가 더 작습니다" : "컴퓨터의 숫자가 더 큽니다"); 
		}
		System.out.println(count + "번만에 정답입니다.");
		sc.close();
	}

}
