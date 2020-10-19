select ename, 
	case when deptno=10 then '회계'
		when deptno=20 then '연구'
		when deptno=30 then '영업'
		when deptno=40 then '생산'
	end from emp;
