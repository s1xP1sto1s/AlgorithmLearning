/*
 * 希尔排序：
 * 思想是避免插入排序的最坏情况，即原有顺序与我们期望的顺序相反。此时需要N(N-1)/2次比较与N(N-1)/2交换。
 * 造成最坏的情况的原因是，我们期望的该位置的值离该位置太远。所以，希望 先整体粗排序，再最后用插入排序细排序！
 * 使用了3的等比序列(h)。
 * 对插入排序的性能有所提升，但无法给出具体的时间复杂度。
 * */

package Sort;

public class ShellSort {
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
		int h = 1;
		while(3*h<len)
			h = h*3;
		while(h>=1)
		{
			for(int i=h;i<len;i++)
			{
				for(int j=i;j-h>=0 && arr[j].compareTo(arr[j-h])<0;j=j-h)
				{
					T temp = arr[j];
					arr[j] = arr[j-h];
					arr[j-h] = temp;
				}
			}
			h = h/3;
		}
	}
}
