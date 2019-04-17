import java.util.Scanner;

public class StarTriangle{
	public static void main(String[] Args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter dimensions: ");
		float d = in.nextFloat();
		for(int i=0; i <= d; i++)
		{
			int z;
			for(z=0;z<=d-1-i;z++)
			{
				System.out.print(" ");
			}
			for(;z<=d-1;z++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}