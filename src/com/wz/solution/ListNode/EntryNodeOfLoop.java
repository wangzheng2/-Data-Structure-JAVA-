package com.wz.solution.ListNode;

import java.util.HashSet;

//��Ŀ����:һ�������а����������ҳ�������Ļ�����ڽ�㡣
//˼·������hashset�����Դ��ظ�Ԫ�ص��ص㣬listNode��Ȼ���ǻ������ͣ����ǱȽ�ʱ�Ƚϵ��Ƕ����ַ
public class EntryNodeOfLoop {
		public ListNode method(ListNode pHead){
			 HashSet<ListNode> set=new HashSet<ListNode>();
		        while(pHead!=null){
		            if(!set.add(pHead))
		                return pHead;
		            pHead=pHead.next;
		        }
		        return null;
		}

 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
 }
}
