package book;

import java.util.Scanner;

public class BookManager {

	Scanner sc = new Scanner(System.in);

	private final int MAX_CNT = 100;
	private int index = 0;
	AnimalInfo[] infoStorage = new AnimalInfo[MAX_CNT];

	public void inputData() {
		System.out.print("1. 이름 : ");
		String name = sc.next();
		System.out.print("2. 나이 : ");
		int age = sc.nextInt();
		System.out.println("데이터 입력이 완료되었습니다.\n");
		infoStorage[index++] = new AnimalInfo(name, age);
	}

	public void showBook() {
		System.out.println("<< 저장 목록 >>");
		for (AnimalInfo a: infoStorage) {
			if (a == null)
				break;
			a.showAnimalInfo();
			System.out.println("");
			sc.close();
		}
	}
}
