package basics;

/**
 *FileName: BinarySearch.java
 *˵������һ������int�����в���ĳ��ֵ
 *@Author shigq
 *@Email 1243611987@qq.com
 *@Date 2018��6��30�� ����11:53:14
 */
public class BinarySearch {
	/**
	 *��һ����С�������е������в���һ���̶�ֵ
	 *@param1 �����ҵĹ̶�ֵ
	 *@param2 �Ӵ�С���е�����
	 *@return ��ֵ�������е�λ�ã��������򷵻�-1
	 *@throws ��
	 */
	public static int rank(int key, int[] a) {
		int low = 0;
		int high = a.length-1;
		while(low <= high){
			int mid = low + (high - low)/2;
			if(key > a[mid])
				low = mid+1;
			else if(key < a[mid])
				high = mid-1;
			else 
				return mid;
		}
		return -1;
	}
	
	/**
	 *�������
	 *@param �����������
	 *@return ��
	 *@throws ��
	 */
	public static void main(String[] args) {
	int[] whitelist = {1,3,5,7,9};
	int key = 4;
	int pos = rank(key, whitelist);
	System.out.println(pos);
	}

}
