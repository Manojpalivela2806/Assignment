package jan1623;

import java.util.Scanner;

public class TuesdayQ2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String" );
		String str = scan.nextLine();
		String s=str.toUpperCase();
		char c [] = s.toCharArray();
		String s1="";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='C'||c[i]=='J'||c[i]=='S'||c[i]=='c'||c[i]=='j'||c[i]=='s')
			{
				s1+=c[i];
			}
		}
		System.out.println(s1);
		char ch []=s1.toCharArray();
		int countC=0;
		int countJ=0;
		int countS=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='C')
			{
				countC++;
			}
			else if(ch[i]=='J')
			{
				countJ++;
			}
			else if(ch[i]=='S')
			{
				countS++;
			}
		}
//		System.out.println(countC+" c "+countJ+" j "+countS+" s");
		int dividedS =countS/2;
		
		if(countC<countJ && countC<dividedS)
			System.out.println(" The cjss terms we can from above string is: "+countC);
		else if(countJ<countC && countJ<dividedS)
			System.out.println(" The cjss terms we can from string is: "+countJ);
		else 
		{
			System.out.println(" The cjss terms we can form string is: "+dividedS);
		}

	}
}
