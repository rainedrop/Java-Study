package second;

import first.AccessEx01;

public class AccessEx03 {
	// 멤버 변수
	AccessEx01 ac = new AccessEx01();
	
	// 멤버 메서드
	void show() {
		System.out.println(ac.one); 	// Error! - private이라 같은 클래스 내에서만 접근 가능
		System.out.println(ac.two); 	// Error! - default라 같은 패키지 내에서만 접근 가능
		System.out.println(ac.three);	// Error! - protected는 다른 패키지여도 접근은 가능하나 상속이여야 하기 때문에 에러
		System.out.println(ac.four);	// public은 접근 가능 
	}
}
