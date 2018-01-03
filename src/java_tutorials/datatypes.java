package java_tutorials;

public class datatypes {

	
	// java is platform indepent - can run on any OS.
	// high level langugese --location =23 where in machine and assebly language it is difficult to read.
	
	
	// How Java Works.
	
	// write a java program --Complile a program --it saves a .class file
	//class files contains the byte code , Interpretor reads the byte code and provides
	// instruction to JVM
	
	int i;
	// void is the returntype.....>>>datatype of the value..public integer display() means
	// return type as integer, public string display() means return type as String
	
//syntax is 1-accessmodifier, 2 return type , 3-method name, 4-{ 5- Body , 6-}
	
	
	public int display()
	{
		return i;
		
	}
	
	public String display1()
	{
		return "hello"; //should be the last statement;anthing after return wil give an error
				
	}
	
	public int display10 (int k, String a,float f, boolean b)
	
	{
		return 10;
		
	}
	
	public void show()
	{
		
	}
	
	
	public void display2()
	{
		// no need to use return statement.
		System.out.println("display anything");
	}
	
	public static void main(String[] args) {
		
		datatypes dt= new datatypes();
		dt.display10(1, "manik", (float) 1.2, true);
		
		// Primitive data types-create by java
		
		int i =123467890;
		long l=232323232323l;
		double d =1.23232323223;
		float f=1.232f;
		boolean b =true;
		char c ='a';
		String s ="this is java";
		
	  //	Non-Premitive datatype ---dt
		
//		datatypes dt= new datatypes(); [JVM creates an object in heap and when this object is not in use,
	//	garbaje collection removes it.
		
		datatypes dt1 = new datatypes();
		System.out.println(dt1);
		
		// gives the adress of the object
		
		// Camel Casing--standards to write the code
		
		//1- class should always start with Capital letter, example -Way2Automation.
		// Interface--Starts with Capital but its in Italics
		//2- in method/functions, first method should be small, then camel casing example-getResult,doCalucaltion
		// variables--first charcter should be samll and then camel casing-buttonWidth.
		// Constants-EXIT_ON_CLOSE_MIN_HEIGHT
		
		
		//What is Heap--Java heap is nothign but a memory space taken by JVM from OS
				
		//JDK--has java complier  + JRE	(JVM+ Library files)--we need JRE to run the java program
			
		// GArbage collection---is mechnaishm provied by JVM used to clean to Heap	if object has no reference.
				
				
				String abc ="learning automation";
				String abc1= new String();
				
							
				String s1= "way";
				String s2= "2";
				String s3 ="automation";
				String S4 = s1+     s2+s3;
				System.out.println(S4);
				
				
				// Javaoperatars
			   //	12 + 45 [ 12,45 are called opernands aand + is called opeartore]
						
				//1 -Unary operator --accepts single operand ++, -- , !=
				//2 -Binary operarote--two operands  like $$, !=, ==, <=
				//3-Ternary operator cappets 3 operands
	
						
				typeofvariables tv= new typeofvariables();
				tv.i++;
				
				typeofvariables tv1= new typeofvariables();
				tv1.i++;
				
				typeofvariables tv2= new typeofvariables();
				System.out.println(tv2.i);
				
				System.out.println(tv.sum1(2, 4)); //arguments
				System.out.println(tv.div(6,2));
				System.out.println(tv.sub(6, 2));
				System.out.println(tv.mul(6, 2));
				tv.sum(22,33);
				
	}

}
