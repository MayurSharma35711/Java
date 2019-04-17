public class Main extends Date{
public static void main(String[] args){
	Date today = new Date();
	int day = 18;
	int month = 2;
	int year = 2018;
	today.setDate(day, month, year);
	System.out.println(today.toString());
	Time now = new Time();
	now.setTime(30,400,5000);
	System.out.println(now.toString());
}
}