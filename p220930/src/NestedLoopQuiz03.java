
public class NestedLoopQuiz03 {

	public static void main(String[] args) {

		int i = 0, j = 0;
		
		for (i = 1; i < 4; i++) {		// 바깥쪽 행과 관련
			for (j = 1; j < 4; j++) {	// 안쪽 열과 관련
				if(i == j) {
					System.out.print(1);	
				} else 
					System.out.print(0);
			}
			System.out.println();
		}
		
	}

}
