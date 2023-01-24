package jan1623;

import java.util.Scanner;

public class TuesdayQ3
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Battery capacity: ");
		double c = scan.nextDouble();
		System.out.println("Enter the fan capacity: ");
		double f = scan.nextDouble();
		System.out.println("Enter the rpm of fan: ");
		int rpm=scan.nextInt();
	    System.out.println("Enter the rotations done by the fan: ");
	    int rotations = scan.nextInt();
	    // for to get the time taken for total rotations
	    int time=rotations/rpm;
        //	    converting time into hours
	    double hours=time/60.0;
	    double batteryConsumed =f*hours;
	    double BatteryLeft=c-batteryConsumed;
	    System.out.println("After completion of "+rotations+" the remaining battery charge is: "+BatteryLeft+" KW");
	    System.out.println("if you want to add any excess charge to battery yes or no:");
	    String s=scan.next();
	    boolean status=false;
	    if(s.equals("yes"))
	    {
	    	status=true;
	    }
	    if(status)
	    {
	    	System.out.println("Enter the additional capacity of battery: ");
	    	double ac=scan.nextDouble();
	    	BatteryLeft=BatteryLeft+ac;
	    }
	    double rWTF=BatteryLeft/2;
	    System.out.println("working time of fan for the remaining battery of "+BatteryLeft+" kw is: "+rWTF);
	}
}
