public class SelectSort
{
	public static double[] selectSort(double[] array) 
	{
		for(int i=0;i<array.length;i++)
			{
				int minindex=i,j;
				for( j=i;j<array.length;j++) 
				{
					if(array[j]<array[minindex]) //���������ҵ���С����
					minindex=j;
				}//���δ�����һ�ֺ�minindex�����δ����������С��һ�����±�ֵ
				double temp=array[i];
				array[i]=array[minindex];
				array[minindex]=temp;//���źõĻ������������һ�顣iΪ�ֽ��
			}
		return array;
	}
	public static void main(String[] args) 
	{
		double[] a= {1,2,3,45,6,6,7,8};
		SelectSort b= new SelectSort();
		double[] c=b.selectSort(a);
		for(int i=0;i<a.length;i++)System.out.print(c[i]+"\t");
	}
}
