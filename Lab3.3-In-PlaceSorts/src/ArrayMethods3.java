/**
 * Created by Kaitlyn Cao and Lamia Islam
 * Lab 3.3 
 * */
public class ArrayMethods3 {

	public static void main(String[] args)
	{
		int[] list1 = {0, 7, 12, 2, 3, 0, 0, 27};
		//selectionSort(list1);
		String[] list2 = {"a","m","b","n","k","z","y"};
		 //bubbleSort(list2);
		insertionSort(list1);
		 printArr(list1);
		//a,b,k,m,n,y,z
	}

	/*
	 * @param list1 array of integer elements
	 * iterates through array and selects the lower element and moves it to the front of the array 
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
	
	/*@param list1 array of integer elements
	 * takes each element that is out of order and inserts it into it's rightful position
	 * */
	public static void insertionSort(int[] list1)
	{	
		
		int n = list1.length;
		for(int i = 0;i<n;i++)
		{
			int position = i;
			int insert = list1[i];
			while(position>0&&list1[position-1]>insert)
			{
				list1[position] = list1[position-1];
				position = position -1;
			}
			list1[position] = insert;
			
		}
		
	}

	/*@param arr array of string elements
	 * prints elements of the array
	 * */
	public static void printArr(String[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	/*@param arr array of integer elements
	 * prints elements of the array
	 * */
	public static void printArr(int[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	/*@param arr array of integer elements
	 * @param i, j indexes of items you want to swap
	 * Helper method for integer elements
	 * */	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] =  temp;
	}
	
	/*@param arr array of string elements
	 * @param i, j indexes of items you want to swap
	 * Helper method for string elements*/
	public static void swap(String[] arr, int i, int j)
	{
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] =  temp;
	}

	/*@param list1 array of strings
	 * iterates through the list comparing the items before and after and swaps any items that are out of order until there's nothing left to swap
	 * */
	public static void bubbleSort(String[] list1)
	{
		boolean swapped = false;
		while(!swapped)
		{
			for(int i = 0;i<list1.length;i++)
			{
				for(int j = i+1;j<list1.length;j++)
				{
					if(list1[j].compareTo(list1[i])<0) //trying to say j is less than i
					{
						swap(list1,j,i);
						
					}
					else
					{
						swapped = true;
					}
				}
			}
		}
	}
}
