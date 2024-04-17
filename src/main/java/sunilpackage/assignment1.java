 package sunilpackage;

public class assignment1 {
	
	public void VoterID(int age)
	{
		if(age >=18)
		{
		System.out.println("you are eligible");
		}
		else if (age <18)
		{
			 System.out.println("you are not eligible");
		}
	}
		public void FindCitizen(String citizen)
		{
			if(citizen.equalsIgnoreCase("Indian"))
			{
			System.out.println("you are eligible");
			}
			else if(citizen.equalsIgnoreCase("other"))
			{
			System.out.println("you are not eligible");
			}
			
			}
		
	
	public static void main(String[] args)
	{
		assignment1 A = new assignment1();
		A.VoterID(18);
		A.FindCitizen("canada");
	}
}
