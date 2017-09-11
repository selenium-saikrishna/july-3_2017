package day5;

public class ArrayExample2 {

	public static void main(String[] args) {
		
		int[] a={40,30,90,50,10};
		
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Max no is  "+max);

	}

}
