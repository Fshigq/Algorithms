package basics;
/**
 *FileName: BinarySearchRecursion.java
 *˵�������ֲ��ҵĵݹ�ʵ�ַ�ʽ
 *@Author shigq
 *@Email 1243611987@qq.com
 *@Date 2018��6��30�� ����3:35:34
 */
public class BinarySearchRecursion {
	
	public static int rank(int key, int [] a) {
		int low = 0;
		int high = a.length - 1;
		return rank(key, a, low, high);
	}
	/**
	 *���ַ��ĵݹ鷽��
	 *@param ����˵��
	 *@return ����
	 *@throws �쳣
	 */
	public static int rank(int key, int[] a, int low, int high) {
		if (low > high)
			return -1;
		int mid = low + (high - low)/2;
		if(key < a [mid]){
			high = mid - 1;
			return rank(key, a, low, high);
		}
		if (key > a[mid]){
			low = mid + 1;
			return rank(key, a, low, high);
		}
		else
			return mid;
			
	}

	public static void main(String[] args) {
		int[] whitelist = { 1, 3, 5, 7, 9 };
		int key = 0;
		int pos = rank(key, whitelist);
		System.out.println(pos);
	}

}
