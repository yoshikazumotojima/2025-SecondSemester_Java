public class B10_1{
	public static void main(String[] args){
		MobileTelephone phone = new MobileTelephone();
		phone.addApplication(new Clock());
		phone.addApplication(new CurrentTimeClock());
		phone.addApplication(new MyApplication());
		phone.execute(2);
	}
}