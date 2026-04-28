public class TokyoMain{
	public static void main(String[] args){
		for(int i = 0; i < 12; i++){
			int month = i + 1;
			int temperature = Tokyo.getTemperature(month);
			System.out.println(month + "ŒŽ" + temperature + "“x");
		}
	}
}