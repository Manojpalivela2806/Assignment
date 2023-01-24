package jan1623;

import java.util.Scanner;

public class Monday
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the direction from where starting point:");
		String s = scan.next();
		String e="east";
		String w="west";
		String s0="south";
		String n="north";
		
		if(s.equals(s0))
		{
			System.out.println("Enter the distance to travel: ");
			int l=scan.nextInt();
			System.out.println("Enter the direction to travel right or left");
			String d1=scan.next();
			if(d1.equals("right"))
			{
				System.out.println("Enter the distance to travel:");
				int l1 =scan.nextInt();
				System.out.println("Enter the direction to travel right or left");
				String d2 =scan.next();
				System.out.println("Enter the distance to travel:");
				int l2 =scan.nextInt();
				if(d2.equals("right"))
				{
					int total1=l+l1+l2;
					if(l>l2)
					{
						System.out.println("you are in south-west direction and travelled "+total1+" kms");
					}
					else if(l<l2)
					{
						System.out.println("you are in north-west direction and travelled "+total1+" kms");
					}
					else
					{
						System.out.println("you are in west direction and travelled "+total1+" kms");
					}
					
				}
				else if(d2.equals("left"))
				{
					
					int total1=l+l1+l2;
					System.out.println("you are in south-west direction and travelled "+total1+" kms");
				}	
				else
					System.err.println("invalid direction you entered so start again from first");
			}
			else if(d1.equals("left"))
			{
				System.out.println("Enter the distance to travel:");
				int l1 =scan.nextInt();
				System.out.println("Enter the direction to travel right or left");
				String d2 =scan.next();
				System.out.println("Enter the distance to travel:");
				int l2 =scan.nextInt();
				if(d2.equals("right"))
				{
					int total1=l+l1+l2;
					System.out.println("you are in south-east direction and travelled "+total1+" kms");
					
				}
				else if(d2.equals("left"))
				{
					int total1=l+l1+l2;
					if(l>l2)
					{
						System.out.println("you are in south-east direction and travelled "+total1+" kms");
					}
					else if(l<l2)
					{
						System.out.println("you are in north-east direction and travelled "+total1+" kms");
					}
					else
					{
						System.out.println("you are in east direction and travelled "+total1+" kms");
					}
					
				}
				else
					System.err.println("invalid direction you entered so start again from first");
				
			}
			else
				System.err.println("invalid direction you entered so start again from first");
		}
		else if(s.equals(w))
		{
			System.out.println("Enter the distance to travel: ");
			int l=scan.nextInt();
			System.out.println("Enter the direction to travel right or left");
			String d1=scan.next();
			if(d1.equals("right"))
			{
				System.out.println("Enter the distance to travel:");
				int l1 =scan.nextInt();
				System.out.println("Enter the direction to travel right or left");
				String d2 =scan.next();
				if(d2.equals("right"))
				{
					System.out.println("Enter the distance to travel:");
					int l2 =scan.nextInt();
					int total1=l+l1+l2;
					if(l>l2)
					{
						System.out.println("you are in north-west direction and travelled "+total1+" kms");
					}
					else if(l<l2)
					{
						System.out.println("you are in north-east direction and travelled "+total1+" kms");
					}
					else
					{
						System.out.println("you are in north direction and travelled "+total1+" kms");
					}
					
				}
				else if(d2.equals("left"))
				{
					System.out.println("Enter the distance to travel:");
					int l2 =scan.nextInt();
					int total1=l+l1+l2;
					System.out.println("you are in north-west direction and travelled "+total1+" kms");
				}
				else
					System.err.println("invalid direction you entered so start again from first");
			}
			else if(d1.equals("left"))
			{
				System.out.println("Enter the distance to travel:");
				int l1 =scan.nextInt();
				System.out.println("Enter the direction to travel right or left");
				String d2 =scan.next();
				if(d2.equals("right"))
				{
					System.out.println("Enter the distance to travel:");
					int l2 =scan.nextInt();
					int total1=l+l1+l2;
					System.out.println("you are in south-west direction and travelled "+total1+" kms");
					
				}
				else if(d2.equals("left"))
				{
					System.out.println("Enter the distance to travel:");
					int l2 =scan.nextInt();
					int total1=l+l1+l2;
					if(l>l2)
					{
						System.out.println("you are in south-west direction and travelled "+total1+" kms");
					}
					else if(l<l2)
					{
						System.out.println("you are in south-east direction and travelled "+total1+" kms");
					}
					else
					{
						System.out.println("you are in south direction and travelled "+total1+" kms");
					}
					
				}
				else
					System.err.println("invalid direction you entered so start again from first");
				
			}
			else
				System.err.println("invalid direction you entered so start again from first");
		}
		else if(s.equals(e))
		{
			System.out.println("Enter the distance to travel: ");
			int l=scan.nextInt();
			System.out.println("Enter the direction to travel right or left");
			String d1=scan.next();
			if(d1.equals("right"))
			{
				System.out.println("Enter the distance to travel:");
				int l1 =scan.nextInt();
				System.out.println("Enter the direction to travel right or left");
				String d2 =scan.next();
				if(d2.equals("right"))
				{
					System.out.println("Enter the distance to travel:");
					int l2 =scan.nextInt();
					int total1=l+l1+l2;
					if(l>l2)
					{
						System.out.println("you are in south-east direction and travelled "+total1+" kms");
					}
					else if(l<l2)
					{
						System.out.println("you are in south-west direction and travelled "+total1+" kms");
					}
					else
					{
						System.out.println("you are in south direction and travelled "+total1+" kms");
					}
					
				}
				else if(d2.equals("left"))
				{
					System.out.println("Enter the distance to travel:");
					int l2 =scan.nextInt();
					int total1=l+l1+l2;
					System.out.println("you are in south-east direction and travelled "+total1+" kms");
				}
				else
					System.err.println("invalid direction you entered so start again from first");
			}
			else if(d1.equals("left"))
			{
				System.out.println("Enter the distance to travel:");
				int l1 =scan.nextInt();
				System.out.println("Enter the direction to travel right or left");
				String d2 =scan.next();
				if(d2.equals("right"))
				{
					System.out.println("Enter the distance to travel:");
					int l2 =scan.nextInt();
					int total1=l+l1+l2;
					System.out.println("you are in north-east direction and travelled "+total1+" kms");
					
				}
				else if(d2.equals("left"))
				{
					System.out.println("Enter the distance to travel:");
					int l2 =scan.nextInt();
					int total1=l+l1+l2;
					if(l>l2)
					{
						System.out.println("you are in north-east direction and travelled "+total1+" kms");
					}
					else if(l<l2)
					{
						System.out.println("you are in north-west direction and travelled "+total1+" kms");
					}
					else
					{
						System.out.println("you are in north direction and travelled "+total1+" kms");
					}
					
				}
				else
					System.err.println("invalid direction you entered so start again from first");
				
			}
			else
				System.err.println("invalid direction you entered so start again from first");
			
		}
		else if(s.equals(n))
		{
			System.out.println("Enter the distance to travel: ");
			int l=scan.nextInt();
			System.out.println("Enter the direction to travel right or left");
			String d1=scan.next();
			if(d1.equals("right"))
			{
				System.out.println("Enter the distance to travel:");
				int l1 =scan.nextInt();
				System.out.println("Enter the direction to travel right or left");
				String d2 =scan.next();
				if(d2.equals("right"))
				{
					System.out.println("Enter the distance to travel:");
					int l2 =scan.nextInt();
					int total1=l+l1+l2;
					if(l>l2)
					{
						System.out.println("you are in north-east direction and travelled "+total1+" kms");
					}
					else if(l<l2)
					{
						System.out.println("you are in south-east direction and travelled "+total1+" kms");
					}
					else
					{
						System.out.println("you are in east direction and travelled "+total1+" kms");
					}
					
				}
				else if(d2.equals("left"))
				{
					System.out.println("Enter the distance to travel:");
					int l2 =scan.nextInt();
					int total1=l+l1+l2;
					System.out.println("you are in north-east direction and travelled "+total1+" kms");
				}	
				else
					System.err.println("invalid direction you entered so start again from first");
			}
			else if(d1.equals("left"))
			{
				System.out.println("Enter the distance to travel:");
				int l1 =scan.nextInt();
				System.out.println("Enter the direction to travel right or left");
				String d2 =scan.next();
				
				if(d2.equals("right"))
				{
					System.out.println("Enter the distance to travel:");
					int l2 =scan.nextInt();
					int total1=l+l1+l2;
					System.out.println("you are in north-west direction and travelled "+total1+" kms");
					
				}
				else if(d2.equals("left"))
				{
					System.out.println("Enter the distance to travel:");
					int l2 =scan.nextInt();
					int total1=l+l1+l2;
					if(l>l2)
					{
						System.out.println("you are in north-west direction and travelled "+total1+" kms");
					}
					else if(l<l2)
					{
						System.out.println("you are in south-west direction and travelled "+total1+" kms");
					}
					else
					{
						System.out.println("you are in west direction and travelled "+total1+" kms");
					}
					
				}
				else
					System.err.println("invalid direction you entered so start again from first");
				
			}
			else
				System.err.println("invalid direction you entered so start again from first");
		}
		else
			System.err.println("Enter valid direction");
	}
}
