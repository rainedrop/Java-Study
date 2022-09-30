
public class NestedLoopQuiz02 {

	public static void main(String[] args) {

		int result = 0, i = 2, j = 1;
		
		while (i < 10) {
			while (j < 10) {
				result = i * j;
				System.out.println(i + " * " + j + " = " + result);
				j++;
			}

			System.out.println();
			j = 1;
			i++;
		}
	}

}
