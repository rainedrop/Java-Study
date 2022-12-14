
public class InstanceEx05 {
	
	// constructRobot 메서드 정의
	
	public static Robot constructRobot() {
		Robot robot = new Robot();
		robot.setProductYear(2000);
		robot.setProductName("옵티머스");
		
		return robot;
	}
	
	public static void main(String[] args) {

		Robot robot = constructRobot();
		System.out.println("로봇의 생산년도 >> " + robot.getProductYear()); // --> 2000
		System.out.println("로봇의 제품명 >> " + robot.getProductName()); // --> 옵티머스
		
		Robot copy = constructRobot();
		System.out.println("로봇의 생산년도 >> " + robot.getProductYear());
		System.out.println("로봇의 제품명 >> " + robot.getProductName());
		
		System.out.println("두 로봇이 같니? >> " + (robot == copy));
	}

}
