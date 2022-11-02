/*
 * [다형성]
 * 부모의 참조 변수로 자식의 객체를 가리킴 (접근)
 * 부모의 멤버만 접근 가능 -> 자식의 멤버는 접근 불가능
 * 단, 오버라이딩된 메서드는 접근이 가능
 * 
 * << 문법 >> 
 * 부모자료형 참조변수 = new 자식자료형();
 * Product p = new Tv()
 * 
 */

package polymorphism;

class Parent {
	private int money = 1_000_000;

	public void spend(int money) {
		this.money -= money;
		System.out.println("남은 돈은 " + this.money + "입니다.");
	}

	void working() {
		System.out.println("부모님은 열심히 일하는 중입니다.");
	}

}

class Son extends Parent {
	public void study() {
		System.out.println("아들 : 공부 중...");
	}

	@Override
	public void spend(int money) {
		System.out.println("아들 : 학원비 " + money + "원 주세요!");
	}
}

class Daughter extends Parent {
	public void play() {
		System.out.println("딸 : 홍대에서 놀고 있습니다.");
		}
	
	@Override
	public void spend(int money) {
		System.out.println("딸 : 용돈 " + money + "원 주세요!");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Son son = new Son();
		son.working();
		son.study();
		son.spend(200_000);

		Daughter daughter = new Daughter();
		daughter.working();
		daughter.spend(500_000);
		
//		[다형성] 구현
//		Parent p = new Son();
		Parent p = son; // Parnet p = (Parent)son; 자식이 부모의 형으로 변환되야 할 때는 자동 형변환 (upcasting)
						// 자식 - > 부모 (upcasting)
		p.working();
		p.spend(900000);
		
//		Son s2 = p; // 가능하지만 자료형이 다른 경우 Son형 s2와 Parent형 p
					// 부모의 형을 자식의 형으로 변환해야 할 때는 강제 형변환을 해줘야 한다 (downcasting)
					// p의 객체의 주소가 Son의 주소이므로 가능한 경우인 것을 인지해야 함.
		
		Son s2 = (Son)p; 	// 부모 -> 자식 (downcasting)
							// 강제 형변환 
		
		
		
		Parent p2 = daughter;
		p2.spend(20000);
		
//		Parent p3 = new Cat();
		
		// 객체 배열 -----------------------------------------------------------------
//		Parent[] parent = new Parent[2];
//		parent[0] = new Son();
//		parent[1] = new Daughter();
		 
		Parent[] parent = {new Son(), new Daughter()};
		
		parent[0].spend(100);
		parent[1].spend(100);
		
		
	}

}
