package quiz;
class Caculator {
	int n1;
	int n2;
	
	public Caculator(int i, int j) {
		this.n1 = i;
		this.n2 = j;
	}
	
	void add() {
		System.out.println("덧셈 결과 >> " + (n1 + n2));
	}
	public void sub() {
		System.out.println("뺄셈 결과 >> " + (n1 - n2));
	}
	void mul() {
		System.out.println("곱셉 결과 >> " + (n1 * n2));
	}
	void div() {
		if (n2 != 0)
			System.out.println("나눗셈 결과 >> " + (n1 / n2));
		else 
			System.out.println("분모가 0으로 계산 불능입니다.");
	}
}

public class ObjectQuiz02 {
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
