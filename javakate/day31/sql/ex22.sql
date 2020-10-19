create table ex22(
	sabun number primary key,
	name varchar2(15) not null,
	gender char(1) check (gender in('M' , 'F'))
);