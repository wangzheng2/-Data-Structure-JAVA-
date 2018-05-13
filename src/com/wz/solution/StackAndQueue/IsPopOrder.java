package com.wz.solution.StackAndQueue;

import java.util.Stack;

/*��Ŀ����
���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�*/
/*˼·��ʹ��һ��ջ��ģ��ѹ�뵯�����������������֣�����û�˾�������ܵĵ�������,��ջ�ա�*/
public class IsPopOrder {
	public boolean IsPopOrder(int [] pushA,int [] popA){
		int len=pushA.length;
		Stack<Integer> stack=new Stack<Integer>();
		for(int pushindex=0,popindex=0;pushindex<len;pushindex++){
			stack.push(pushA[pushindex]);
			while(popindex<len && stack.peek()==popA[popindex]){
				stack.pop();
				popindex++;
			}
		}
		return stack.isEmpty();
	}
}
