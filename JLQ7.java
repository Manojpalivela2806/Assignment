package Week3jan2323;

public class JLQ7
{
	public static void main(String[] args)
	{
		char a[] = {'a','b','c','d','e','f','3','t','1','k','r','s','1','d','i','m','q','t','b','e','h','m','p','a','c','f','g','n','1','b'};
        int b[][]=new int[5][6];
		int x=0;
		for (int i = 0; i < 5; i++) {
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
			  if(b[i][j]=='1')
			  {
				  for(int k=i,l=0;l<=5;l++)
				  {
					  if(l!=j)
					  {
						  b[k][l]='0';
					  }
				  }
				  for(int m=0,n=j;m<5;m++)
				  {
					  if(m!=i)
					  {
						  b[m][n]='0';
					  }
				  }
			  }
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
