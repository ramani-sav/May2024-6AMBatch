package firstPkg;

public class FirstClass
{

	int a = 10;
	float b = 10.5f;
	char c = 'X';
	String d = "Java";
	boolean e = false;
	
	float sum = a+b;
	
	public void printValues()
	{
		
		System.out.println(sum);
		
		System.out.println(a);
		System.out.println(c);
		
		System.out.println(d);
		
		System.out.println(e);
		
	}
	
	public static void main(String[] args) 
	{
		FirstClass abc = new FirstClass();
		abc.printValues();
		
		
	}
	
	
}
