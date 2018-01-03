package java_tutoraial1;

public class Students {
	
	String name;
	int roll;
	int age;

	
	public Students()
	{
		System.out.println("Addign student records");
	}
	
	public Students(String name, int age, int roll)
	{
		this.name=name;
		this.roll =roll;
		this.age=age;
		
	}
	public static void main(String[] args) {
		
		Students s1= new Students();
		s1.name ="tom";
		s1.roll =1;
		s1.age =14;
		
		Students s2= new Students();
		s1.name ="tom";
		s1.roll =1;
		s1.age =14;
		
		Students s3= new Students("Raman",10,1);
		System.out.println("argument constructor name is" + s3.name);
		System.out.println("argument constructor name is" + s3.age);
		System.out.println("argument constructor name is" + s3.roll);
		
		

	}

}
