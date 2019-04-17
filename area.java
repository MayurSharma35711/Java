import java.io.File;
import java.util.Scanner;

public class area{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter diameter: ");
		float d = in.nextFloat();
		float area = d*d*(float)Math.PI/4;
		float c = d*(float)Math.PI;
		System.out.println("\narea is " + area);
		System.out.println("\ncircumference is " +c);
	}
}