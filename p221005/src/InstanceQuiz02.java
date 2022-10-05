

public class InstanceQuiz02 {

	public static class Customer {
		int id;
		String name;
		
		void setId(int id) {
			this.id = id;
		}
		void setName(String name) {
			this.name = name;
		}
		void showInfo() {
			System.out.println("ID : " + id + ", NAME : " + name);
		}
	}
	
	public static void main(String[] args) {

		Customer hong = new Customer();
		hong.setId(1);
		hong.setName("홍길동");
		hong.showInfo();
		
		Customer park = new Customer();
		park.setId(2);
		park.setName("박보검");
		park.showInfo();
	}

}
