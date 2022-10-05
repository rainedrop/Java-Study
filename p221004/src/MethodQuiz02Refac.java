
public class MethodQuiz02Refac {

	/*
	 * [메서드 정의]
	 * - 기능 : 정수 1개를 받아서 제곱값 출력
	 * 			출력 형태 : 2의 제곱은 4입니다.
	 * - 메서드명 : square, 매개변수 : 1개, 리턴값 : 없음
	 */
	
	public static void square (int num) {
//		System.out.println(num + "의 제곱은 " + (num * num));
		
		/*
		 * format : 형식
		 * 자료형 : 서식문자
		 * - 정수 : %d
		 * - 실수 : %f
		 * - 문자 : %c
		 * - 문자열 : %s
		 */
		
		System.out.printf("%d의 제곱은 %d\n", num, (num * num));
	}
	
	public static void main(String[] args) {
		square(2);
		square(5);
		
	}

}
