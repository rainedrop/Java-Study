
public class OperatorEx01 {

	public static void main(String[] args) {

		// 변수 선언과 동시에 초기화
		//		int num1 = 5;
		//		int num2 = 3;
		int num1 = 5, num2 = 3;
		// int ex, float fo; // error! 자료형이 같은 타입만 동시에 선언할 수 있음
		
		/*
		 * [산술 연산자]
		 * 덧셈   :   +
		 * 뺄셈   :   -
		 * 곱셉   :   *
		 * 몫     :   /
		 * 나머지 :   %
		 * - > 짝수, 홀수, 일의 자리 수, 십의 자리 수 등을 구할 때
		 */
		
		System.out.println("덧셈 >> " + (num1 + num2));
		System.out.println(num1 + num2 + " >> 덧셈");
		System.out.println("뺄셈 >> " + (num1 - num2));
		System.out.println("곱셉 >> " + num1 * num2);
		System.out.println("몫 >> " + (num1 / num2));
		System.out.println("나머지 >> " + (num1 % num2));
	}

}
