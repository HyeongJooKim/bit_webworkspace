--create table ex17(
--	num number unique not null, 
--	name varchar2(15) not null
--);
--
drop table ex17;
--
--아래와 같이 쓸 수 있음.
--primary key: unique and not null
--단, Oracle에서는 한 테이블당 하나만 부여 가능
--
create table ex17(
	num number primary key,
	name varchar2(15) not null
);