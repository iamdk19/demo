import java.util.*;
class ArrayDisplay
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of element:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values to an array:");
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			arr[i]=a;
		}
		
		System.out.println("elements of the array:");
		for(int val:arr)
			System.out.println(val);
	}
}