package inter;

interface A {}
interface B {}
interface C extends A {}
interface D extends A, B {} // �������̽��� ��� ���� ��� ��� O

class E {}
class G extends E {}
// class H extends E, F {} // Error! Ŭ������ ���� ��� ��� X
// class I extends A {} // Ÿ���� �ٸ��� extends�� �� �� ����
class J implements A {}	// �ڷ����� �ٸ��� implements

class K extends E implements A, B {}	// Ŭ���� K�� Ŭ���� Ŭ���� E�� ���, �������̽� A�� B�� ���

// class L implements A extends E {} // Error! �̷� ����� ��� ���� Ÿ���� Ŭ������ ���� ���� �������̽��� ��� �Ѵ�.
class L extends E implements A {}

interface M implements E {}	// Error! �������̽��� Ŭ������ �θ�� �� �� ���� (��� �Ұ�)

public class Ex01 {
	public static void main(String[] args) {

		
	}

}
