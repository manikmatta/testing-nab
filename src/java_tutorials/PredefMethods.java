package java_tutorials;

import java.util.Random;

public class PredefMethods {
	
	public static void randommethod()
	{
		

		Random rand = new Random();

		int  n = rand.nextInt(50) + 1;
		System.out.println(n);
	}

	public static void main(String[] args) {
		
	int num=	(int)(Math.random()*100);
	 System.out.println(num);
	 randommethod();
	 
	}

}
