class ParentTwo {
	String lastName;
	
	public ParentTwo() {};
	
	public ParentTwo(String lastName) {
		System.out.println("부모의 생성자 실행");
		this.lastName = lastName;
	}
}

class ChildTwo extends ParentTwo {
//	String lastName;
	
//	public ChildTwo(String lastName) {
//		super(); // 부모의 생성자 호출
//		super.lastName = lastName; // this로도 접근은 가능하지만, 의미를 확실하게 하려면 super
//		System.out.println("자식의 생성자 실행");
//	}
	
	// 부모의 생성자를 통해서, 멤버 lastName에 값 설정
	public ChildTwo(String lastName) {
		super(lastName);
	}
	
	// 생성자
	public ChildTwo() {
		System.out.println("자식의 매개변수가 없는 생성자 실행됨");
	}
	
	public void showInfo() {
		System.out.println("저는 " + this.lastName + "씨 입니다.");
	}
}

public class InheritanceEx02 {

	public static void main(String[] args) {
		ChildTwo c = new ChildTwo("홍");
		c.showInfo();
		
		ChildTwo c2 = new ChildTwo();
	}

}
