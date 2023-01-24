package LogicalQuestionsSatyaSir;

import java.util.ArrayList;

public class JLQ1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> as = new ArrayList<>();
		
		char [] a =new char [] {'A','E','I','O','U'};
		 char b ='J';  char c ='F';
		for(int j=0;j<3;j++)
		{
			 for(int i=0;i<5;i++)
			 {
				 as.add(b+""+a[i]+""+c);
			 }
			 b++;
			 c++;
		}
		System.out.println(as);
		
		String [] str= new String[as.size()];	
       for(int i=0;i<as.size();i++)
       {
    	str[i]=as.get(i);   
       }
       
	}
}
