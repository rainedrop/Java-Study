// Person 클래스 정의

class Person {
	// 멤버 변수
	int age;
	String name;
	String address;
	
	
	// 멤버 메서드
	// setter, getter -----------------------------
	// 멤버 변수 값 설정 : set변수명
	// 멤버 변수 값 리턴 : get변수명
	void setAge(int age) {
		this.age = age;
	}
	
	void setName(String name ) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void showAge() {
		// 지역 변수
//		int age = 100; // 멤버 변수가 아닌 지역 변수로 heap 영역에 생성될 수 없고 stack에 생성
		System.out.println("나이 >> " + age); // 지역 변수 age를 먼저 찾음
	}
	
	void showInfo() {
		System.out.println("this >> " + this);
	}
}

public class InstanceEx02 {

	
	public static void main(String[] args) {

		// 1. 참조변수 선언
		// 자료형 변수명;
		// 클래스명 참조변수;
		
		// 2. 객체 생성
		// new 클래스명(); -> heap 영역에 class를 할당하세요
		
		Person p1 = new Person();
		
		// 3. 멤버 접근
		// 3-1. 멤버 변수에 값 설정 
		// 참조 변수를 통한 멤버 변수 값 설정 (외부 접근) - > 객체지향에서 권장하지 않음!
		
		p1.setAge(35);		// 외부 접근을 통한 멤버 변수 값 설정
//		p1.name = "홍길동";
		
		// 3-2. 멤버 메서드 호출
		p1.showAge();
		
		p1.setName("박보검");
		System.out.println("이름 >> " + p1.getName());;
		
		// 4. 참조변수 p1과 this의 값 확인
		
		p1.showInfo();
		System.out.println(p1);
	}

}
