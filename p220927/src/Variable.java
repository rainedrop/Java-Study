
public class Variable {
	public static void main(String[] args) {	
		/*
		 * [변수]
		 * - 특정 값을 저장하기 위한 공간
		 * - 메모리 공간에 이름을 부여한 것 -> 이름을 통한 접근 (래퍼런스)
		 * - 변하는 값
		 * 
		 * - 변수명 규칙
		 * : 숫자로 시작할 수 없다 (에러 발생) -> 반드시 문자로 시작
		 * : 변수명의 길이에는 제한이 없다
		 * : 소문자로 시작하는 것이 코딩 컨벤션 ( 대문자는 보통 클래스명 )
		 * : 대소문자 구분
		 * : 사용 가능한 기호는 _(언더바)와 $(달러) 두 개만 허용 이외는 에러 발생
		 * : 용도가 정해진 예약어는 변수명으로 사용이 불가능하다
		 * 
		 * snake case : num_one
		 * camel case : numOne
		 * 
		 * [상수]
		 * - 변하지 않는 값
		 * - 기본 자료형을 사용
		 * - 정수형 상수 : int
		 * - 실수형 상수 : double
		 * 
		 * [접미사]
		 * - L : 정수형 상수 + L (int to long)
		 * - F : 실수형 상수 + F (double to float)
		 */
		
		
		// 변수 선언
		// 형태 : 자료형 변수명;
		int num;
		num = 5; // 초기화
		         // 대입 연산자 =
		
		// 권장 : 변수 선언과 동시에 초기화
		int var = 6;
		
		System.out.println("num >> " + num);
		System.out.println("var >> " + var);
		
		// 변수명 규칙
		
		// int 5num; // error! 숫자로 실행
		
		int b5um;
		int num_;
		int num$;
		
		// 변수명에서는 _(언더바), $(달러)만 사용이 가능하다 그 외에는 에러 발생
		
		int one;
		int One; // 자바는 대소문자를 구분하기 때문에 변수 one과 One은 다른 변수이다.
		
		// int float; !! error! 예약어를 이름으로 사용했기 때문에
		// 예약어 : 쓰임이 정해져 있는 단어로 변수명으로 사용할 수 없음.
		
		
	}
}
