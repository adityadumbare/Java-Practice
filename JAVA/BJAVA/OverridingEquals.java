class OverridingEquals 
{
	String s;
	int id;
	OverridingEquals(int bid,String bname){
		this.s=bname;
		this.id=bid;
	}

	public String toString(){
			return "this id number is"+id+ "name is "+s;
		}

		public int hashCode(){
			int a=this.s.hashCode();
			return this.id+a;
		}
		public boolean Equals( Object o){
			OverridingEquals Or=(OverridingEquals)o;
			return this.id==Or.id;
		}
	public static void main(String[] args) 
	{	OverridingEquals or1=new OverridingEquals(11,"ram");
	OverridingEquals or2=new OverridingEquals(11,"ram");
	System.out.println(or1);
	System.out.println(or1.hashCode());
	System.out.println(or1.Equals(or2));


		
	}
}

