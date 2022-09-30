
public class NestedLoopEx01 {

	public static void main(String[] args) {

		// 중첩 for문
		outer: // outer라는 레이블로 빠져나가라는 것이 아니라 outer라는 레이블이 붙은 for문을 탈출하라는 의미
		for (int i = 0; i < 3; i++) {
			System.out.println("*** 바깥쪽 for문 " + (i+1) + "차 회전***");
			
			for (int j = 0; j < 3; j++) { 
				System.out.println("안쪽 for문 " + (j+1) + "차 회전");
			
				if ( i % 2 == 0)
					break outer; 
		}
			System.out.println();
		}
	}
}
