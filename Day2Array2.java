package Week3jan2323;

public class Day2Array2 
{
	public static void main(String[] args) 
	{
		char a[] = {'a','b','c','d','e','f','3','t','z','k','r','s','a','d','i','l','q','t','b','e','1','m','p','a','c','f','g','n','r','b'};
        int b[][]=new int[5][6];
		int x=0;
		for (int i = 0; i < 5; i++)
		{
            for (int j = 0; j < 6; j++)
            {
                b[i][j] = a[x];
                x++;
            } 
        }
		for(int i=0; i<5;i++)
		{
			for(int j=0;j<6;j++)
			{	
			  System.out.print(((char)b[i][j]+" "));
			}
			System.out.println();
		}
		System.out.println("*******************");
		
		for(int i=0; i<5;i++)
		{
			for(int j=0;j<6;j++)
			{	
			 
				  if(i+j==5)
					  b[i][j]='0';
				  if(i-j==1)
					  b[i][j]='0';
				  if(i+j==5 && i-j==1)
					  b[i][j]='1';
			}	
		}
		for(int i=0; i<5;i++)
		{
			for(int j=0;j<6;j++)
			{	
			  System.out.print(((char)b[i][j]+" "));
			}
			System.out.println();
		}
	}
}
