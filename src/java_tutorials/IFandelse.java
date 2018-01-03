package java_tutorials;

public class IFandelse {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*5);
		System.out.println(num);
		if (num>=3)
		{
			System.out.println("failed");
		}
		else if (num <3)
		{
			System.out.println("passed");
		}
		else
			System.out.println("check the number");
	
	}

}
