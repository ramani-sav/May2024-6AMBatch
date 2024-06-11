package firstPkg;

public class CallBasClass extends AbsClassDemo
{

	
	public void meth2() 
	{
	
		System.out.println("this is my password");
		
	}

	public static void main(String[] args) 
	{
	
		CallBasClass cbc = new CallBasClass();
		cbc.meth1();
		cbc.meth2();
		
		
	}
	
}
