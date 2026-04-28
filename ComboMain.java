//25AJ142 本嶋義和
public class ComboMain{
	public static void main(String[] args){
		Combo combo = new Combo();
		combo.setBurger(new Burger("ダブルチーズバーガー",500));
		combo.addSelection(new Drink("Tallサイズ", 450));
		combo.addSelection(new Potato("Mサイズ", 330));
		combo.print();
		System.out.println("合計" + combo.getTotalPrice() + "円");
	}
}