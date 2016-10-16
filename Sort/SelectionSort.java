package Sort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args)
	{
		Integer[] arr = new Integer[]{5,3,9,4,1,3,12,445,78,345,66,123};
		sort(arr);
		//System.out.println(Arrays.toString(sort(arr)));
		for(Integer tmp:arr)
		{
			System.out.print(tmp+" ");
		}
	}
	//ʹ�÷��ͺͷ����޶�
	public static <T extends Comparable> void sort(T[] arr)
	{
		int len = arr.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
/*	
 *Ӧ�ö�̬����
	public static void sort(Comparable[] arr)
	{
		int len = arr.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					Comparable temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
*/
}
