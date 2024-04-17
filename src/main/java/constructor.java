
public class constructor {
	
	/*constructor is same like method
	 * constructor name should be same as your class name  
	 * constructor should not have return type 
	 * 2 type
	 * 1.constructor with parameter
	 * 2.constructor with out parameter
	 * no need to call the constructor it will execute when u instantiate
	 * constructor will run very first
	 * syntax : accessmodifier classname (arguments/parameter){}
	 */
	public void Constructor(int dob) // constructor with parameter
	{
		int age =2024-dob;
		System.out.println(age);
	}
	
	public constructor(int a)
	{
		System.out.println("this is constructor");
	}
	
	public void printmyname(String name)
	{
		System.out.println("my name is: "+name);
	}
	
	public void mylocation(String loc)
	{
		System.out.println("my location is :"+loc);
	}
	
	public static void main (String[] args)
	{
		constructor c = new constructor(2001);
		c.mylocation("chennai");
		c.printmyname("sunil");
		//c.getage(1996);
	}
}
