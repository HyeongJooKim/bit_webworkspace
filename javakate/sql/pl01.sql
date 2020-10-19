declare
type arr_empno is table of emp.empno%type index by binary_integer;
type arr_ename is table of emp.ename%type index by binary_integer;
v_empno arr_empno;
v_ename arr_ename;
cnt integer :=0;
begin

for i in 0..cnt loop
select empno into v_empno(i) where empno between 7000 and 8000;
v_empno(cnt):=v_empno(i);
cnt:=cnt+1;

for i in 0..cnt loop
select empno, ename into v_empno(i), v_ename(i) from emp where empno=v_empno(i);
dbms_output.put_line(v_empno(i)||':'||v_ename(i));
end loop;
end;
/