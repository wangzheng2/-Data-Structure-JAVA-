package com.wz.solution.Array;
/*��Ŀ����
����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
���е�ż��λ��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣

����ܼ򵥣�������������һ��װ���ܱ�2�����ģ��ڶ���װ�ܱ�2�����ġ�*/
import java.util.ArrayList;

public class reOrderArray {
	public static void method(int[] array) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		int len = array.length;
		for (Integer i : array) {
			if (i % 2 != 0)
				arr1.add(i);
			else
				arr2.add(i);
		}
		arr1.addAll(arr2);
		for(int i=0;i<len;i++)
			array[i]=arr1.get(i);
	}
//����
	public static void main(String[] args) {
		int[] arr={1,3,5,7,2,4,6};
		for(Integer i:arr)
			System.out.println(i);
		
	}
}
