package chapter3;

public class OperationEx2 {

	public static void main(String[] args) {

		int gameScore = 150; // ������ 150
		
		int lastScore1 = ++gameScore; // gameScore�� 1�� ���� ���� lastScore1�� ����
		System.out.println(lastScore1); // lastScore1 ���
		
		int lastScore2 = --gameScore; // gameScore(���� ���� ������ ���� 151)�� 1�� �� ���� lastScore2�� ����
		System.out.println(lastScore2); // lastScore2�� ���
	}

}
