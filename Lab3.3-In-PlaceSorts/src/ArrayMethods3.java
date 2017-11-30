
public class ArrayMethods3 {

	public static void main(String[] args)
	{
		int[] list1 = {0, 7, 12, 2, 3};
		insertionSort(list1);
	}
	
	public static void insertionSort(int[] list1)
	{

		if(list1.length <= 1)
		{
			printArr(list1);
		}
		else
		{

			//int index = 0;
			int j = list1[0];
			int k = 1; 
			while(k<list1.length)
			{
				
			}
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
	
	public static void selectionSort(int[] list1)
	{
		for(int i = 0; i<list1.length-1; i++)
		{
			int num = 0; 
			for(int j = i + 1; j<list1.length; j++)
			{
			if(list1[index] < list1[i])
			{
				index++;
				
			}
			else
			{
				num = i;
			}				
		}
	

		swap(list1, index, num);
		}
		printArr(list1);
	}
	
	public static void bubbleSort(String[] list1)
	{
		
	}
}
