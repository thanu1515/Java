class A 
{
	public A()
	{
		System.out.println("Constructor of class A");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("Constructor of class B");
	}
}
public class Basic_5
{
	public static void main(String s[])
	{
		B ob1 = new B();
	}
}





