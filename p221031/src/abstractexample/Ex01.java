/*
 * [�߻� Ŭ����] abstract class
 * - �߻� Ŭ���� ���� abstract method�� ���� ���� �ְ�, ���� ���� ����
 * - �߻� Ŭ������ ��ü ���� �Ұ���
 * - ������ �Ǵ� ��� ���
 * - public�̳� default�� ��� ����
 *  
 * 
 * [�߻� �޼���] abstract method
 * - body�� ���� �޼��� --> �̿ϼ� �޼���
 * - �ݵ�� �߻� Ŭ���� ���� ����
 * - �߻� �޼��尡 �ִ� �߻� Ŭ������ ��� ���� �ڽ� Ŭ������ �ݵ�� �߻� �޼��带 �������̵� �ؾ� ��. --> (������)
 * 
 * 
 */


package abstractexample;

abstract class Parent {
	// ��� ���� - �ν��Ͻ� ����
	int num;
	
	// ��� ���� - ����ƽ ����
	static int numTwo;
	
	// �߻� �޼���	
	public abstract void methodOne();
//	public abstract static void methodFour();
	
	// ��� �޼��� : instance method
	public void methodTwo() {
		System.out.println("�Ϲ� �޼��� : methodTwo()");
	}
	
	// ��� �޼���
	public static void methodThree() {
		System.out.println("static �޼��� : methodThree()");
	}
}

class Child extends Parent {
	@Override
	public void methodOne() {
		System.out.println("�������̵��� �߻� �޼��� : methodOne()");
	}
}

public class Ex01 {
	public static void main(String[] args) {

		// 1. �ڽ� Ŭ������ ��ü ����
		Child c = new Child();
		c.methodOne();
		
		// 2. �߻� Ŭ������ ��ü ����
		// 	  �߻� Ŭ������ ��ü ������ �� �� ����. �̿ϼ��� �޼��带 �����ϰ� �ֱ� ����
//		Parent p  = new Parent();

		// 3. ������
		Parent p = new Child();
		p.methodOne();
		p.methodTwo();
		Parent.methodThree();	// static�� Parent�� ���� ����
	}

}
