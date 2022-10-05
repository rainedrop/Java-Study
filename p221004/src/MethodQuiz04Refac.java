
public class MethodQuiz04Refac {
//	[첫 번째 방법] 누적곱 : 반복문 구현
	
//	public static int factorial (int num) {
//		int factorial = 1;
//		
//		for (int i = 1; i <= num; i++) 
//			factorial *= i;
//		
//			return factorial;
//		}
	
//	[두 번째 방법] 재귀 호출, 재귀 메서드
	
	public static int factorial (int num) {
		if (num == 1)
			return 1;
		else
			return num * factorial(num - 1); // 메서드 안에서 자기 자신(메서드)을 호출
	}
	
	public static void main(String[] args) {

		System.out.println("5! = " + factorial(5));
	}

}
