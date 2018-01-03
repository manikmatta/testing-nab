package java_tutorials;

public class Breakcontimue {
	
	
	public void go()
	{
		System.out.println("First");
		
	//	break; scope of break is inside loop and switch
		
		System.out.println("Last");
	//	continue; scope is only in loop
	}

// continue--to next cycle--skip the interation--if condition matchs it skips the current iteration
	public static void main(String[] args) {
		
		Breakcontimue BC = new Breakcontimue();
		BC.go();
		
		for (int i=0; i<10; i++)
		{
		//	if (i==5)
		//		break;
		//	System.out.println(i);
			if (i>=5 && i<=7)
				continue;
			System.out.println(i);
		}

		System.out.println("outside loop");
		

	}

}
