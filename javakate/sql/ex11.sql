select ename, 
	case when deptno=10 then 'ȸ��'
		when deptno=20 then '����'
		when deptno=30 then '����'
		when deptno=40 then '����'
	end from emp;
