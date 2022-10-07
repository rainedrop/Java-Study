
public class ArrayEx02 {

	public static void main(String[] args) {

		// 1. 1차원 배열 생성
		// : 길이가 하나인 배열을 의미함.
		// : int형의 길이가 5인 배열 arr 생성
		int[] arr = new int[] {2, 4, 6, 8 , 10};
		// 자료형[] 배열명 = new 자료형[] {값1, 값2, ...};
		
		// 2. 2차원 배열 생성
		int[][] arr2 = new int[2][3]; // 앞의 길이가 행, 뒤의 길이가 열
		System.out.println("첫 번째 행의 첫 번째 열 >> " + arr2[0][0]);
		
		// cf) arr2 : 참조변수 - 행의 시작 주소
		// arr2 : 참조변수 - 행의 시작 주소
		// arr2[0] : 참조변수 - 첫 번째 1차원 배열의 시작 주소
		// arr2[1] : 참조변수 - 두 번째 1차원 배열의 시작 주소
		System.out.println("arr2 >> " + arr2);
		System.out.println("arr2[0] >> " + arr2[0]);
		System.out.println("arr2[1] >> " + arr2[1]);
		
		// 3. 2차원 배열의 값 설정
		arr2[0][0] = 2;
		arr2[0][1] = 4;
		arr2[0][2] = 6;
		arr2[1][0] = 8;
		arr2[1][1] = 10;
		arr2[1][2] = 12;
		
		
		// 4. 배열 요소의 값 출력
		// 4-1. 일반 for문
		for (int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		// 4-2. 향상된 for문
		System.out.println("\n<< 향상된 for문 >>");
		
		for (int[] i : arr2) {
			for(int j : i) {
				System.out.println(j);
				
				// for(자료형 변수명: 배열명)
				// 명령어;
			}
		}
	}

}
