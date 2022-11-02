package exception;

public class Ex04 {
	public static void main(String[] args) throws InterruptedException {	// 자바의 JVM으로 전가

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);

			Thread.sleep(1000);
		}
	}
}
