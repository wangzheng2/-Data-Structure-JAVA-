package com.wz.solution.ListNode;
//��Ŀ����:���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
public class Merge {
		public ListNode merge(ListNode list1,ListNode list2){
			 ListNode root=new ListNode(-1);
		        ListNode p=root;
		        while(list1!=null && list2!=null){
		        if(list1.val>=list2.val){
		            p.next=list2;
		            list2=list2.next;
		        }else{
		            p.next=list1;
		            list1=list1.next;
		        }
		            p=p.next;
		        }
		        if(list1==null)  p.next=list2;
		        if(list2==null)  p.next=list1;
		        return root.next;
		}
		class ListNode {
		    int val;
		    ListNode next = null;

		    ListNode(int val) {
		        this.val = val;
		    }
		}
}
