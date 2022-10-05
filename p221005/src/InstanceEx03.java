// Robot 클래스 정의

class Robot {
	// 멤버 변수 (객체 변수 (인스턴스 변수))
	
	int productYear;
	String productName;
	
	
	// 멤버 메서드
	// setter, getter 추가 : Alt + Shift + S --> R

	public int getProductYear() {
		return productYear;
	}
	public void setProductYear(int productYear) {
		this.productYear = productYear;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
//
//void setProductYear(int productYear) {
//	this.productYear = productYear;
//}
//
//void setProductName(String productName) {
//	this.productName = productName;
//}
//
//int getProductYear() {
//	return productYear;
//}
//
//String getProductName() {
//	return productName;
//}

}
public class InstanceEx03 {

	public static void main(String[] args) {

	Robot r1 = new Robot(); // 참조변수명 r1을 따와 r1 객체라고 부른다 (실제로는 이름 X)
	r1.setProductYear(2017);
	r1.setProductName("Emmet");
	System.out.println("r1의 생산연도 >> " + r1.getProductYear());
	System.out.println("r1의 제품명 >> " + r1.getProductName());
	
	Robot r2 = new Robot();
	r2.setProductYear(2022);
	r2.setProductName("HTML");
	System.out.println("r2의 생산연도 >> " + r2.getProductYear());
	System.out.println("r2의 제품명 >> " + r2.getProductName());
	
	new Robot().setProductYear(2032); // 생성하고 다시 사용하지 않을 때 많이 사용한다
	
	Robot r3 = r2; // 주소 복사 / 자바는 heap 영역에 생성된 객체를 다시 해제하지 않아도 알아서 지워준다.
	}

}
