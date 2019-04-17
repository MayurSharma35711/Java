import java.util.Scanner;

public class Anagram{
	public static void main(String[] args)
	{
		int[][] letter = new int[30][26];
		int words=0;
		int sets=0;
		int[] ending = new int[30];
		int pairCounter=0;
		Scanner in = new Scanner(System.in);
		String[] c = new String[30];
		System.out.println("Enter num words: ");
		words = in.nextInt();
		for(int n=0;n<words;n++)
		{
			System.out.println("Enter word: \n");
			c[n] = in.nextLine();
			c[n] = c[n].toLowerCase();
			ending[n] = 0;
		}
		for(int q=0; q<words;q++)
		{
			for(int t=0;t<c[q].length();t++)
			{
				if(c[q].charAt(t) == ' ')
					continue;
				letter[q][c[q].charAt(t)-'a']++;
			}
		}
		for(int l = 0; l<words;l++)
		{
			int b;
			for(int m = l+1;m<words;m++)
			{
				b=0;
				for(int i=0;i<26;i++)
				{
					if(letter[l][i]!=letter[m][i])
					{
						b = 1;
						break;
					}
				}
				if(b==0)
					ending[l]++;
			}
		}
		for(int q=0;q<words;q++)
		{
			if(ending[q]>0)
				sets++;
		}
		System.out.println("There are " +sets + " sets of Anagrams");
	}
}