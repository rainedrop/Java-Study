/*
 * 클래스 하나에 객체를 오로지 하나만 생성
 * - 생성자의 접근 권한 : private
 * - 클래스 내에서 객체 생성 : 멤버 객체
 * - 멤버 메서드를 통해 생성된 객체의 주소를 리턴
 * 
 */

class Pattern {
	// 2. 멤버 변수를 통해서 객체 생성
	private static Pattern member = new Pattern();

	// 4. 멤버 변수 추가
	private int count;

	// 1. 생성자의 접근 권한이 private이여야 한다. - > 외부에서 객체 생성 불가능
	private Pattern() {
	}

	// 3. 멤버 메서드
		// 3-1. static(class, 정적) 메서드
	public static Pattern getPattern() {
		System.out.println("member >> " + member);
		return member;
	}

	// 4. 멤버 메서드 추가
		// 4-1. 멤버 변수 count값 설정
	public void setCount(int num) {
		this.count = num;
	}

	// 4-2. 멤버 변수 count 값 리턴
	public int getCount() {
		System.out.println("count >> " + this.count);
		return this.count;
	}
}

public class SingletonEx {
	public static void main(String[] args) {
//		1-1. Error!
//		Pattern p = new Pattern();
		
		Pattern p = Pattern.getPattern();
//		Printer p = Printer.getPrinter();
		System.out.println(p);
		
		p.setCount(100);
		System.out.println("p.getCount >> " + p.getCount());
		
		Pattern p2 = Pattern.getPattern();
		System.out.println("p2.getCount >> " + p2.getCount());
	}

}
