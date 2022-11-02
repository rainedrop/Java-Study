
public class ArrayEx01 {

	public static void main(String[] args) {

		
		// 배열 생성과 동시에 초기화
		// int[][] arr = new int[][] {{2,4,6},{8,10}}; // 자바는 2차원 배열의 길이가 달라도 상관없다.
		
		int[][] arr = new int[2][]; // 2차원 배열 생성 시 행은 반드시 입력, 열은 입력하지 않아도 괜찮다.
		arr[0] = new int[] {2, 4, 6};
		arr[1] = new int[] {8,10};
		
		// 일반 for문을 사용하여 출력
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) 
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	} 

}
