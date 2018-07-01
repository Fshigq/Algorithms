package basics;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * FileName: BinarySearch.java 说明：二分查找
 * 
 * @Author shigq
 * @Email 1243611987@qq.com
 * @Date 2018年6月30日 上午11:53:14
 */
public class BinarySearch {
	/**
	 * 从一个从小到大排列的数组中查找一个固定值
	 * 
	 * @param1 待查找的固定值
	 * @param2 从大到小排列的数组
	 * @return 该值在数组中的位置，不存在则返回-1
	 * @throws 无
	 */
	public static int rank(int key, int[] a) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (key > a[mid])
				low = mid + 1;
			else if (key < a[mid])
				high = mid - 1;
			else
				return mid;
		}
		return -1;
	}

	/**
	 * 程序入口
	 * 
	 * @param 程序输入参数
	 * @return 无
	 * @throws 无
	 */
	public static void main(String[] args) {
		int[] whitelist = { 1, 3, 5, 7, 9 };
		int key = 0;
		int pos = rank(key, whitelist);
		System.out.println(pos);
	}

}
