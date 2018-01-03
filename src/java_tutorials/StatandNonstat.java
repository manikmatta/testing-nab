package java_tutorials;

public class StatandNonstat {

	
	public void go() {
		System.out.println("insidego");
		go1();
		
	}
	
	public void go1() {
		System.out.println("insidego1");
		go2();
	}
	
	public void go2() {
		System.out.println("insidego2");
		go3();
	}
	
	public static void go3() {
		System.out.println("insidego3");
	}
	
	
public static void main(String[] args) {
	StatandNonstat st= new StatandNonstat();
	st.go();
	go3();
	// Static compment can nver give call to non static
   // non Static can directy give call to Non Static and static
	}

}
