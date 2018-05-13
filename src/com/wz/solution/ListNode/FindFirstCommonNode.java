package com.wz.solution.ListNode;

import java.util.HashSet;

import com.wz.solution.ListNode.EntryNodeOfLoop.ListNode;

/*��Ŀ����
�������������ҳ����ǵĵ�һ��������㡣*/
/*˼·1����A�ĳ���Ϊa+c����B�ĳ���Ϊb+c��cΪ�������ֵĳ��ȡ���a+c+b=b+c+a.������A�������ʱ��������B��ͷ�����·���
������������B����ʱ��������Aͷ�����¿�ʼ�������������ܿ��Ʒ�������A��B��ָ��ͬʱ���ʵ����㡣*/
/*˼·2���Ȱ�����A����������������Bȥһ�����ȶԣ�������hashSet��*/
public class FindFirstCommonNode {
	public ListNode solution1(ListNode phead1, ListNode phead2) {
		ListNode l1 = phead1, l2 = phead2;
		l1 = (l1 == null) ? phead2 : l1.next;
		l2 = (l2 == null) ? phead1 : l2.next;
		return l1;
	}
	//�ⷨ2
	public ListNode solution2(ListNode phead1,ListNode phead2){
		HashSet<ListNode> set=new HashSet<ListNode>();
		while(phead1!=null){
		    set.add(phead1);
		    phead1=phead1.next;
		}
		while(phead2!=null){
			if(set.contains(phead2))
				return phead2;
			phead2=phead2.next;
		}
		return null;
	}
}