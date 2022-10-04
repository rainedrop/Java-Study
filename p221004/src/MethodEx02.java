import java.util.Scanner;

public class MethodEx02 {
	
	/*
	 *  [ 메서드 정의 ]
	 *   메서드 형태 : 매개변수 있고, 리턴값 없음
	 *   기능 : 정수 1개를 받은 후, 1 증가된 값을 출력
	 */

	public static void increment (int num) { 		// 매개변수는 선언하는 형태여야 한다.
		num++;
		System.out.println("1 증가된 값 >> " + num);
	}
	
	// main 메서드 바깥이면 위나 아래나 상관없이 메서드 정의 가능
	// main 메서드 안에서는 에러 발생
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		increment(num);
	}

}
