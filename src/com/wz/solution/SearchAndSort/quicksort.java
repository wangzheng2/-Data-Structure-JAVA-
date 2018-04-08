package com.wz.solution.SearchAndSort;
//��������:���η�����������ȡ��һ�����������зֳ������֣����������ߣ�����С���ұߣ��ظ�������̣�ֱ������ֻʣһ������
public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] arr={5,3,8,1,9,4,7};
           int len=arr.length;
           quicksort(arr,0,len-1);
	}
	private static void quicksort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int i=low;
		int j=high;
		int temp=arr[low];
		if(i<j){ //�ж�
		while(i!=j){
			while(i<j && arr[j]>temp)
				j--;
			if(i<j){
				arr[i]=arr[j];
				i++;
				}
			while(i<j && arr[i]<temp)
				i++;
			if(i<j){
				arr[j]=arr[i];
				j--;
			}
		}			
		}
		arr[i]=temp;
		quicksort(arr,1,i-1);
		quicksort(arr,i+1,high);
	}
}

