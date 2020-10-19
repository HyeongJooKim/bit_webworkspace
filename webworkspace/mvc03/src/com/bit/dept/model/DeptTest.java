package com.bit.dept.model;

import java.sql.SQLException;
import java.util.ArrayList;

public class DeptTest {
//�ܼ� test��. ���߿� ���� �� �� �Ŵ�
//��� �ϳ��� ���� ������ �߰��߰� �׽�Ʈ �����ذ��鼭 �����ؾ� ��
	public static void main(String[] args) {
		try {
			Dept04Dao dao=new Dept04Dao();
			System.out.println("connection:"+(dao.conn!=null));
			//connection:true
			ArrayList<Dept04Dto> list=dao.selectAll();
//			for(Dept04Dto bean: list){
//				System.out.println(bean);
//			}//�̷��� �� Ȯ���� �ʿ�� ����,
			//list�� �� �ִ��� ũ�Ⱑ �´��� ������ Ȯ���ϸ� ��
			System.out.println("list:"+(list!=null));
			//list:true
			System.out.println("list size ����ġ 5, ���ġ:"+list.size());
			//list size ����ġ 5, ���ġ:5
			
			//����
			dao=new Dept04Dao();
			int result=dao.insertOne("test1","test1");
			System.out.println(result>0);//true (selectAll �����ϸ� �̰� ���� �ȵ�. conn ������
			//��ȣȮ��
			dao=new Dept04Dao();
			int max=dao.maxDeptno();
			System.out.println("�ֱٹ�ȣ:"+max);//true
			//����
			Dept04Dto target=new Dept04Dto(max,"edit1","edit2");
			dao=new Dept04Dao();
			result=dao.updateOne(target.getDeptno(), target.getDname(),target.getLoc());
			System.out.println("updateOne:"+(result>0));//true
			//detail
			dao=new Dept04Dao();
			Dept04Dto dto=dao.selectOne(target.getDeptno());
			System.out.println("��������ġ:"+target);
			System.out.println("�������ġ:"+dto);
			System.out.println("updateOne:"+(target.equals(dto)));
			//����
			dao=new Dept04Dao();
			result=dao.deleteOne(max);
			System.out.println("deleteOne:"+(result>0));
			//row count
			dao=new Dept04Dao();
			int cnt=dao.rowCount();
			System.out.println("rowCount:"+cnt);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}