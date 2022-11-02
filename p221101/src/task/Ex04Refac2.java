package task;

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
	private Product[] item = new Product[10];
	private int index = 0;

	int wSum = 0;
	String list = "";

	public void buy(Product p) {
		if (money < p.getPrice()) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		this.money -= p.getPrice();
		this.bonusPoint += p.getBonusPoint();
		item[index++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}

	public void summary() {
		int total = 0;
		String itemList = "";

		// [일반 for문]
//		for (int i = 0; i < item.length; i++) {
//			if (item[i] == null) 
//				break;
//			
//			itemList += item[i] + ", ";
//			total += item[i].getPrice();
//		}

		// [향상된 for문]
		for (Product p : item) {
			if (p == null)
				break;
//			itemList += p + ", ";
			itemList = itemList.concat(p.toString() + ", ");
			total += p.getPrice();
		}
		
		
		
		System.out.print("구매하신 제품은 " + itemList + " 입니다.");
		System.out.println("구매하신 물품의 총 금액은 " + total + "만원입니다.");

	}
}

public class Ex04Refac2 {
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
