
public class NestedLoopQuiz01 {

	public static void main(String[] args) {

		int result, i, j;
		
		for (i = 2; i < 10; i++) {
			for (j = 1; j < 10; j++) {
				result = i * j;
				System.out.println(i + " * " + j + " = " + result);
			}
			System.out.println();
		}
	}

}
