drop table emp02;
create table emp02(
	sabun number,
	name varchar2(30),
	nalja date,
	pay number
);
--dummy
insert into emp02 values (1111, '������', sysdate, 1000);
insert into emp02 values (2222, '������', sysdate, 1000);
insert into emp02 values (3333, '����', sysdate, 1000);
insert into emp02 values (4444, '����', sysdate, 1000);
insert into emp02 values (5555, '������', sysdate, 1000);
insert into emp02 values (6666, '������', sysdate, 1000);
commit;