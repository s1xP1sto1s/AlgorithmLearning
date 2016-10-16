/*
 * ��������
 * ��õ����(���鱾�����������)����ҪN-1�αȽ���0�ν���
 * ������(����������������������˳���෴)����ҪN(N-1)/2�αȽ���N(N-1)/2����
 * ƽ�����~(N^2/4)�αȽ��뽻��
 * ʱ�临�Ӷȣ�O(N^2)
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
