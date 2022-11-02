package first;

public class AccessEx02 {

	// 멤버 변수
	AccessEx01 ac = new AccessEx01();
	
	void show() {
//		System.out.println(ac.one); 	// Error! - 접근권한이 private이라 클래스 내에서만 접근
		System.out.println(ac.two);		// default
		System.out.println(ac.three); 	// protected
		System.out.println(ac.four);	// public
	}

}
