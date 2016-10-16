/*
 * 插入排序：
 * 最好的情况(数组本来就是有序的)，需要N-1次比较与0次交换
 * 最坏的情况(数组有序但是与我们期望的顺序相反)，需要N(N-1)/2次比较与N(N-1)/2交换
 * 平均情况~(N^2/4)次比较与交换
 * 时间复杂度：O(N^2)
 */

package Sort;

public class InsertionSort {
	public static void main(String[] args)
	{
		Integer[] arr = new Integer[]{5,3,9,4,1,3,12,445,78,345,66,123};
		sort(arr);
		for(Integer tmp:arr)
			System.out.print(tmp+" ");
	}
	public static <T extends Comparable> void sort(T[] arr)
	{
		int len = arr.length;
		for(int i=1;i<len;i++)
		{
			for(int j=i;j>0 && arr[j].compareTo(arr[j-1])<0;j--)
			{
				T temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
			}
		}
	}

}
