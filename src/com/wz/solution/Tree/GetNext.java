package com.wz.solution.Tree;
/*��Ŀ������һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣*/
/*˼·��
��������������һ���ڵ㣬һ�������������
1.������Ϊ�գ��򷵻ؿգ�
2.�ڵ��Һ��Ӵ��ڣ�������һ��ָ��Ӹýڵ���Һ��ӳ�����һֱ����ָ�����ӽ���ָ���ҵ���Ҷ�ӽڵ㼴Ϊ��һ���ڵ㣻
3.�ڵ㲻�Ǹ��ڵ㡣����ýڵ����丸�ڵ�����ӣ��򷵻ظ��ڵ㣻����������ϱ����丸�ڵ�ĸ��ڵ㣬�ظ�֮ǰ���жϣ����ؽ����*/
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class GetNext {
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
       if(pNode==null)
           return null;
       if(pNode.right!=null){
           pNode=pNode.right;
           while(pNode.left!=null){
               pNode=pNode.left;
           }
        return pNode;
       }
       while(pNode.next!=null){
           TreeLinkNode parent=pNode.next;
           if(parent.left==pNode)
               return parent;
           pNode=parent;
       }
        return null;
    }	
}
