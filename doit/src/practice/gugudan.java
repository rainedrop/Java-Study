package practice;

import java.util.Scanner;


public class gugudan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j;
		if ((i > 9) || (i < 1)) {  // 1보다 작거나 9를 초과하는 수가 입력된 경우
			System.out.println("1~9까지만 입력해주세요"); // 메세지 출력
			return; // 구구단 실행되지 않음
		}
			System.out.println(i + "단"); // 단수 표시
		for (j=1; j<10; j++) { // 1부터 9까지 곱해준다
			System.out.println(i + "*" + j + "=" + i*j); // i단 * j = 값
		}
		
	}

}