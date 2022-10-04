/*
 * method : 메서드, 메소드
 *  - 기능, 동작
 *  - 정의 후 호출
 *  
 *  - 정의 형태 
 *  반환형 메서드명 (매개변수1, 매개변수2) {
 *  	명령어;
 *  	명령어;
 *  	return 값;
 *  }
 *  
 *  메서드명은 소문자로
 *  매개변수는 없어도 되지만 소괄호는 항상 있어야 한다.
 *  리턴은 리턴할 값이 없으면 아예 안써도 되며, 그럴 경우에 반환형에 void를 써준다.
 *  
 *  - 호출 형태
 *  메서드명 (값1, 값2) // 이 때, 매개변수의 갯수가 일치해야 한다.
 *  
 */

public class MethodEx01 {
	
	// 메서드 정의
	// 메서드 형태 : 매개변수 없음, 리턴값 없음
	public static void show() {
		System.out.println("show() 메서드 실행 : 시작");
		System.out.println("show() 메서드 실행됨");
		System.out.println("show() 메서드 실행 : 종료");
	}

	public static void main(String[] args) {
		System.out.println(">>> main() 메서드 실행 : 시작");
		// 메서드 호출	
		show();
		System.out.println(">>> main() 메서드 실행 : 종료");
	}

	// 메서드의 중괄호 앞 부분을 '선언부'라고 한다
	// 메서드의 중괄호를 '바디'라고 한다
}
