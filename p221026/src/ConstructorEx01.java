/*
 * [생성자] constructor
 * << 생성자를 사용하는 이유 >>
 * - 객체를 생성하면서, 멤버변수를 초기화]
 * - 객체를 생성하면서, 원하는 기능(특정 멤버 메서드 호출)
 * 
 * - 객체 생성시, 무조건 하나의 생성자 호출 (실행)
 * - 생성자는 '메서드'이다. -> '메서드 오버로딩' 가능 -> 생성자는 여러 개 정의 가능
 * - 생성자는 반환값이 없다 -> 반환형을 명시하지 않아도 된다.
 * 
 * - cf) 메서드 오버로딩
 * 	   * 메서드명이 같고, 매개변수의 정보가 다르다.
 * 	   * (자료형, 개수)
 * 	   * 단, 반환형과는 관련이 없음.
 * 
 * - 생성자명은 클래스명과 같아야 한다. *
 * 
 * 	 << default constructor >>
 * - 생성자를 명시하지 않으면, 기본 생성자가 실행
 * - 매개변수가 없고, 하는 일도 없다. --> 형식상 실행
 * - 생성자가 하나라도 명시되어 있다면, 기본 생성자는 실행되지 않는다.
 * 
 * 
 */

class Cat {
	// 멤버 변수 : 인스턴스 변수(객체 변수)
	String name;
	
	//생성자
	public Cat() {				// 매개변수가 없는 생성자
		System.out.println("생성자 실행 됨");
	};
	
	public Cat(String name) {	// 매개변수가 1개인 생성자
		this.name = name;
	}

	// 멤버 메서드 : 인스턴스 메서드(객체 메서드)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class ConstructorEx01 {

	public static void main(String[] args) {
		// 객체(인스턴스 생성)
		Cat cat = new Cat("호랑이");
		cat.setName("나비");
		System.out.println("우리 집 고양이 이름 : " + cat.getName());
		
	}

}
