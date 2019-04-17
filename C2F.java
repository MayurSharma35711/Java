import java.util.Scanner;

public class C2F{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Celcius: ");
		float c = in.nextFloat();
		float f = 9*c/5 +32;
		System.out.println("\nError: Does not understand\nDid you mean " + f + " degrees Fahrenheit?");
	}
}