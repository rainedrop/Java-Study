package chapter4;

public class ContinueExample {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		for (num = 1; num <= 100; num++) {
			if (num % 2 == 0) // num�� Ȧ���� ��
				continue; // �Ʒ��� �������� �ʰ� �ٽ� ���ư�
			total += num;
		}
		System.out.println("1���� 100������ Ȧ���� ����: " + total + "�Դϴ�");
	}

}
