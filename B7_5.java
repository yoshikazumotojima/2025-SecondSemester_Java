import java.util.ArrayList;//ライブラリの呼び出し。これがないとArrayListの使用が不可能
//可変長型のリスト。代入した分の長さのリストが生成できる
public class B7_5{
	public static void main(String[] args){
		//Educatee型のみをこのリストに入れることができる。<>内は型の指定
		//Educatee型の空の可変長educatee1リストの生成
		ArrayList<Educatee> arrayList = new ArrayList<Educatee>();
		//コンストラクタからのオブジェクトの生成
		Educatee educatee1 = new Educatee("00AJ00","Nakamura");
		//もともと用意されているメソッドのaddメソッドで用意したeducatee1リストに生成したオブジェクトの追加
		arrayList.add(educatee1);
		//セッターによる身長の値の設定
		educatee1.setHeight(170);
		//educatee2にarrayListの0番目の要素を呼び出して参照している
		Educatee educatee2 = arrayList.get(0);
		//educatee1とeducatee2が同じものであるかの判定
		boolean b = (educatee1 == educatee2);//参照先が一緒かどうかの判断
		System.out.println(b);//判定の出力
		//ゲッターにより身長の値を返し、出力している
		System.out.println(educatee1.getHeight());
		System.out.println(educatee2.getHeight());
	}
}