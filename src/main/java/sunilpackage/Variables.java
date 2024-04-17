package sunilpackage;

public class Variables {

    /*
     * variable is a constainer which hold the values
     * 3 type
     * local variable
     * global / instance variable
     * static variable
     * 
     * syntax : accessmodifier datatype variablename =value
     */
	
	public static double discountpercentage = 0.06; //global / instance
	
	public void calculatediscount(int amount)
	{
		double discountpercentage = 0.05; //local
		System.out.println(discountpercentage);
	}
	
	public void global()
	{
		System.out.println(discountpercentage);
	}
	
	public static void main(String[] args)
	{
		
	}
}
