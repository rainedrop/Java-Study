package exception;

import java.util.Scanner;

/*
 * [예외처리]
 * - try ~ catch ~ finally
 * - throws : 예외 전가 --> 호출한 메서드로 전가
 *
 * try {
 * 		예외 발생 가능한 코드
 * } catch (클래스명 참조변수) {		// catch는 여러 번 올 수 있음
 * 		예외가 발생했을 때 처리할 코드
 * } catch (클래스명 참조변수) {		
 * 		예외가 발생했을 때 처리할 코드
 * } finally {
 * 		예외 발생 여부와 상관 없이, 마지막에 실행되는 영역
 *		 		
 */

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("[main method] >> start");
		try {
		inputData();
		} catch(Exception e) {
			System.out.println("e.getMessage >> " + e.getMessage());
			System.out.println("예외 처리합니다.");
			e.printStackTrace();
		}
		System.out.println("[main method] >> end");

	}

	public static void inputData() throws ArithmeticException, Exception {
		System.out.println("=== inputData method ===> start");
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 두 개 입력 : ");

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

		int result1 = n1 / n2;
		int result2 = n1 % n2;
		System.out.println("몫 >> " + result1);
		System.out.println("나머지 >> " + result2);
		
		System.out.println("=== inputData method ===> end");
	}
}
