package com.wz.solution.Tree;
/*��Ŀ����
���ϵ��°����ӡ��������ͬһ����������������ÿһ�����һ�С�*/
/*˼·��ÿ�δ�ӡһ���ڵ��ʱ������ýڵ����ӽڵ㣬��Ѹýڵ���Լҵ�ŵ�һ�����е�ĩβ��������������ͷ��ȡ������
������еĽڵ㣬�ظ�ǰ��Ĵ�ӡ������ֱ�����������еĽڵ㶼����ӡ������*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Print {
	public ArrayList<ArrayList<Integer>> solution(TreeNode pRoot){
		ArrayList<ArrayList<Integer>> ret=new ArrayList<>();
		if(pRoot==null)
			return ret;
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(pRoot);
		while(!queue.isEmpty()){
			ArrayList<Integer> list=new ArrayList<>();
			int count=queue.size();
			while(count-->0){
				TreeNode node=queue.poll();
				list.add(node.val);
				if(node.left!=null)
					queue.add(node.left);
				if(node.right!=null)
					queue.add(node.right);				
			}
			ret.add(list);
		}
		return ret;
	}
}

