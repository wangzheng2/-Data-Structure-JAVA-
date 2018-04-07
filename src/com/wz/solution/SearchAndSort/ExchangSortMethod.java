       package com.wz.solution.SearchAndSort;

public class ExchangSortMethod {
	public static void main(String[] args) {
		int[] array = { 1, 5, 7, 3, 9, 4, 2, 8 };
		int low = 0;
		int high = 7;
		 quicksort(array, low, high);
		//Bubblesort(array);
		for (Integer i : array)
			System.out.print(i);
	}

	public static void quicksort(int[] arr, int low, int high) {
        int i,j,temp,t;
        i=low;
        j=high;     
        if(low>high)
        	return;
        temp = arr[low];                     //temp���ǻ�׼λ
        while (i<j) {                        
            while (temp<=arr[j]&&i<j) j--;    //�ȿ��ұߣ���������ݼ�
            while (temp>=arr[i]&&i<j) i++;   //�ٿ���ߣ��������ҵ���      
            if (i<j) {                       //������������򽻻�
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }    
         arr[low] = arr[i];                      //��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
         arr[i] = temp;  
        quicksort(arr, low, j-1);                //�ݹ�����������
        quicksort(arr, j+1, high);               //�ݹ�����Ұ�����
    }
	
	
	

	// ð������
	public static void Bubblesort(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) { // �����Ʊ�������
			for (int j = 0; j < arr.length - i - 1; j++) { // �ڲ����һ�˱Ƚϴ���
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}
}