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

class TvTest {

	public static void main(String[] args) {

		Tv t = new Tv();
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
	}

}
