import java.util.ArrayList;
public class B3_5{
	public static void main(String[] args){
		ArrayList<Dice> diceBox = new ArrayList<Dice>();
		for(int i = 0 ; i < 10; i++){
			diceBox.add(new Dice());
		}
		
		int n = diceBox.size();
		
		for(int i = 0; i < n; i++){
			Dice dice = diceBox.get(i);
			dice.cast();
		}
		
		for(int i = 0; i < n; i++){
			Dice dice = diceBox.get(i);
			int value = dice.getValue();
			System.out.println(value);
		}
	}
}