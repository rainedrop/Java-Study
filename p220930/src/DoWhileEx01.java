
/*
 * [반복문] do~while문 
 * 
 * do {
 * 	명령어;
 *  명령어;
 * } while (조건식);
 * 
 * - 조건에 상관없이 반복문 처음 한번은 꼭 실행하고자 할 때
 * 
 */

public class DoWhileEx01 {

	public static void main(String[] args) {

		int idx = 10;
		
		// [while문]
		
		while (idx < 10 ) {
			System.out.println("idx >> " + idx);
			idx++;
		}
		
		// [do~while문]
		
		  do {
			System.out.println("idx >> " + idx);
			idx++;
		} while (idx < 13 );
	}

}
