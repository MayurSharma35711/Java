import java.util.Scanner;

public class factorial{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter highest num: ");
		int h = in.nextInt();
		System.out.println("Enter lowest num: ");
		int l = in.nextInt();
		int hf=1;
		for(int i=1; i<=h; i++)
		{
			hf*=i;
		}
		for(int q=h;q>=l;q--)
		{
			System.out.println(q +"!:\t" +hf);
			hf/=q;
		}
	}
}