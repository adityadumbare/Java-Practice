class Reverse 
{
		public static void main(String[] args){
			String s="hello";
	String res="";
			for (int i=s.length()-1;i>=0 ;i-- )
			{
				char  s1=s.charAt(i);
				res= res+s1;
			}
			System.out.println(res);
		}


	/*public static void main(String[] args) 
	{
		int num=1234;
		String res="";
		for (int i=num; i>0; i=i/10)
		{
			int rem=i%10;
			res=res+rem;
			
		}
		Integer.parseInt(res);
		System.out.println(res);
	}*/

}
