import java.util.*;

public class stringSort{
	public static void main(String args[])
	{
		ArrayList<String> list= new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		//.useDelimiter("\\s*;\\s*");
		System.out.println("Input:");
		//System.out.println("a");
		String total = scan.nextLine();
		/*while(scan.hasNext())
		{
			System.out.println("b");
			list.add(scan.next());
			System.out.println("c");
		}*/
		int n=0;
		for(int c=0;c<total.length();c++)
		{
			if(total.charAt(c)==' ')
			{
				total = total.substring(0,c) + total.substring(c +1);
			}
			if(total.charAt(c)==';')
			{
				//System.out.println("here");
				list.add(total.substring(n,c));
				n=c+1;
			}
		}
		System.out.println("Unsorted: " + total);
		ArrayList<String> sorter = new ArrayList<>();
		int q=0;
		while(true)
		{
			for(String m:list)
			{
				sorter.add(m.charAt(q));
			}
			for(int n=0;n<list.length()-1;n++)
			{
				
			}
			
		}
		/*for(String l : list)
		{
			System.out.print(l + " ");
			System.out.println("e");
		}*/
		System.out.println();
	}
}