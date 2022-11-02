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

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("[main method] >> start");
		inputData();
		System.out.println("[main method] >> end");

	}

	public static void inputData() {
		System.out.println("=== inputData method ===> start");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("정수 두 개 입력 : ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		try {
			// 예외 발생 가능한 코드
			int result1 = n1 / n2;
			int result2 = n1 % n2;
			System.out.println("몫 >> " + result1);
			System.out.println("나머지 >> " + result2);
		} catch (ArrayIndexOutOfBoundsException e1) {
			// 예외가 발생했을 때 처리할 코드
			System.out.println("분모가 0으로 계산 불능!");
			System.out.println("e >> " + e1);
		} catch (Exception e2) {
			System.out.println("예외 발생");
		} finally {
			System.out.println("try~catch 구문의 마지막 실행 영역");
		}
		System.out.println("=== inputData method ===> end");
		sc.close();
	}
}
