package sunilpackage;

public class sunilfirst {
	
	public void Printname()
	{
		System.out.println("technology");
	}

	public void add()
	{
		int a=10;
	    int b=10;
		int c=a+b;		
		System.out.println(c);
	}
	
	public void sub(int a, int b)
	{
	    int c = a-b;
	    System.out.println(c);
	}
	
	public int mul(int a, int b)
	{
		int c =a*b;
	    return c;
	}
	
	public void div(int a, int b)
	{
		int c =mul(a,b);
		int d =c/b;
		System.out.println(d);
	}
	
	
	{
	
	System.out.println("sunil");
	System.out.println("7338788159");
	System.out.println("chennai");
	System.out.println("b.com computer application");
	
	System.out.print("sunil");
	System.out.print("7338788159");
	System.out.print("chennai");
	System.out.println("b.com computer application");
	
	sunilfirst SF = new sunilfirst();
	SF.Printname();
	SF.add();
    SF.sub(30, 15);
    SF.mul(5,10);
    SF.div(5, 10);
	}
}
