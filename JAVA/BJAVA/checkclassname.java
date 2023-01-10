class checkclassname 
{
	int a;
	{
		System.out.println(a++);
	}
	public static void main(String[] args) 
	{
		System.out.println("from main");
		checkclassname s=new checkclassname();
		System.out.println(++s.a);
	}
}
