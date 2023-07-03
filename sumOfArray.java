import java.util.*;

public class sumOfArray {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i, Sum = 0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter No of elements in an array : ");
		Size = sc.nextInt();
		//Size of an array 	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			Sum = Sum + a[i]; 
		}		
		System.out.println("The Sum of All Elements in this Array = " + Sum);
	}
}