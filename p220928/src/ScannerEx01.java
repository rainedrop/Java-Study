import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {

		// 사용자로부터 값 입력 받기
		// 1. 객체 생성 : Scanner 객체 생성
		Scanner input = new Scanner(System.in);
		//(타입)(주소) (Scanner 객체 생성 부분)
		
		// 2. 정수 한 개 입력 받기
//		System.out.print("정수 한 개를 입력하세요... ");
//		int num = input.nextInt();
//		System.out.println("입력 값 >> " + num);
//		
//		System.out.println("정수 한 개를 입력하세요... ");
//		int num2 = input.nextInt();
//		System.out.println("입력 값 >> " + num2);
		
		// [형태 2] 연속된 값을 구분 : 엔터, 스페이스 바(공백), 탭 
		System.out.print("정수 두 개를 입력하세요... ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		System.out.println("입력된 정수 >> " + num1 + ", " + num2);
	}

}
