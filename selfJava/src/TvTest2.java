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

class TvTest2 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t2 = t1; // t2가 참조하던 주소가 사라지고 t2 또한 t1의 주소값을 참조하게 된다.
		t1.channel = 7;
		System.out.println("t1의 channel값은 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
	}

}
