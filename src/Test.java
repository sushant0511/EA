
class Second   // will not have any memory - create object for this class in main method 
{
	public void testCall()
	{
		System.out.println("Hi From testCall");
	}
}
public class Test {

	public static void main(String[] args) {
		//System.out.println("Hi From Main");
		Second second=new Second();
		second.testCall();
		System.out.println(second); // Second@some random value 
		second=null;
		System.out.println(second);
		second.testCall();
	}

}
