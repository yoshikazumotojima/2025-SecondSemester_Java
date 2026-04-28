import java.util.ArrayList;
public class EducateeList{//クラスの宣言
	private ArrayList<Educatee> arrayList = new ArrayList<Educatee>();
	//コンストラクタの設定
	public EducateeList(String Id, String name){
		//フィールドの値の設定、保存
		this,Id;
		this.name
	}
	public void add(Educatee educatee){
		this.arrayList.ad(educatee);
	}
	public Educatee get(int number){
		return this.arrayList.get(number);
	}
	public int getAverageHeight(){
		int sum = 0;
		int size = this.size();
		for(int i = 0; i < size; i++){
			Educatee educatee = this.get(i);
			sum += educatee.getHeight();
		}
		return sum / size;
	}
	public int size(){
		return this.arrayList.size();
	}
}