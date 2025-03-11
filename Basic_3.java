Class A
{
	int x = 10;
	void disp()
{
		System.out.println("X= " +x);
	}
	void disp(int p1)
	{
		x = p1;
		System.out.println("Now X = "+x);
	}
}
public class Basic_3
{
	public static void main(String s[])
	{
		A ob1 = new A();
		ob1.disp();
		ob1.disp(111);
		ob1.disp();
	}
}

