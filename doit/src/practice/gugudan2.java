package practice;

public class gugudan2 {

	public static void main(String[] args) {
		int i;
		int j;
		for (i = 1; i < 10; i++) { // 1부터 9까지
			System.out.println(i + "단"); // 단수 표시
			for (j = 1; j < 10; j++) { // 1~9까지 곱해준다
				System.out.println(i + "X" + j + "=" + i * j); // 단수 * j = 값
			}
		}
		
	}

}