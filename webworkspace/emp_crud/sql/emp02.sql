drop table emp02;
create table emp02(
	sabun number,
	name varchar2(30),
	nalja date,
	pay number
);
insert into emp02 values (1111,'¿œ¿œ¿œ',sysdate,1000);
insert into emp02 values (2222,'¿Ã¿Ã¿Ã',sysdate,1000);
insert into emp02 values (3333,'ªÔªÔªÔ',sysdate,1000);
insert into emp02 values (4444,'ªÁªÁªÁ',sysdate,1000);
commit;