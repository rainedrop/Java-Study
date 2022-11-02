package polymorphism;

class Product {
	private int price;
	private int bonusPoint;

	Product(int price) {
		this.setPrice(price);
		setBonusPoint((int) (price / 10.0));
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer {
	private int money = 1000;
	private int bonusPoint = 0;
	int i = 0;
	
	int wSum = 0;
	String list = "";

	void buy(Product p) {
		if(money < p.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
//		money -= p.price;
//		bonusPoint += p.bonusPoint;
//		System.out.println(p + "을/를 구입하셨습니다.");

		// 멤버 필드 : 배열 - 길이 10으로 저장
		Product[] arr = new Product[10];

		// 구매한 가전 제품 정보가 저장
		arr[i] = p;
		i++;
		System.out.println(p + "을/를 구매하셨습니다.");
		
		this.money -= p.getPrice();
		this.bonusPoint += p.getBonusPoint();
		
		list += p + ", ";
		wSum += p.getPrice();
	}

	void summary() {
		System.out.println("구매한 제품은 >> " + list + "총 금액은 " + wSum + " 입니다.");
	}
}

public class Ex04Refac {
	public static void main(String[] args) {

		Buyer b = new Buyer();

		b.buy(new Tv()); // 1회용으로 사용할 때
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());

		b.summary();
//
//		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
//		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
	}

}
