package com.wz.solution.Dynamic;
/*��Ŀ����
��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n�
n<=39*/
/*˼·1�������ݹ�ķ���*/
public class Fibonacci {
//˼·1:�����ݹ飺��Ϊ�ܶ�ڵ����ظ��ģ�����Ч�ʵ��¡������ѭ�������õݹ顣
     public int solution1(int n){
        if(n<=0)
        	return 0;
        if(n==1)
        	return 1;
        return solution1(n-1)+solution1(n-2);
     }
//˼·2��ʹ��ѭ����
     public int solution2(int n){
    	 int target=0;
    	 int one=0;
    	 int two=1;
    	 if(n==0)
    		 return 0;
    	 if(n==1)
    		 return 1;
    	 for(int i=2;i<=n;i++){
    		 target=one+two;
    		 one=two;
    		 two=target;
    	 }
    	 return target;
     }
}