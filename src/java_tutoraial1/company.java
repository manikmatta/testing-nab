package java_tutoraial1;

public class company {

	public static void main(String[] args) {
		
		Department d= new Department();
		Department d1= new Department();
		Department.comp_name="tets";
		Department.nationalholiday();
	
		
		d.dept_id=10;
		d.dept_name ="telecom";
		d.no_of_emp=1000;
		
		d.add_dept();
		d.change_dept();
		
		d1.dept_id=101;
		d1.dept_name ="telecom";
		d1.no_of_emp=10001;
		
		d1.add_dept();
		d1.change_dept();


		
		System.out.println(d.dept_id);
		System.out.println(d.dept_name);
		System.out.println(d.no_of_emp);
		
		System.out.println(d1.dept_id);
		System.out.println(d1.dept_name);
		System.out.println(d1.no_of_emp);
		
		
	}

}
