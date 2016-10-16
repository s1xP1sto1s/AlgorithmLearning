/*
选择排序：需要N(N-1)/2次比较和N次交换。
特点：时间复杂度为O(n^2),所需的交换次数少。
*/

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
	//使用泛型和泛型限定
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
 *应用多态特性
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
