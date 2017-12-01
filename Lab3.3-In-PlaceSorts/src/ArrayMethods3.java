/**
 * Created by Kaitlyn Cao and Lamia Islam
 * Lab 3.3 
 * */
public class ArrayMethods3 {

	public static void main(String[] args)
	{
		int[] list1 = {0, 7, 12, 2, 3, 0, 0, 27};
		selectionSort(list1);
	}

	/*
	 * @list1
	 * */
	public static void selectionSort(int[] list1)
	{
		for(int i = 0; i<list1.length-1; i++)
		{
			int num = i; 
			for(int j = i + 1; j<list1.length; j++)
			{
				if(list1[j] < list1[num])
				{
					num = j;
				}			
		}
		swap(list1, num, i);
		}
		printArr(list1);
	}
	
	public static void insertionSort(int[] list1)
	{	
		//int index = 0;
		int j = list1[0];
		int k = 1; 
		printArr(list1);
		
		}
	}
	
	public static void printArr(int[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] =  temp;
	}
	

	
	public static void bubbleSort(String[] list1)
	{
		
	}
}
