package assignment.work.nw;

public class Randomarray {
	public static void random(Object[] arr)
	{
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			int num=i+(int)(Math.random()*(size-i));
			Object temp=arr[num];
			arr[num]=arr[i];
			arr[i]=temp;
		}
		
	}

	public static void main(String[] args) {
		Object[] array= {1,"A","ABC",2,9,0};
		Randomarray.random(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
