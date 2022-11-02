/*
 * [추상 클래스] abstract class
 * - 추상 클래스 내에 abstract method가 있을 수도 있고, 없을 수도 있음
 * - 추상 클래스는 객체 생성 불가능
 * - 다형성 또는 상속 사용
 * - public이나 default만 사용 가능
 *  
 * 
 * [추상 메서드] abstract method
 * - body가 없는 메서드 --> 미완성 메서드
 * - 반드시 추상 클래스 내에 존재
 * - 추상 메서드가 있는 추상 클래스를 상속 받은 자식 클래스는 반드시 추상 메서드를 오버라이딩 해야 함. --> (강제성)
 * 
 * 
 */


package abstractexample;

abstract class Parent {
	// 멤버 변수 - 인스턴스 변수
	int num;
	
	// 멤버 변수 - 스태틱 변수
	static int numTwo;
	
	// 추상 메서드	
	public abstract void methodOne();
//	public abstract static void methodFour();
	
	// 멤버 메서드 : instance method
	public void methodTwo() {
		System.out.println("일반 메서드 : methodTwo()");
	}
	
	// 멤버 메서드
	public static void methodThree() {
		System.out.println("static 메서드 : methodThree()");
	}
}

class Child extends Parent {
	@Override
	public void methodOne() {
		System.out.println("오버라이딩된 추상 메서드 : methodOne()");
	}
}

public class Ex01 {
	public static void main(String[] args) {

		// 1. 자식 클래스로 객체 생성
		Child c = new Child();
		c.methodOne();
		
		// 2. 추상 클래스로 객체 생성
		// 	  추상 클래스는 객체 생성을 할 수 없다. 미완성된 메서드를 포함하고 있기 때문
//		Parent p  = new Parent();

		// 3. 다형성
		Parent p = new Child();
		p.methodOne();
		p.methodTwo();
		Parent.methodThree();	// static은 Parent로 접근 가능
	}

}
