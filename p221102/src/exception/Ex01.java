package exception;

import java.util.Scanner;

class Check extends Exception {
	int num;
	
	public Check(int num) {
		super("Error! 음수 값 입력");
		this.num = num;
	}
	public Check(String message) {
	}
	
}

public class Ex01 {
	public static void main(String[] args) throws Check {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요... ");	
		int userValue = sc.nextInt();
		sc.close();
		
		if (userValue < 0) {
			try {
				throw new Check(userValue);            // 예외 객체를 생성, 발생 -> throw (s)없음 <-> 전가는 throws
			} catch (Check c) {
//				System.out.println(c);
				System.out.println(c.getMessage());
				c.printStackTrace();	// 스택에 있는 에러 메세지 출력 (빨강)
				return;
			}
		}
		
		System.out.println("입력된 값 >> " + userValue);
		
		
	}

}
