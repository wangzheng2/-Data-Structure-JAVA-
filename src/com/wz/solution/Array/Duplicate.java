package com.wz.solution.Array;

import java.util.HashSet;

/*��Ŀ����
��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� 
������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�
Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡� 
���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2��*/
/*˼·1�������ƽ⣬����ÿ���������������ظ�����*/
/*˼·2��ʹ��hashset���ɲ����ظ�Ԫ�ء�*/
public class Duplicate {
	public boolean solution1(int[] numbers,int length,int[] duplication){
		for(int i=0;i<length;i++){
			for(int j=i+1;j<length;j++){
				if(numbers[i]==numbers[j]){
					duplication[0]=numbers[i];
					return true;
				}
			}
		}
		return false;
	}
	public boolean solution2(int[] numbers,int length,int[] duplication){
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<length;i++){
			if(!set.add(numbers[i])){
				duplication[0]=numbers[i];
				return true;
			}
		}
		return false;
	}
}