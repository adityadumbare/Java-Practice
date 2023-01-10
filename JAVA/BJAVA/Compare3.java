import java.util.Arrays;
class Compare3 implements Comparable
{
	int a;
	int b; 
	int c;
	Compare3( int a,int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;

	}

	public String toString(){
			return a+" "+b+" "+c;
		}

		public int compareTo(Object o){
			Compare3 c=(Compare3)o;
			if(this.a<a){
				return -1;
			}
			else if(this.a>a){
				return 1;
			}
			else{
				return 0;
			}
		}
	public static void main(String[] args) 
	{
		
		
	}
}




class Compare3Driver
{
	public static void main(String[] args){
		//System.out.println("Hello World!");

		int [] arr=new int[5];

		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=1;
	
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		Compare3 c1=new Compare3(10,20,30);
		Compare3 c2=new Compare3(20,20,30);
		Compare3 c3=new Compare3(30,50,30);
		Compare3 c4=new Compare3(11,20,90);
		Compare3 c5=new Compare3(1,20,30);

		Compare3[] c0={c1,c2,c3,c4,c5};

	for(Compare3 v:c0){
		System.out.println(v);
	}
	Arrays.sort(c0);
	for(Compare3 v:c0){
		System.out.println(v);
	}
	}
}