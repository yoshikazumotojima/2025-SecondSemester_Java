//25AJ142 –{“ˆ‹`˜a
public class Burger{
	private String name;
	private int price;
	
	public Burger(String name, int price){
		this.name = name;
		this.price = price;
	}
	public String getName(){
		return this.name;
	}
	public int getPrice(){
		return this.price;
	}
	public void print(){
		System.out.println(getName() + getPrice() + "‰~");
	}
}