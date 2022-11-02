package quizRefac;

class Caculator {
	// 멤버 변수
	private int n1;		// 멤버 메서드를 통해서만 접근 가능하도록 private
	private int n2;
	
	// 생성자 (생성자는 기본적으로 public을 많이 쓴다)
	
	public Caculator(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	// 멤버 메서드 (외부에서의 접근을 허용하는 것이 일반적이므로 public)
	
	void add() {
		System.out.println("덧셈 결과 >> " + (this.n1 + this.n2));
	}
	public void sub() {
		System.out.println("뺄셈 결과 >> " + (this.n1 - this.n2));
	}
	void mul() {
		System.out.println("곱셉 결과 >> " + (this.n1 * this.n2));
	}
	void div() {
		if (n2 == 0) {
			System.out.println("분모가 0으로 계산 불능입니다.");
			return;
		} 
			System.out.println("나눗셈 결과 >> " + (this.n1 / this.n2));
	}
}

public class ObjectQuiz02Refac {
	public static void main(String[] args) {

		System.out.println("-- 첫번째 계산 --");
		Caculator firstCaculator = new Caculator(5, 2);
		firstCaculator.add();
		firstCaculator.sub();
		firstCaculator.mul();
		firstCaculator.div();
		
		System.out.println("\n-- 두번째 계산 --");
		Caculator secondCaculator = new Caculator(7,0);
		secondCaculator.add();
		secondCaculator.div();
	}

}
