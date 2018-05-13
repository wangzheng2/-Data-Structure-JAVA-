package com.wz.solution.Tree;

/*��Ŀ����
�������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��*/
/*˼·�����η����ݹ�������root1��root2����Ϊ�յ�ʱ�����Ƚϣ�����ֱ�ӷ���false������ҵ���Ӧroot2���ڵ�ĵ㣬
 * ��������ڵ�Ϊ����ж��Ƿ����root2������Ҳ�������ô����ȥ��root1������ӵ�����㣬ȥ�ж��Ƿ����root2��
 * ������Ҳ�������ô����ȥroot1���Ҷ��ӵ�����㣬ȥ�ж��Ƿ����root2�����ؽ����
 * ���root2�Ѿ��������˶��ܶ�Ӧ���ϣ�����true�����root2��û�б����꣬root1ȴ�������ˡ�����false
 * ���������һ����û�ж�Ӧ�ϣ�����false��������ڵ��Ӧ���ϣ���ô�ͷֱ�ȥ�ӽڵ�����ƥ��*/
public class HasSubtree {
	public boolean solution(TreeNode root1, TreeNode root2) {
		boolean resulst = false;
		if (root1 == null || root2 == null)
			return false;
		if (root1.val == root2.val)
			resulst = isSubtree(root1, root2);
		if (!resulst)
			resulst = isSubtree(root1.left, root2);
		if (!resulst)
			resulst = isSubtree(root1.right, root2);
		return resulst;
	}
	private boolean isSubtree(TreeNode root1, TreeNode root2){
		if(root2==null)
			return true;
		if(root1==null)
			return false;
		if(root1.val!=root2.val)
			return false;
		return isSubtree(root1.left, root2.left)&&isSubtree(root1.right, root2.right);
	}
}
