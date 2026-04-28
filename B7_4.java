public class B7_4{
	public static void main(String[] args){
		//コンストラクタによるオブジェクトの生成
		Educatee educatee1 = new Educatee("25AJ142","Yoshikazu Motojima");
		Educatee educatee2 = new Educatee("00AJ001","Russell Westbrook");
		//セッターでフィールド上の値に引数に代入された値を代入
		educatee1.setHeight(130);
		educatee2.setHeight(193);
		//ゲッターでオブジェクトの値を返し出力
		System.out.println(educatee1.getHeight());
		System.out.println(educatee2.getHeight());
	}
}