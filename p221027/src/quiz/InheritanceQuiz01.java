package quiz;
class Fruit {
	//멤버 변수 - 인스턴스 변수
	int count;
	
	//멤버 메서드 - 인스턴스 메서드
	public void showCount() {
		System.out.println("현재 남은 개수는 " + this.count + "입니다.");
	}
	
	public void showInfo() {
		System.out.println("과일 정보를 출력하는 메서드입니다.");
	}
}

class Banana extends Fruit {
	
	public Banana(int i) {
		super.count = i;
	}

	public Banana() {}

	public void showInfo() {
		System.out.println("현재 과일은 바나나입니다.");
		System.out.println("바나나는 " + count + "개 있습니다.");
	}
}

public class InheritanceQuiz01 {

	public static void main(String[] args) {

		Banana bananaOne = new Banana();
		bananaOne.showInfo();
		
		Banana bananaTwo = new Banana(10);
		bananaTwo.showInfo();
	}

}
