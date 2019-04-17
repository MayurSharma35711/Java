import java.util.Scanner;

public class F2C{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Fahrenheit: ");
		float f = in.nextFloat();
		float c = (f-32.0f)*5/9;
		System.out.println("\nAnd that would be " + c + " Celcius");
	}
}