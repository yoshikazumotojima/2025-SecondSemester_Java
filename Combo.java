//25AJ142 –{“ˆ‹`˜a
import java.util.ArrayList;
public class Combo{
	private Burger burger;
	private ArrayList<Selection> list = new ArrayList<Selection>();
	
	public Combo(){
	}
	public void setBurger(Burger burger){
		this.burger = burger;
		String food = this.burger.getName();
		int price = this.burger.getPrice();
		System.out.println(food + price + "‰~");
	}
	public void addSelection(Selection selection){
		this.list.add(selection);
	}
	public int getTotalPrice(){
		int size = list.size();
		int sum = 0;
		for(int i = 0; i<size; i++){
			Selection food = this.list.get(i);
			sum += food.getPrice();
		}
		return sum + this.burger.getPrice();
	}
	public void print(){
		int size = this.list.size();
		for(int i = 0;i < size; i++){
			Selection food = this.list.get(i);
			food.print();
		}
	}
}