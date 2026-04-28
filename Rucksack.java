import java.util.ArrayList;

public class Rucksack{
	private ArrayList<Gum> arrayList = new ArrayList<Gum>();
	
	public Rucksack(){
	}
	public void add(Gum gum){
		arrayList.add(gum);
	}
	public int getSum(){
		int sum = 0;
		for(int i = 0; i < arrayList.size(); i++){
			Gum gum = this.arrayList.get(i);
			sum = sum + gum.getPrice();
		}
		return sum;
	}
	public void printItems(){
		int size = this.arrayList.size();
		for(int i = 0; i < arrayList.size(); i++){
			Gum gum = this.arrayList.get(i);
			System.out.print(gum.getItem() + " ");
			System.out.println(gum.getPrice() + "‰~");
			
		}
	}
}