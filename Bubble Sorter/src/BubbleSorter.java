//  This program sorts the numbers in an array from least to greatest

public class BubbleSorter
	{
	public static void main(String[] args)
		{
		int numbers [] = {99, -10, 100123, 18, 978, 5623, 463, -9, 287, 49};
		int i, j, k, temp;
		int size = 10;  // number of elements to sort
		
		System.out.println("The original array is: ");
		for (i = 0; i < size; i++)
			{
			System.out.print("  " + numbers[i]);
			}
		System.out.println();
		
		for (j = 0; j < size; j++)					
			{
			for (k = size - 1; k > j; k--)			
				{
				if (numbers[k - 1] > numbers[k])	
					{
					temp = numbers[k - 1];			
					numbers[k - 1] = numbers[k];	
					numbers[k] = temp;				
					}
				}
			}
		
		System.out.println();
		System.out.println("The sorted array is: ");
		for (int l = 0; l < size; l++)
			{
			System.out.print("  " + numbers[l]);
			}
		System.out.println();
			
		}
	}
