//25AJ142 –{“ˆ‹`˜a
import java.util.ArrayList;

public class Coinroll_100 implements Value{
	private ArrayList<Coin100> arrayList = new ArrayList<Coin100>();
	
	public Coinroll_100(){
		for(int i = 0; i < 50; i++){
			arrayList.add(new Coin100());
		}
	}
	public int getValue(){
		int sum = 0;
		for(int i = 0; i < arrayList.size(); i++){
			Coin100 coin = this.arrayList.get(i);
			sum = sum + coin.getValue();
		}
		return sum;
	}
}