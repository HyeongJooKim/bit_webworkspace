drop table bbs01;
drop sequence bbs01_seq;

create table bbs01(
	num number primary key,
	sub varchar2(30) default '제목없음',
	nalja date,
	id varchar2(30),
	content varchar2(2000),
	ref number default 0, --부모글 번호. 첫 글은 num과 같음. 답글은 원래글의 num
	no number, --재정렬용, 답글의 답글도 가능하니. 첫 글은 0, 답글은 1부터 순차적으로 늘림
	lev number --답글 들여쓰기용
);

create sequence bbs01_seq;

--dummy data 입력

commit;