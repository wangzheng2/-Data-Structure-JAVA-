package com.wz.solution.Tree;
/*��Ŀ����
����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣
���磬 5 / \ 3 7 /\ /\ 2 4 6 8 �У��������ֵ��С˳�����������ֵΪ4��*/
/*˼·�����ö����������������������ص㡣*/
public class KthNode {
	private TreeNode ret;
	private int count=0;
	public TreeNode KthNode(TreeNode pRoot,int k){
		KthNode(pRoot,k);
		return ret;
	}
	private void inorder(TreeNode root,int k){
		if(root==null || count>=k)
			return;
		inorder(root.left, k);
		count++;
		if(count==k)
			ret=root;
		inorder(root.right, k);
	}
}
