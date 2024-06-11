package firstPkg;

public class QA4 extends QA2 implements QA3I
{

	public void div(float a, float b)
	{
		float c = a/b;
		System.out.println("div of a&b: " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA4 q4 = new QA4();
		q4.div(30.0f, 20.0f);
		
		q4.sub(20, 30);
		
		q4.qa3im();
		
		q4.qa1im();
		
	}

	
	public void qa3im() {
	
		System.out.println("this is QA3I method implemeneted");
		
	}
	
}
