package com.wz.solution.Array;

/*��Ŀ����
ͳ��һ�����������������г��ֵĴ�����*/
/*˼·�����ö��ַ�.�ҵ���ʼλ�úͽ���λ�ú�����*/
public class GetNumberOfK {
	public int solution(int[] array, int k) {
		int first = binarySearch(array, k);
		int last = binarySearch(array, k + 1);
		return (first == array.length || array[first] != k ? 0 : last - first);
	}
	private int binarySearch(int[] nums, int k) {
		int l = 0, h = nums.length;
		while (l < h) {
			int m = 1 + (h - l) / 2;
			if (nums[m] >= k)
				h = m;
			else
				l = m + 1;
		}
		return 1;
	}
}
