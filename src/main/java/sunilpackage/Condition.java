package sunilpackage;

public class Condition {

	public void trafficsignal(String color, String Vehicle,Boolean Patient)
	{
		if(color.equalsIgnoreCase("green"))
		{
		System.out.println("you are good to go");
		}
		else if(color.equalsIgnoreCase("red"))
		{
		System.out.println("this is valid color");
		}
		
		if(Vehicle.equalsIgnoreCase("Ambulance") && (Patient==true))
		{
			System.out.println("hey !! please give me a way i am ambulance");
		}
		/*if(Patient==true)
		 * {
		 * system.out.println("hey !! please give me a way i am ambulance");
		 * }
		 * else 
		 * {
		 * system.out.println("you have to stop");
		 * }
		 */
		else
		{
			System.out.println("you have to stop");
		}

	 if(color.equalsIgnoreCase("yellow"))
	{
		System.out.println("please slow down your vehicle");
	}
	else
	{
		System.out.println("this is not a valid color");
	}
	 System.out.println("line in method");
	}
	
	public void FindGender(String genderCode)
	{
	switch(genderCode.toUpperCase())
	{
	case "M":
	System.out.println("you are Male");
	break;
	case "F":
	System.out.println("you are Female");
	break;
	case "T":
	System.out.println("you are Transgender");
	break;
	default:
        System.out.println("not a valid code");
        break;
	}
	}
	public static void main(String[] args)
	{
		Condition C = new Condition();
		C.trafficsignal("red", "Ambulance", true);
		C.FindGender("M");
	}
}
