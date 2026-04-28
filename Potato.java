//25AJ142 本嶋義和
public class Potato implements Selection{
	private String size;
	private int price;
	
	public Potato(String size, int price){
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
		return this.size + "ポテト";
	}
	public void print(){
		System.out.println(getName() + getPrice() + "円");
	}
}