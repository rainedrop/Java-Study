/*
 *  - 기능 : 인수로 양의 정수 2개를 받아, (정수 사이의) 누적합 계산 후 출력
 *  - 메서드명 : add, 매개변수 2개, 리턴값 없음
 */

public class MethodQuiz01Refac {
	
	public static void add(int n1, int n2) {
		int sum = 0, max = 0, min = 0;
//		
//		if(n1 < n2) {
//		for (int i = n1; i <= n2; i++) 
//			sum = sum + i;
//		} else 
//			for (int i = n2; i <= n1; i++) 
//				sum = sum + i;
		
		// 큰 값, 작은 값 찾기
		
		if (n1 > n2) {
			max = n1;
			min = n2;
		} else {
			max = n2;
			min = n1;
		}
		
		// 누적합
		for (int i = min; i <= max; i++) 
			sum = sum + i;
		System.out.printf("%d~%d의 누적 합 >> %d\n", min, max, sum);
	}

	public static void main(String[] args) {

		add(2,5);
		add(5,2);
	}

}
