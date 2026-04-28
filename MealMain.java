public class MealMain{
	public static void main(String[] args){
		Meal meal = new Meal();
		meal.addSideDish(new FriedFood("Ç†Ç∂", 200));
		meal.addSideDish(new MisoSoup("ñÏçÿ", 100));
		meal.print();
		System.out.println("çáåv" + meal.getTotalPrice() + "â~");
	}
}