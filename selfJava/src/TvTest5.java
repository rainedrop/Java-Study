class Tv {
	// Tv의 속성(멤버변수)
	String color;
	boolean power;
	int channel;
	
	// Tv의 기능(메서드)
	void power() {power = !power; }	// Tv 전원
	void channelUp() { ++channel; } // 채널을 높이는 기능
	void channelDown() { --channel; } // 채널을 낮추는 기능
}

class TvTest5 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		// 같은 클래스로부터 생성되었을지더라도 각 인스턴스의 속성(멤버변수)는 서로 다른 값을 유지할 수 있으며,
		// 메서드의 내용은 모든 인스턴스에 대해 동일하다.
	}

}
