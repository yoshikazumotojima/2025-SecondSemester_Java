//25AJ142 本嶋義和

public class BurgerMain{
	public static void main(String[] args){
		Burger burger1 = new Burger("チーズバーガー", 250);
		Burger burger2 = new Burger("ダブルチーズバーガー", 500);
		System.out.println(burger1.getName());
		System.out.println(burger1.getPrice());
		burger1.print();
		burger2.print();
	}
}