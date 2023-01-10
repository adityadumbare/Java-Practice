class classcastexception 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		A a1=new A();
		B  b1=new B();
		A a2=new A();
		B b2=(B)a2;
		 
			}
}


class A
{
}

class B extends A
{
} 

