/*
		 * [조건문]
		 * 
		 * << 조건 1개>>
		 * if (조건식) {
		 *  조건이 true일 때, 실행할 명령어
		 * }
		 * 
		 * << 조건 2개>>
		 * if (조건식) {
		 *  조건이 true일 때, 실행할 명령어
		 * } else {
		 *  조건이 false일 때, 실행할 명령어
		 * }
		 * 
		 * << 조건 3개 이상>>
		 * if (조건식1) {
		 *  조건1이 true일 때, 실행할 명령어
		 *  } else if (조건식2) {
		 *  조건2가 true일 때, 실행할 명령어
		 *  } else {
		 *  위 조건을 만족하지 않는 나머지 모두
		 *  } 
		 */

public class IfEx01 {

	public static void main(String[] args) {

		int num = 5;
		
		// [조건 1개]
		if (num > 5) {
			System.out.println(num);
			System.out.println("if문 실행 완료");
		}
		System.out.println("<< 실행 완료 >>");
	}

}
