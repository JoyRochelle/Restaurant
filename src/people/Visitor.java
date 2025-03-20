package people;

public class Visitor {
	private String name;
	Integer totalPrice = 0;

	public Visitor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showTotalPrice() {
		System.out.println(this.name + " Total Price: Rp." + this.totalPrice);
		
	}
	
	public void addTotalPrice(Integer price) {
		totalPrice += price;
	}
	
	
}
