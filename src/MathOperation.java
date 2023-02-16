
class Addition
{
	public void add()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
}
class Subtratction
{
	public void sub()
	{
		int a,b,c;
		a=20;
		b=10;
		c=a-b;
		System.out.println(c);
	}
}

public class MathOperation {
	

	public static void main(String[] args) {
		// if anything you want to print so call it inside main block 
 System.out.println("Hi From Main Class");
  		Addition addition=new Addition();
  		addition.add();
  		Subtratction subtratction=new Subtratction();
  		subtratction.sub();
 
	}

}
