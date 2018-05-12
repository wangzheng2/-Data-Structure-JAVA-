package com.wz.solution.Array;

/*��Ŀ����
��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء� 
��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1�� 
NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��*/
/*˼·�����ֲ���
*/
public class minNumberInRotateArray {
	public static int solution(int[] nums) {
		if (nums.length == 0)
			return 0;
		int l = 0, h = nums.length-1;
		while (l < h) {
			int m = l + (h - l) / 2;
			if (nums[m] <= nums[h])
				h = m;
			else {
				l = m + 1;
			}
		}
		return nums[l];
	}
}
