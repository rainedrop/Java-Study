/*
 * [접근 권한 / 접근 제어자 / 접근 제어 지시자]
 * private < default < protected < public
 * 
 * 상속받는 자식의 접근 범위는 최소 같거나, 더 넓어야 한다 
 * ex) 부모가 public이면 자식도 public이여야 한다.
 *
 * - 오버라이딩 (overriding)
 * 	: 오버라이딩된 메서드의 접근 권한은 부모 메서드의 접근 권한보다 같거나 커야 한다.
 */

class Parent {

	 public void clean() {
		System.out.println("부모 >> 집 청소합니다.");
	}
	
}

class Child extends Parent {
	@Override
	 public void clean() {
		System.out.println("자식 >> 내 방 청소만 합니다.");
	}
}


public class OverridingMethod {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.clean();
		
	}

}
