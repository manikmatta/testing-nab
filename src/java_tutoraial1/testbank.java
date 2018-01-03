package java_tutoraial1;

public class testbank {

	public static void main(String[] args) {
		Bank b1 = new Bank();
	//	b1.name ="HSBC";
		b1.accountbalance =1000;
		b1.interstgained(500);
		System.out.println(b1.accountbalance);
		
		
		Members m = new Members();
		m.add ="1841 Nunawading";
		m.name = "jack daniel";
		
		b1.mem =m;
		System.out.println(b1.mem.name);
		System.out.println(b1.mem.add);
	}
	

}
