package secondPkg;

import firstPkg.Calculations;

class ClasswithMM 
{

	int a =50;
	int b = 100;
	
	int c = a+b;
	
	 void abc()
	{
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		/*
		TODO Auto-generated method stub
		this is one line comments
		*/
		Calculations cal = new Calculations(10, 20);
		cal.add();	
		
		ClasswithMM cc = new ClasswithMM();
		cc.abc();

	}

}
