import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {

		// 1. Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		
		// 2-1. 문자열 입력 : next() 메서드 - 첫 번째 공백 전까지
		System.out.print("문자열 1개 입력 >> ");
		String s1 = input.next();	
		System.out.println("입력된 문자열 : " + s1);
		
		input.nextLine(); // 버퍼를 비워주는 역할
		
		// 2-2. 문자열 입력 : nextLine() 메서드 - 엔터 전까지
		System.out.print("문자열 1개 입력 >> ");
		String s2 = input.nextLine();
		System.out.println("입력된 문자열 : " + s2);
	}

}
