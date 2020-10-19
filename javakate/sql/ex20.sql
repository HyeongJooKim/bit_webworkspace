create table ex21(
	num number primary key,
	job varchar2(15) not null
);
create table ex20(
	sabun number primary key,
	name varchar2(15) not null,
	num number,
	constraint ex20_num_fk foreign key(num) references ex21(num)
);