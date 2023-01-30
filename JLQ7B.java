package Week3jan2323;

/* For the below matrix find out the cell having ‘1’. Now replace the entire diagonal cell of that with ‘0’ in which that cell is available.

input:   a b c d e f 
         3 t z k r s
         a d i l q t
         b e 1 m p a
         c f g n r b
          
output: a b c d e 0 
        0 t z k 0 s 
        a 0 i 0 q t 
        b e 1 m p a 
        c 0 g 0 r b

*/
public class JLQ7B 
{
	public static void main(String[] args) 
	{
		char a[] = {'a','b','c','d','e','f','3','1','z','k','r','s','a','d','i','l','q','t','b','e','1','m','p','a','c','f','g','n','r','b'};
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
			 if(b[i][j]=='1')
			 {
				 int y;
				for( x=i-1,y=j-1;x>=0&&y>=0;x--,y--)
				{
					b[x][y]='0';
				}
				for(x=i+1,y=j+1;x<5&&y<6;x++,y++)
				{
					b[x][y]='0';
				}
				for(x=i+1,y=j-1;x<5&&y>=0;x++,y--)
				{
					b[x][y]='0';
				}
				for(x=i-1,y=j+1;x>=0&&y<6;x--,y++)
				{
					b[x][y]='0';
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

