class A
{
	int x;
	A()
	{
		x = 10;
		System.out.println("Constructor of class A");
	}
	A(int p1)
	{
		x = p1;
	}
	void disp()
	{
		System.out.println("X= " +x);
	}
}
class Basic_4
{
	public static void main(String s[])
	{
		A ob1 = new A();
		ob1.disp();
		A ob2 = new A(111);
		ob2.disp();
		ob1.disp();
	}
}


