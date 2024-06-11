package firstPkg;

public class CallDemoInterface implements DemoInterface
{

	
	public void meth3()
	{
	
	
		System.out.println("implementting the interface method");
		
	}

	
	public static void main(String[] args) {
	
		CallDemoInterface ci = new CallDemoInterface();
		ci.meth3();
		
	}


	
	public void meth4() {
	System.out.println("this is interface method");
		
	}
	
	
}
