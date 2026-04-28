import java.util.ArrayList;
public class Cup{
	private ArrayList<Castable> arrayList = new ArrayList<Castable>();
	
	public Cup(){
		
		}
	public void add(Castable dice){
		this.arrayList.add(dice);
	}
	public Castable get(int number){
		Castable dice = this.arrayList.get(number);
		return dice;
	}
	public int size(){
		int size = this.arrayList.size();
		return size;
	}
	public void cast(){
		int size = this.arrayList.size();
		for(int i = 0; i < size; i++){
			Castable dice = this.arrayList.get(i);
			dice.cast();
		}
	}
	public int getSum(){
		int size = this.arrayList.size();
		int sum = 0;
		for(int i = 0; i < size; i++){
			Castable dice = this.arrayList.get(i);
			sum = sum + dice.getValue();
	}
		return sum;
	}
	public int getValue(int number){
		Castable dice = this.arrayList.get(number);
		return dice.getValue();
	}
}