/*
 * [interface]
 *  : 추상 클래스보다 엄격해진 자료형
 *  : 추상 클래스의 업그레이드된 자료형
 *  : 객체 생성 불가능 -> 상속과 다형성으로 사용
 * 
 * - member field 
 * 	* public static final로 고정됨	=> constant (상수) (대문자로 쓰기!)
 *  
 * 
 * 
 * 
 * - member method
 *  * public abstract : 추상 메서드
 * 
 */




package inter;

interface Var {
	// public static final이 기본적으로 적용
	int num1 = 100;
	static int num2 = 200;
	final int num3 = 300;
	public static final int num4 = 400;
}

public class Ex02 {
	public static void main(String[] args) {

		// 객체 생성
		// Var v = new Var(); 	// Error! 인터페이스는 객체 생성을 할 수 없음.
		// Var.num2 = 2;		// Error! num2가 파이널 변수라고 나옴
		System.out.println(Var.num1);
		System.out.println(Var.num2);
		System.out.println(Var.num3);
		System.out.println(Var.num4);
		
	}

}
