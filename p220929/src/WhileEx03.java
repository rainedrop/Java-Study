/*
 * 1. 무한 루프문 (반복문)
 * - 문법 : while(true)
 * - 좋다, 나쁘다의 개념으로 접근하는 것이 아니다
 * - 반드시, 반복문 내에 break를 명시
 * 
 * 2. break
 * - 반복문 내에서 조건문과 함께 사용됨
 * - 의미 : 반복문을 탈출
 * 
 */


public class WhileEx03 {

	public static void main(String[] args) {

		int idx = 1;		// 초기값
		
		// 무한 루프문 (반복문) 구현
		
		while (true) { 		// 조건식 -- > 무한 루프문
			System.out.println(idx);
			
			if ( idx == 3)	// 무한 루프문 구현 시 반드시 탈출 조건을 넣어야 한다.
				break;
			
			idx++;		// 증감식
		}
		System.out.println("<< 반복문 실행 종료 >>");
	}

}
