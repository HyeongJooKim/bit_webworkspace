-- �й�(number), �̸�(varchar(15), ����(number(3)), ����, ����

create table student01(
	num number,
	name varchar2(15),
	kor number(3),
	eng number(3),
	math number(3)
);

delete from student01;

--���� ������ �Է�

insert into student01 values(1, '������', 90,80,70);
insert into student01 values(2, '������', 100,85,76);
insert into student01 values(3, '����', 100,99,99);
insert into student01 values(4, '����', 44,44,44);
insert into student01 values(5, '������', 55,55,55);
exit;