class student1 
{
	String name;
		int id;
		long cno;
		static String schname="scsv vanasgaon";

	student1(String sname,int sid,long scno)
	{
		name=sname;
		id=sid;
		cno=scno;
		System.out.println("Student name "+sname);
		System.out.println("Student name "+sid);
		System.out.println("Student name "+scno);
	}
	public static void main(String[] args) 
	{
		/*System.out.println("Student name "+name);
		System.out.println("Student name "+name);         //*Non static members not allowed//*
		System.out.println("Student name "+cno);*/
	student1 s1=new student1("adi",111,9921819823l);
	System.out.println("Student name "+s1.name);
		System.out.println("Student name "+s1.id);
		System.out.println("Student name "+s1.cno);
	}
}

