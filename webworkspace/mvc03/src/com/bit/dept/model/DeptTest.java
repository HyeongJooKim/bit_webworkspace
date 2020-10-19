package com.bit.dept.model;

import java.sql.SQLException;
import java.util.ArrayList;

public class DeptTest {
//단순 test용. 나중엔 별도 툴 쓸 거다
//모듈 하나씩 만들 때마다 중간중간 테스트 수행해가면서 개발해야 함
	public static void main(String[] args) {
		try {
			Dept04Dao dao=new Dept04Dao();
			System.out.println("connection:"+(dao.conn!=null));
			//connection:true
			ArrayList<Dept04Dto> list=dao.selectAll();
//			for(Dept04Dto bean: list){
//				System.out.println(bean);
//			}//이렇게 다 확인할 필요는 없고,
			//list가 잘 있는지 크기가 맞는지 정도만 확인하면 됨
			System.out.println("list:"+(list!=null));
			//list:true
			System.out.println("list size 예상치 5, 결과치:"+list.size());
			//list size 예상치 5, 결과치:5
			
			//삽입
			dao=new Dept04Dao();
			int result=dao.insertOne("test1","test1");
			System.out.println(result>0);//true (selectAll 수행하면 이건 수행 안됨. conn 닫혀서
			//번호확인
			dao=new Dept04Dao();
			int max=dao.maxDeptno();
			System.out.println("최근번호:"+max);//true
			//수정
			Dept04Dto target=new Dept04Dto(max,"edit1","edit2");
			dao=new Dept04Dao();
			result=dao.updateOne(target.getDeptno(), target.getDname(),target.getLoc());
			System.out.println("updateOne:"+(result>0));//true
			//detail
			dao=new Dept04Dao();
			Dept04Dto dto=dao.selectOne(target.getDeptno());
			System.out.println("수정예상치:"+target);
			System.out.println("수정결과치:"+dto);
			System.out.println("updateOne:"+(target.equals(dto)));
			//삭제
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