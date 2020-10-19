-- 학번(number), 이름(varchar(15), 국어(number(3)), 영어, 수학

create table student01(
	num number,
	name varchar2(15),
	kor number(3),
	eng number(3),
	math number(3)
);

delete from student01;

--더미 데이터 입력

insert into student01 values(1, '일일일', 90,80,70);
insert into student01 values(2, '이이이', 100,85,76);
insert into student01 values(3, '삼삼삼', 100,99,99);
insert into student01 values(4, '사사사', 44,44,44);
insert into student01 values(5, '오오오', 55,55,55);
exit;