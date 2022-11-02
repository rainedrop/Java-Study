
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
	private static Printer printer;		// 1개만 존재하는 객체 생성, static
	
	private Printer() {}				// 생성자 private으로 외부에서 객체 생성 금지
	
	static void print(String string) {	
		System.out.println(string);
	}

	public static Printer getPrinter() {	// Printer 반환 getPrinter()
		if (printer == null) {				// 만약 printer가 null일 때만 객체 생성
			printer = new Printer();		
		}
		return printer;						// 한 번 생성해놓은 인스턴스만 계속 반환 (값 동일)
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
