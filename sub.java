class sup{
	void m1()
	{
		m2();
		System.out.print("super 1 ");
	}
	void m2()
	{
		System.out.print("super 2 ");
	}
}
public class sub extends sup{
	void m1()
	{
		super.m1();
		System.out.print("sub 1");
	}
	void m2()
	{
		super.m2();
		System.out.print("sub 2");
	}
	public static void main(String[] args)
	{
		sub test = new sub();
		test.m1(); //expected is super 2 sub 2 super 1 sub 1 
	}
}