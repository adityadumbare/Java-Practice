class ArrayDupli 
{
	public static void main(String[] args) 
	{
		//int[]a=new int[5]
		int[] arr={10,2,43,10, 7};

		for(int i=0;i<arr.length;i++){

			for(int j=i+1;j<arr.length;j++)
			if(arr[i]==arr[j]){
				arr[j]=0;
			}
		}
		for(int i=0;i<arr.length;i++){
			if (arr[i]!=0)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("Hello World!");
	}
}
