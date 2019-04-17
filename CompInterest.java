import java.util.Scanner;

public class CompInterest{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Borrowed: ");
		float bor = in.nextFloat();
		System.out.println("Enter Annual Interest (as decimal): ");
		float inter = in.nextFloat();
		System.out.println("Enter Monthly: ");
		float payoff = in.nextFloat();
		System.out.println("Enter Months: ");
		float mon = in.nextFloat();
		System.out.println("Month\tPaidInterest\tstill\n");
		for(int i= 1; i<=mon;i++)
		{
			float PaidInterest = (inter/12)*bor;
			bor = bor - payoff + PaidInterest;
			System.out.println(i +"\t"+ PaidInterest +"\t"+ bor);
		}
	}
}