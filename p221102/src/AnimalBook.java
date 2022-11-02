import java.util.Scanner;
import book.*;

public class AnimalBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BookManager manager = new BookManager();

		while (true) {
			System.out.println("정보를 입력할까요? (Y/N) ... ");
			String input = sc.next();
			switch (input) {
				case "N", "n", "NO", "no":
					System.out.println("정보 입력을 종료합니다.");
					manager.showBook();
					sc.close();
					return;
				case "Y", "y", "YES", "yes":
					manager.inputData();
					break;
			}
		}

	}

}