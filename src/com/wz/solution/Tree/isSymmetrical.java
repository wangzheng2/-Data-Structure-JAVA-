package com.wz.solution.Tree;
/*��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�
ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�*/
/*˼·1�����ε�˼�롣���ڵ㣬��Ϊ�գ���Գơ�����������Ϊ�վ��ǣ���ȫΪ�վͲ��ǡ�����Ϊ�յ�
 * ʱ����ֵ��Ⱦ��ǣ�������ȾͲ��ǡ�*/
/*˼·2����ǰ��������ں����������ô�Գƣ����ַ������ڵ�ֵһ����ʱ����Ȼ�Ǵ����*/

 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class isSymmetrical {
	 boolean isSymmetrical(TreeNode pRoot)
	    {
	        if(pRoot==null)
	            return true;
	        return func(pRoot.left,pRoot.right);
	    }
	    boolean func(TreeNode left,TreeNode right){
	        if(left==null && right==null)
	            return true;
	        if(left!=null && right!=null)
	            return left.val==right.val&&func(left.left,right.right)&&func(left.right,right.left);
	        return false;
	    }
}
