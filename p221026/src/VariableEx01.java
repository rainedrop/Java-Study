/*
 * [변수 종류]
 *
 * - 지역 변수
 * 	 : 메서드 내 선언 -> 영역 내 선언 --> 해당 영역 내에서만 접근
 * 	 : 메모리 영역 - stack
 * 	 : 초기화를 하지 않으면, 쓰레기 값 저장
 * 	 : 변수가 선언된 영역을 벗어나면, 메모리 해제
 * 
 * - 멤버 변수 : 
 * 	 - 인스턴스 변수(객체 변수)  
 * 		: 선언 위치 - 클래스 내
 * 		: 메모리 영역 - heap
 * 		: 초기화를 하지 않으면, 0 또는 null 초기화
 * 		: 인스턴스(객체)가 소멸될 때, 메모리가 해제
 * 
 *   - static 변수(클래스 변수)  :
 *   	: 선언 위치 - 클래스 내
 *   	: 메모리 영역 - static
 *    	: 초기화를 하지 않으면, 0 또는 null 초기화
 *    	: 프로그램 종료 시, 메모리 해제
 *    
 *    			메모리 할당 시기 				메모리 해제 시기			메모리 영역
 *    --------------------------------------------------------------------------------------
 *    instant  객체가 생성이 될 때				객체가 소멸될 때				heap
 *    --------------------------------------------------------------------------------------
 *    static   class가 메모리에 load될 때		프로그램이 종료될 때			static
 *    --------------------------------------------------------------------------------------
 * 
 * - final 변수
 *   : 초기화한 값으로 변수의 값을 고정
 *   : 값 변경 시 에러  --> 값 변경 금지
 *   : cf) final - 금지 의미
 * 
 */

public class VariableEx01 {

	public static void main(String[] args) {
		
		// 지역 변수
		int num = 5;
		
		num += 1;
		System.out.println("num >> " + num);
		
		// final 변수
		final int var = 10;
		// var += 1;  // 값 변경 금지
		System.out.println("var >> " + var);
		
		final int one;
		one = 1;
		System.out.println("one >> " + one);
		
	}

}
