package java_tutorials;

public class boolean_datatype {

	public static void main(String[] args) {
	
		// boolean datatype is used to store true / false.
	
	 	boolean bol =true;
		System.out.println(10<20);
	 
		int firstnumber =10;
		int secondnumber =20;
		int thirdnumber =30;
		
		boolean result = firstnumber > secondnumber;
		System.out.println(result);
		
		System.out.println(firstnumber > secondnumber);
		
		if (firstnumber>secondnumber &&firstnumber >thirdnumber )
		{
			System.out.println("first no is greater" + firstnumber);
		}
		
		else if (secondnumber > firstnumber || secondnumber >thirdnumber) {
			System.out.println("second number is greater " +secondnumber);
		}
		else {
			System.out.println("third number is greater" +secondnumber );
		}

	}
	
	
}
