drop table emp02;
create table emp02(
	sabun number,
	name varchar2(30),
	nalja date,
	pay number
);
--dummy
insert into emp02 values (1111, '일일일', sysdate, 1000);
insert into emp02 values (2222, '이이이', sysdate, 1000);
insert into emp02 values (3333, '삼삼삼', sysdate, 1000);
insert into emp02 values (4444, '사사사', sysdate, 1000);
insert into emp02 values (5555, '오오오', sysdate, 1000);
insert into emp02 values (6666, '일일일', sysdate, 1000);
commit;