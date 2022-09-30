
/*
 *  [반복문] for문
 *  
 *  for (초기값; 조건식; 증감식) {
 *  	명령어;
 *  }
 */

public class ForEx01 {

	public static void main(String[] args) {

		// [while문]
		int idx = 1; 	// 초기값
		
		while (idx < 3) { // 조건식
			System.out.println("idx >> " + idx);
			idx++;		// 증감식
		}
		
		System.out.println("");
		
		// [for문]
		for (idx = 1; idx < 3; idx++) {
			System.out.println("idx >> " + idx);
		}
	}

}
