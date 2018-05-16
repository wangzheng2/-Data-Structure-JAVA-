package com.wz.solution.Tree;

/*��Ŀ����
��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ��
�ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�*/
/*˼·����˳�δ�ӡ�����������޸ġ�ÿ�δ�ӡһ���ڵ��ʱ������ýڵ����ӽڵ㣬��Ѹýڵ���Լҵ�ŵ�һ�����е�ĩβ��������������ͷ��ȡ������
������еĽڵ㣬�ظ�ǰ��Ĵ�ӡ������ֱ�����������еĽڵ㶼����ӡ�������ı�˳��ʱ����������*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ZPrint {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		if (pRoot == null)
			return ret;
		queue.add(pRoot);
		boolean flag = false; // ���÷�ת��־λ
		while (!queue.isEmpty()) {
			ArrayList<Integer> list = new ArrayList<>(); // ÿһ�������һ��arraylist��װval
			int count = queue.size();                    //�����е�Ԫ�ظ�������Ϊÿ��ڵ������
			while (count-- > 0) {
				TreeNode node = queue.poll();
				list.add(node.val);
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			if (flag)
				Collections.reverse(list);              //���õ��ڵ㣬Ȼ���ٱ�˳��
			flag = !flag;
			ret.add(list);
		}
		return ret;
	}
}


