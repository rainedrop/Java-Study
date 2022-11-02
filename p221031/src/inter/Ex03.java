package inter;

interface Method {
	void one(); // 인터페이스에 오는 메서드는 기본적으로 추상 메서드(abstract method)이다 (바디 명시 불가)

	public abstract void two(); // 인터페이스의 클래스는 기본적으로 public abstract가 적용되어 있다.
	
	// default 메서드
	default void deaultMethod() {
		System.out.println("interface 내 default 멤버 메서드");
	}
	
	// static 메서드
	public static void staticMethod() {
		System.out.println("interface 내 static 멤버 메서드");
	}
}

class Sub implements Method {

	@Override
	public void one() {		
		System.out.println("Sub class : 오버라이딩된 메서드 one()");
	}

	@Override
	public void two() {
		System.out.println("Sub class : 오버라이딩된 메서드 two()" );
	}

}

public class Ex03 {
	public static void main(String[] args) {
		// 1. interface는 객체 생성 불가능
		// Method m = new Method();

		// 2. 다형성
		Method m = new Sub();
		m.one();
		m.two();
		m.deaultMethod();
//		m.staticMethod();
		Method.staticMethod();		// static은 바로 접근이 가능하다.
		
	}

}
