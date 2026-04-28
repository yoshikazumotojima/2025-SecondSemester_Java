import java.util.ArrayList;
public class B7_6{
	public static void main(String[] args){
		//Educatee型の可変長リストarrayListの生成
		ArrayList<Educatee> arrayList = new ArrayList<Educatee>();
		//arrayListにaddメソッド内でインスタンス化によるコンストラクタによるオブジェクトの生成
		arrayList.add(new Educatee("00ID000","nakamura"));
		arrayList.add(new Educatee("00IW0E0","iimura"));
		//arrayListに入っているオブジェクトを番号指定し呼び出してEducatee型のeducateeに代入している
		Educatee educatee1 = arrayList.get(0);
		Educatee educatee2 = arrayList.get(1);
		//各オブジェクトにセッターでフィールドに文字列を代入
		educatee1.setPassword("pass1");
		educatee2.setPassword("pass2");
		//各オブジェクトにセッターで身長のint型のデータを代入
		educatee1.setHeight(170);
		educatee2.setHeight(175);
		//改行なしで各オブジェクトのインスタンス変数の情報を返し、出力
		System.out.print(educatee1.getId() + " ");
		System.out.print(educatee1.getName() + " ");
		System.out.print(educatee1.getPassword() + " ");
		System.out.println(educatee1.getHeight());
		
		System.out.print(educatee1.getId() + " ");
		System.out.print(educatee2.getName() + " ");
		System.out.print(educatee2.getPassword() + " ");
		System.out.println(educatee2.getHeight() + " ");
	}
}