declare
	v_row dept%rowtype;
	cursor cur is (select * from dept);
begin
	for v_row in cur loop
		dbms_output.put_line(v_row.deptno);
		dbms_output.put_line(v_row.dname);
		dbms_output.put_line(v_row.loc);
	end loop;
end;
/