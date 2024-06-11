package firstPkg;

public class QA2 extends QA1
{

	int x = 500;
	
	public void callVar()
	{
		System.out.println(x); //500
		System.out.println(super.x);  //100
		
		super.sum(20, 30);
	}
	
	
	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		q2.sub(30, 40);
		q2.sum(20, 30);
		q2.callVar();
		
		
	}

	
	public void qa1im() {
		System.out.println("this is QA1 method");
		
	}
	
}
