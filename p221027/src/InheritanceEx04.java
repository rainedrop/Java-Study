/*
 * final : 금지
 * - class	  : 상속 금지
 * - method	  : 오버라이딩 금지
 * - variable : 초기화한 값 고정 - > 값 변경 금지
 * 
 */


 class ParentFour {
	String address;
	
	public ParentFour() {};
	
	public ParentFour(String address) {
		this.address = address;
	}
	public void clean() {
		System.out.println("집 청소를 합니다.");
	}
	public void showInfo() {
		System.out.println("집 주소 : " + this.address);
	}
}

class ChildFour extends ParentFour {
	
	public ChildFour(String address) {
		super(address);
	}
	@Override // 어노테이션 annotation (컴파일러에게 명시, 컴파일러는 문법검사, 사용자: 시각적 정보)
	public void clean() {
		System.out.println("자식 >> 내 방만 청소합니다.");
	}
}


public class InheritanceEx04 {

	public static void main(String[] args) {

		ChildFour c = new ChildFour("서울 구로구");
		c.showInfo();
		c.clean();
	}

}
