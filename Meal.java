import java.util.ArrayList;
public class Meal{
	private ArrayList<SideDish> list = new ArrayList<SideDish>();
	
	public Meal(){
	}
	public void addSideDish(SideDish sideDish){
		this.list.add(sideDish);
	}
	public int getTotalPrice(){
		int size = list.size();
		int sum = 0;
		for(int i = 0;i < size; i++){
			SideDish dish = this.list.get(i);
			sum += dish.getPrice(); 
		}
		return sum;
	}
	public void print(){
		int size = this.list.size();
		for(int i = 0; i < size; i++){
			SideDish dish = this.list.get(i);
			dish.print();
		}
	}
}