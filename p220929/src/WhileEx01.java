/*
 * [반복문]
 * 
 * 초기값 설정;
 * 
 * while (조건식) { // 조건이 true일 동안 반복
					// 처음으로 false가 되는 순간 탈출
 *  명령어;
 *  명령어;
 * }
 * 
 */


public class WhileEx01 {

	public static void main(String[] args) {

		int num = 1;
		
		num = 7;
		
		while ( num < 4) {
			System.out.println(num);
			num++;
		}
		System.out.println("반복문 실행 후의 num : " + num); // 4가 되어 반복문을 탈출했으므로 num은 4가 된다.
		System.out.println("<< 프로그램 종료 >>");
	}

}
