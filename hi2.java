import java.util.ArrayList;

abstract class arrList{
	public abstract int test();
}
class hi1 extends arrList{
	public int test()
	{
		return 1;
	}
}
public class hi2 extends arrList{
	public int test()
	{
		return 2;
	}
	public static void main(String[] args)
	{
		ArrayList<arrList> x = new ArrayList<>();
		arrList hello = new hi1();
		arrList greet = new hi2();
		x.add(hello);
		x.add(greet);
		x.add(new hi1());
		x.add(new hi2());
		for(arrList q:x)
		{
			System.out.println(q.test());
		}
	}
}
