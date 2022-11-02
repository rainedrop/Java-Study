


public class ClassType {

	// ¸â¹ö º¯¼ö
	int num;
	
	// »ý¼ºÀÚ
	public ClassType (int num) {
		this.num = num;
	}
	
	// ¸â¹ö ¸Þ¼­µå
	public void showNum() {
		System.out.println("¸â¹öº¯¼ö num >> " + this.num);
	}
	
	public static void main(String[] args) {
		ClassType type = new ClassType(5);
		type.showNum();
		
	}

}
