package exception;

public class Ex03 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++ ) {
			System.out.println(i);
			
			try {
			Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("예외 발생");
			}
		}
		System.out.println("출력 완료");
		
	}

}
