package java_tutorials;

public class typeofvariables {
	
	static int i=10; // class variabe
	//instance -declared within class example int i=123 and can be accessed with anywhere in class

	public void sum(int a, int b)
	{
	//	int a=7; // this is local variable
		// local variables--declared with in method
		
		int c =a+b;
		System.out.println(c);
	}
	
	public int sum1(int a, int b)
	{
		int c=a+b;
		return c;
		
	}
	
	
	public int div(int a, int b) // these are parameters
	{
		int c=a/b;
		return c;
		
	}
	
	public int mul(int a, int b)
	{
		int c=a*b;
		return c;
		
	}
	
	public int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
	
	
	
	
// difference b/w instance variable, local variable and class variable (static)
		
		
	
		
		


}

