/*���⣺��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��*/
/*˼·1�����ֲ��ң���С��������ʵΪ����������ֽ���;*/
/*˼·2:����,���ĳ����С����ǰ�ߵ��Ǹ���,��Ϊ����*/
package com.wz.solution.SearchAndSort;
public class MinNumberInRotateArray {
	public int method1(int[] array){
		return 0;	
	}
	///////////////////////////////////////////////////////////////////
	public int method2(int[] array){
		if(array==null||array.length==0)
			return 0;
		for(int i=0;i<array.length-1;i++){
			if(array[i]>array[i+1])
			return array[i+1];
		}
		return 0;		
	}
}
