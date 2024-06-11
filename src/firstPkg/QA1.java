package firstPkg;

public  class QA1
{

	int x = 100;
	
	public void printVal()
	{
		final int x = 200;
		//x=1000;
		System.out.println(x); //200
		
		System.out.println(this.x); //100
	}
	
	
	
	
	
	public  void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sum(int a, int b, int d)
	{
		int c = a+b+d;
		System.out.println("sum of a&b&d: " + c);
	}
	

	
	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum of a&b: " + c);
	}
	

	
	
	public static void main(String[] args)
	{
		
		QA1 q1 = new QA1();
		q1.sum(20, 30);
		
		q1.sum(10, 10.5f);
		
		q1.sum(10, 20, 30);
		
		q1.sum(30, 40, 50);
		
	}
}
