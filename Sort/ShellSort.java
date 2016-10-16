/*
 * ϣ������
 * ˼���Ǳ�������������������ԭ��˳��������������˳���෴����ʱ��ҪN(N-1)/2�αȽ���N(N-1)/2������
 * �����������ԭ���ǣ����������ĸ�λ�õ�ֵ���λ��̫Զ�����ԣ�ϣ�� �����������������ò�������ϸ����
 * ʹ����3�ĵȱ�����(h)��
 * �Բ�������������������������޷����������ʱ�临�Ӷȡ�
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
