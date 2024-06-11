package firstPkg;

 public class Calculations 
 {
 
 /*
 public Calculations()
 {
	 int a = 20; 
	 int b = 30;
	 int c = a+b;
	System.out.println("constructor's addition of a&b: " + c);

 }
 */
 
 

	 int a = 50; //global variable
	 int b = 100;
	 int c = a+b;
	
	public float add()
	{
		int a = 20;  //local variable    //constant 
		 int b = 30;
		 int c = a+b;
		System.out.println("addition of a&b: " + c);
		float d = 20.5f;
		return d;
	}
	
	public int sum(int x, int y)
	{
		int z = x+y;
		System.out.println("sum of x&y: " + z);
		return z;
	}
	
	public Calculations(int x, int y)
	{
		int z = x+y;
		System.out.println("Constructor's sum of x&y: " + z);
		
	}
	
	public void printValues()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	public static void main(String[] args) 
	{
		
		//Calculations cal = new Calculations();
		
		Calculations cal1 = new Calculations(25,35);
		
		
		
		
		float l = cal1.add();  //50
		
		cal1.printValues();
		//cal.sum(l, 40);
		int j = cal1.sum(50, 60);
		cal1.sum(j, 70);
		
		//40+50+60
		//int x = 40+50
		//x+60
	}
}
