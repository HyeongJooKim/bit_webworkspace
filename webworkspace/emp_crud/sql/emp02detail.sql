--emp02detail.sql
create or replace procedure emp02detail
(psabun in emp02.sabun%type, cur out sys_refcursor)
is
begin
	open cur for select * from emp02 where sabun=psabun;
end;
/