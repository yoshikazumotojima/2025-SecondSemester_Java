//25AJ142 本嶋義和
public class Drink implements Selection{
	private String size;
	private int price;
	
	public Drink(String size, int price){
		this.size = size;
		this.price = price;
	}
	public String getSize(){
		return this.size;
	}
	public int getPrice(){
		return this.price;
	}
	public String getName(){
		return this.size + "ドリンク";
	}
	public void print(){
		System.out.println(getName() + getPrice() + "円");
	}
}