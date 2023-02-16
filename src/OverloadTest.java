class One
{
	
	public void add()  // default
	{
		System.out.println("From Default" );
//		int a,b,c;  //Overload
//		a=10;
//		b=20;
//		c=a+b;
//		System.out.println("From default="+c);
	}
		public void add(int d)  // Parameter
	{
			System.out.println("From Parameter");
//		int a,b,c;  
//		a=10;
//		b=20;
//		c=a+b+d;
//		System.out.println("From Parameter="+c);
	} }
public class OverloadTest {

	public static void main(String[] args) {

		One one=new One();
		one.add();
		one.add(2);

	}

}
