package java_tutorials;

public class Functions {

	public static int a=30;
	public static int b=20;
	
	public static void addnum()
	{
		int c =a+b;
		System.out.println("additon of 2 numbers are" + c);
	}
	public static void print()
	{
		System.out.println("learning automation");
	}
	
	public void testing()
	{
		System.out.println("tetsing");
	}
	

	public static void addnum(int r, int s)
	{
		int cs =r+s;
		System.out.println("additon of 2 numbers are" + cs);
	}
	
	public static void main(String[] args) {
	
		print();
		addnum();
		addnum(40,50);
		Functions fc= new Functions();
		fc.testing();

	}

	
}
