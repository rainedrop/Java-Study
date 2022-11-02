package exception;

import java.util.Scanner;

class NameLengthException extends Exception {
	String wrongName;

	public NameLengthException(String wrongName) {
		this.wrongName = wrongName;
	}

	String wrongShowname() {
		return this.wrongName;
	}
}

public class ExceptionQuiz {
	public static void main(String[] args) throws NameLengthException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();

			if (name.length() < 2) {
				try {
					throw new NameLengthException(name);
				} catch (NameLengthException n) {
					System.out.print("잘못된 이름 : ");
					System.out.println(n.wrongShowname());
					continue;
				}
			} else {
				System.out.println("입력받은 이름 : " + name);
				sc.close();
				break;
			}
		}
	}

}
