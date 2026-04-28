public class B7_2{
	public static void main(String[] args){
		//コンストラクタの呼び出しによるオブジェクトの生成(生徒情報の入力)
		Educatee educatee1 = new Educatee("25AJ142", "Yoshikazu Motojima");
		//参照：educatee1を代入しているのでeducatee2はeducatee1の情報をそのまま使える
		//どちらのオブジェクトも一つの同じ生徒のオブジェクトを指示している状態
		Educatee educatee2 = educatee1;
		//educatee1のパスワードを00と指定。また、この時educatee2はeducatee1の情報を参照しているため、同じパスワードとなる
		educatee1.setPassword("00");
		//ゲッターで両オブジェクトのパスワードを返し、出力
		System.out.println(educatee1.getPassword());
		System.out.println(educatee2.getPassword());
	}
}