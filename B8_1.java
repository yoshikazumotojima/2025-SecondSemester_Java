import java.util.ArrayList;
public class B8_1{
	public static void main(String[] args){
		ArrayList<Ball> list = new ArrayList<Ball>();
		for(int i = 0;i < 75; i++){
			list.add(new ConcreteBall(i + 1));
		}
		int size = list.size();
		for(int i = 0; i < size ;i++){
			Ball ball = list.get(i);
			int number = ball.getNumber();
			System.out.println(number);
		}
		//Ball ball1 = new ConcreteBall(1);
		//Ball ball2 = new ConcreteBall(2);
		//int number1 = ball1.getNumber();
		//int number2 = ball2.getNumber();
		//System.out.println(number1);
		//System.out.println(number2);
	}
}