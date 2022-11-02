/*
 * [���� ���� / ���� ������ / ���� ���� ������]
 * private < default < protected < public
 * 
 * ��ӹ޴� �ڽ��� ���� ������ �ּ� ���ų�, �� �о�� �Ѵ� 
 * ex) �θ� public�̸� �ڽĵ� public�̿��� �Ѵ�.
 *
 * - �������̵� (overriding)
 * 	: �������̵��� �޼����� ���� ������ �θ� �޼����� ���� ���Ѻ��� ���ų� Ŀ�� �Ѵ�.
 */

class Parent {

	 public void clean() {
		System.out.println("�θ� >> �� û���մϴ�.");
	}
	
}

class Child extends Parent {
	@Override
	 public void clean() {
		System.out.println("�ڽ� >> �� �� û�Ҹ� �մϴ�.");
	}
}


public class OverridingMethod {
	public static void main(String[] args) {
		
		Child child = new Child();
		child.clean();
		
	}

}
