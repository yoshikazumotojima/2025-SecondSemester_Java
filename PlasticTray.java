//25AJ142 –{“ˆ‹`˜a
import java.util.ArrayList;
public class PlasticTray{
	ArrayList<Strawberry> arrayList = new ArrayList<Strawberry>();
	public PlasticTray(){
	}
	public void put(Strawberry strawberry){
		this.arrayList.add(strawberry);
	}
	public Strawberry getStrawberry(int index){
		return this.arrayList.get(index);
	}
	public int getSize(){
		return this.arrayList.size();
	}
	public int getTotalWeight(){
		int sum = 0;
		int size = this.arrayList.size();
		for(int i = 0; i < size; i++){
			Strawberry strawberry = this.arrayList.get(i);
			sum = sum + strawberry.getWeight();
		}
		return sum;
	}
	public int getAverageWeight(){
		return this.getTotalWeight() / this.getSize();
	}
}