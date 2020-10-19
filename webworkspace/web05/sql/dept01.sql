drop table dept01;
drop sequence dept01_seq;
--
create table dept01(
	num number primary key,
	id varchar2(50) unique not null,
	pw varchar2(16) not null,
	name varchar2(15) not null,
	lev number default 0
);
--
create sequence dept01_seq;
--
insert into dept01 values (dept01_seq.nextval, 'admin', 'admin', '대표자', 5);
insert into dept01 values (dept01_seq.nextval, 'master', 'master', '관리자', 4);
insert into dept01 values (dept01_seq.nextval, 'guest', '1234', '게스트', 2);
commit;

