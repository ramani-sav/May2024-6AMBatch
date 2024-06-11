package firstPkg;

public class Tester1 extends Class_All
{

	
	public void tc_createnewaccount() {
		
		System.out.println("this is email");
		System.out.println("this is my password");
		
	}

	
	public void tc_loginpage() {
	
		System.out.println("this is email");
		System.out.println("this is my password");
		
		
	}

	
	public static void main(String[] args) {
		
		Tester1 t1 = new Tester1();
		t1.tc_createnewaccount();
		t1.tc_loginpage();
		//t1.testcase_homepage();
		
	}
	
}
