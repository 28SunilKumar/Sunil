package sunilpackage;

public class Loops {
	
	public void forloop(int initialization, int nextdigit)
	{
		int nextTendigit = initialization+nextdigit;
		for(int i =initialization;i<=nextTendigit;i++)
		{
			if(i==510 || i==520)
			{
			continue;
			}
			System.out.println(i);
		}
	}
    public void nestedforloop(int initialization,int nextdigit)
    {
    	int nextTendigit = initialization+nextdigit;
    	String identified = "no";
    	for(int i=initialization;i<=nextTendigit;i++)
    	{
    		System.out.println(i);
    		
System.out.println("******");
    		
    		for(int j=i;j<=nextTendigit;j++)
    		{
    			System.out.println(j);
    			identified="yes";
    			break;
    		}
    		if(identified.equals("yes"))
    		{
    			break;
    		}
    	}
    }
    
    public void decrement(int initialization, int previousdigit)
    {
    	int previousDigit = initialization - previousdigit;
    	for(int i=100;i>=previousDigit;i--)
    	{
    		System.out.println(i);
    	}
    }
    
    public void whileloop(int startvalue)
    {
    	int nexttendigit = 20;
    	while(startvalue<=nexttendigit)
    	{
    		System.out.println(startvalue);
    		startvalue =startvalue+2;
    	}
    }
    
    public void dowhileloop(int startvalue)
    {
    	int nexttendigit = 20;
    	do
    	{
    		System.out.println(startvalue);
    		startvalue =startvalue+2;
    	}
    	while(startvalue<=nexttendigit);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops L = new Loops();
		L.decrement(100,10);

	}

}
