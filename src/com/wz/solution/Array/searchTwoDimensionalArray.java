//���⣺��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
//      �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
//˼·:�����Ͻǿ�ʼ���������������Ҳ��ң�����С��������ҡ�
package com.wz.solution.Array;
public class searchTwoDimensionalArray {
	public boolean Find(int target,int[][] array){
		   int hang=array.length;
	        int lie=array[0].length;
	        int i=0;
	        int j=lie-1;
	        while(i<hang && j>=0){
	            if(array[i][j]>target)
	                 j--;
	            else if(array[i][j]<target)
	                i++;
	            else
	                return true;
	        }
	        return false;
	}	
}
