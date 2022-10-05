/*
 * [클래스] class
 * - "클래스"는 "자료형"이다.
 * 참조형 (reference type)     
 * cf) 기본 자료형(primitive type) : int, float, double, ...
 * 
 * - 클래스명은 대문자로 시작 (숫자로 시작하면 Error)
 * - 클래스 내 멤버 : 변수, 메서드
 * 
 * - 객체(object), 인스턴스(instance) : 클래스로 생성된 구체화(실체화)된 대상
 * - 자바는 모든 객체를 heap 영역에 생성 - > 멤버도 heap 영역에 할당
 * - 객체는 heap 영역에 생성되면, 할당된 메모리 주소를 리턴(반환)
 * - 생성된 객체는 반드시 주소를 통해 접근
 * 
 * - 객체 생성 문법
 *  new 클래스명();
 *  
 *   - 참조변수 (래퍼런스 함수) 변수 선언 문법
 *	클래스명 변수명;
 *   
 */


// class 정의
class Student {
	
	// 멤버 변수
	
	int age;
	String name;
	
	// 멤버 메소드 (메서드)
	void study() {
		System.out.println("공부를 열심히 해요~!");
	}
}

public class InstanceEx01 {

	public static void main(String[] args) {
		// 변수 선언
		// 자료형 변수명;
		int num = 1;
		
		// 클래스 변수명;
		Student hong;		// hong은 주소값으로 저장되며 주소값은 정수이고 int이다 곧, hong은 4바이트를 차지하는 참조변수이다.
		// new 클래스명();
		hong = new Student();		// new는 연산자 , heap 영역에 생성(할당)
		
		// Student hong = new Student();
		// 클래스명 변수명 = new 클래스명();
		
		System.out.println("멤버변수 age의 초기값 >> " + hong.age); // '.' 접근 연산자 / hong.age = 주소.멤버변수
	
		hong.age = 25;
		System.out.println("멤버변수 age의 값 >> " + hong.age);
		
		// new Student();로도 가능은 하지만 주소값이 저장되지 않아 사용할 수가 없다.
		
		String str = null; // null은 찾아갈 메모리가 없다는 의미
		int var = 0;
		
		System.out.println("멤버변수 name의 초기값 >> " + hong.name); // name은 class라는 메서드를 가지고 만든 변수이기 때문에 참조 변수이며 초기값으로 null이 저장된다.
		
		// 멤버 메서드 study를 호출
		
		hong.study();
	}
	

}
