class A
{
	public void show()
	{
		System.out.println("SHOW");
	}
	public static void disp()
	{
		A ob1 = new A();
		System.out.println("DISP");
		ob1.show();
	}
}
public class Basic_15
{
	public static void main(String s[])
	{
		A ob1 = new A();
		ob1.disp();
	}
}













