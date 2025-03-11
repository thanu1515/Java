class A 
{
	int x = 10;
	public void show()
	{
		System.out.println("X= "+x);
	}
}
class B extends A
{
	int y = 20;
	public void show()
	{
		System.out.println("Y= "+y);
	}
}
public class Basic_7
{
	public static void main(String s[])
	{
		B ob1 = new B();
		ob1.show();
	}
}



