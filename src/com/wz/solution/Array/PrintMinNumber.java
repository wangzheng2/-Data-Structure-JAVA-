package com.wz.solution.Array;

import java.util.Arrays;

import org.junit.Test;

/*��Ŀ����
����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��*/
/*˼·�����Կ�����һ���������⣬�ڱȽ������ַ���S1��s2�Ĵ�Сʱ��Ӧ�ñȽϵ���s1+s2<s2+s1����ôӦ��
��s1����ǰ�棬����Ӧ�ð�s2����ǰ�ߡ��ñȽ�����ָ����������*/
public class PrintMinNumber {
       public static String solution(int[] numbers){
    	  int n=numbers.length;
    	  String[] nums=new String[n];
    	  for(int i=0;i<n;i++)
    		  nums[i]=numbers[i]+"";
    	  Arrays.sort(nums,(s1,s2)->(s1+s2).compareTo(s2+s1));//����ָ���Ƚ���������˳���ָ��������������
    	  String ret="";
    	  for(String str:nums)
    		  ret+=str;
    	  return ret;    	  
       }    
       public static void main(String[] args){
    	   int[] numbers={21,1,3};
    	    String r2=solution(numbers);
    	    System.out.println(r2);
       }
}