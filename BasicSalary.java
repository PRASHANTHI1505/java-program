import java.util.*;
class BasicSalary
{
	public static void main(String args[])
	{
  double basic=20000.50,gross,DA,HRA;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Basic Salary :");
	basic = in.nextDouble();
	if(basic<=10000)
	{
	  DA = basic * 0.8;
      HRA = basic* 0.2;
  } 	
        else if(basic <=20000)
	{
		DA = basic * 0.9;
		HRA = basic * 0.2;
	}
	else 
	{
		DA = basic * 0.95;
		HRA = basic * 0.3;
	}
	gross = basic + DA + HRA;
	System.out.println("The Gross Salary is :-"+gross);	
}
}