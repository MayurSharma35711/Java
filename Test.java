public class Test
{
	int inst;
	static int stat;
	final static int const1=50;

	Test(){
	inst=0;
	stat = -1;
}
	Test(int i)
	{
	inst =i;
	stat = i*10;
}
	public static void main(String[] args)
{
	Test x = new Test();
	Test y = new Test(90);
	Test p = y;
	System.out.println(x.inst);
	System.out.println(y.stat);
	System.out.println(y.inst);
	System.out.println(y.stat);
	p.inst = 45;
	System.out.println(y.inst + "here");
	System.out.println(y.stat);
	Test z = new Test();
	System.out.println(z.inst);
	System.out.println(z.stat);
	System.out.println(y.stat);
	System.out.println(x.stat);

	System.out.println(Test.const1);
}

}