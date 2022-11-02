class Fruit {
	// -----------------------------------------
	// final 멤버변수 : 값 변경 금지, 변수 상수화
	// [ final 변수 ] --> 상수 (constant)
	// : 초기화한 값으로 고정 변경이 금지
	// : final , 변수는 이름이 모두 대문자
    // : final은 보통 생성자를 통해 초기화해준다.
	// -----------------------------------------
	// cf) 리터럴 (literal)
	// int num = 5; // 이름이 없음
	final int COUNT;		
	String sort;
	
	// 생성자
	Fruit(int count) {
		this.COUNT = count;
	};
	
	public int getCount() {
		return COUNT;
	}
//	public void setCount(int count) {
//		this.count = count;
//	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public void showInfo() {
		System.out.println(this.sort + "는 현재 " + this.COUNT + "개 있습니다.");
	}
}

public class VariableFinal {
	public static void main(String[] args) {
		
		Fruit apple = new Fruit(5000);
		apple.setSort("사과");
		final int count = 5000;
//		apple.setCount(5000);
		apple.showInfo();
		
		Fruit banana = new Fruit(10000);
		banana.setSort("바나나");
		banana.showInfo();
	}

}
