import java.util.Arrays;

public class ArrayEx9 {

	public static void main(String[] args) {
		int[] code = { -4, -1, 3, 6 ,11 };
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			int tmp = (int)(Math.random() * code.length); // code.length == 5
														  // temp에는 0~4 범위의 임의의 정수 저장
			arr[i] = code[tmp];	// code[0~4의 임의의 값이 순서대로 arr 배열에 저장된다.
		}
		System.out.println(Arrays.toString(arr)); 
	}
}
