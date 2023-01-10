class NullPointer1 
{
	String name;
		int id;
		NullPointer1(int a, String s2)
			{
			this.name=s2;
			this.id=a;
			}

			public boolean Equals(Object o){
				NullPointer1 np=(NullPointer1)o;
				return this.id==np.id;
			}
	public static void main(String[] args) 
	{  
		//String s=null;
	  //System.out.println(s.hashCode());

	
		/* int a=10;
			int c=a/0;
		System.out.println(c);

		*/

		/*int[] a=new int[5];

		for(int i=0; i<=a.length;i++){
			System.out.println(a[i]);
		}*/

		//String s1="name";
		//int d=Integer.parseInt(s1);
		//System.out.println(d);
		

		NullPointer1 np1=new NullPointer1(11,"Ram");
		NullPointer1 np2=new NullPointer1(12,"ram");
		System.out .println(np1==np2);
		System.out .println(np1.Equals(np2));

	}
}
