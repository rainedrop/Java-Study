
public class WhileQuiz03 {

	public static void main(String[] args) {

		int num = 1, result = 0;
		
		while (num <= 10) {
			result += num;
			num++;
		}
		System.out.println("1~10까지의 합은 " + result);
	}

}
