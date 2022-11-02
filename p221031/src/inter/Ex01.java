package inter;

interface A {}
interface B {}
interface C extends A {}
interface D extends A, B {} // 인터페이스의 경우 다중 상속 허용 O

class E {}
class G extends E {}
// class H extends E, F {} // Error! 클래스는 다중 상속 허용 X
// class I extends A {} // 타입이 다르면 extends를 쓸 수 없음
class J implements A {}	// 자료형이 다르면 implements

class K extends E implements A, B {}	// 클래스 K가 클래스 클래스 E를 상속, 인터페이스 A와 B를 상속

// class L implements A extends E {} // Error! 이런 상속의 경우 같은 타입인 클래스를 먼저 쓰고 인터페이스를 써야 한다.
class L extends E implements A {}

interface M implements E {}	// Error! 인터페이스는 클래스를 부모로 둘 수 없다 (상속 불가)

public class Ex01 {
	public static void main(String[] args) {

		
	}

}
