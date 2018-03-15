/*问题：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。*/
/*思路1：二分查找，最小的数组其实为两个子数组分界线;*/
/*思路2:遍历,如果某个数小于其前边的那个数,即为所求*/
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
