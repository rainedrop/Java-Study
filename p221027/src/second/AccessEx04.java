package second;

import first.AccessEx01;

public class AccessEx04 extends AccessEx01 {
	
	void show() {
		System.out.println(one);		// Error! - 부모-자식 관계여도 private은 접근 불가능
		System.out.println(two);		// Error! - default는 같은 패키지에서만 접근 가능
		System.out.println(three);		// protected는 상속 관계라 외부에서도 접근 가능
		System.out.println(four);		// public은 접근 가능
	}
}
