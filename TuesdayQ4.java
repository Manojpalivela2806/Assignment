package jan1623;

public class TuesdayQ4 
{
	public static void main(String[] args)
	{  
		int rows=5;
		int columns=6;
		int x=2;
		int in=2;;
		int temp=in;
		int a[][]=new int[rows][columns];
		
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
            {
                a[i][j] = x;
                x=x+in;
            }
           in=temp+i+1;
           x=in;
        }
		for(int i=0; i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
			  System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}
	}
}
