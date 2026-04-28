import java.util.ArrayList;

public class CoinBox{
	private ArrayList<Value> arrayList = new ArrayList<Value>();
	public CoinBox(){
	}
	public void add(Value value){
		this.arrayList.add(value);
	}
	public Value remove(int number){
		int size = this.arrayList.size();
		for(int i = 0; i < size; i++){
			Value value = this.arrayList.get(i);
			if(value.getValue() == number){
				return this.arrayList.remove(i);
			}
		}
		return null;
	}
	public int getSum(){
		int sum = 0;
		int size = this.arrayList.size();
		for(int i = 0; i < size ; i++){
			Value value = this.arrayList.get(i);
			sum = sum + value.getValue();
		}
		return sum;
	}
	public void print(){
		int size = this.arrayList.size();
		for(int i = 0; i < size; i++){
			Value value = this.arrayList.get(i);
			System.out.println(value.getValue());
		}
	}
}