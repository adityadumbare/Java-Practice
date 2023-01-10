class student 

{
	String name;
	int id;
	long cno;
	static String schname="xyz school";
	student(String sname)
	{
		this.name=sname;
			System.out.println("from sname");
	}
	student(String sname,int sid)
	{
		this(sname);
			this.id=sid;
			System.out.println("from sname ,id");
	}
	student(String sname,int sid,long scno)
	{
		this(sname,sid);
			this.cno=scno;
			System.out.println("from name ,id,long");
	}

	/*public void getAttributes()
	{
		System.out.println("student name "+name);
		System.out.println("student name "+id);
		System.out.println("student name "+cno);
		System.out.println("student name "+schname);
	}*/
	public static void main(String[] args) 
	{
		student s1=new student("laila",100,23425l);
		System.out.println(s1.name);
	}
}
