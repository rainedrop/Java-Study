package chapter4;

public class ContinueExample {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		for (num = 1; num <= 100; num++) {
			if (num % 2 == 0) // num이 홀수일 때
				continue; // 아래를 수행하지 않고 다시 돌아감
			total += num;
		}
		System.out.println("1부터 100까지의 홀수의 합은: " + total + "입니다");
	}

}
