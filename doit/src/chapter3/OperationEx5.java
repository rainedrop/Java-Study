package chapter3;

public class OperationEx5 {

	public static void main(String[] args) {

		int num = 0B00000101;
		System.out.println(num << 2); // ��Ʈ������ 2ĭ�� 0B00010100 (20)
		System.out.println(num >> 2); // ��Ʈ������ 2ĭ�� 0B00000001 (1)
		System.out.println(num >>> 2); // ��Ʈ������ 2ĭ�� ��ȣ�� ������ 0 0B00000001 (1)
		
		System.out.println(num); // num�� ������ ���� �ƴϹǷ� �״�� 5 ���
		
		num = num << 2; // num�� ��Ʈ������ 2ĭ�� �̵� ����
		System.out.println(num); // 0B00010100; (20)
	}

}
