


public class ClassType {

	// ��� ����
	int num;
	
	// ������
	public ClassType (int num) {
		this.num = num;
	}
	
	// ��� �޼���
	public void showNum() {
		System.out.println("������� num >> " + this.num);
	}
	
	public static void main(String[] args) {
		ClassType type = new ClassType(5);
		type.showNum();
		
	}

}
