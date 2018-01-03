package java_tutorial3;

public class department implements Employee {

	public static void main(String[] args) {
		
		Employee e= new department();
		e.hr_policy();
		e.salary();
		
	}

//	@Override
	public void salary() {
		System.out.println("salary granted");
		
	}

//	@Override
	public void hr_policy() {
		System.out.println("hr policies applied");
		
	}

}
