package task;

class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public void print() {
		Printer printer = Printer.getPrinter();
		printer.print(this.name + " print using " + printer.toString() + ".");
	}

}
class Printer {
	// 객체 생성
	private static Printer printer;		// class는 자료형이기 때문에 class 내에서 자신을 쓸 수 있다.		
	
	// 생성자
	private Printer() {}				
	
	// 생성된 멤버 객체 주소 리턴
	public static Printer getPrinter() {	// 객체가 먼저 생성되어야 객체를 사용하므로 static을 붙여야 한다.
		if (printer == null) {				
			printer = new Printer();		
		}
		return printer;						
	}
	
	// 프린터와 사용자의 정보 출력
	void print(String str) {	
		System.out.println(str);
	}
}

public class SingletonQuiz {
	public static void main(String[] args) {
		User[] user = new User[5];

		for (int i = 0; i < user.length; i++) {
			user[i] = new User((i + 1) + "-user");
			user[i].print();
		}

	}

}
