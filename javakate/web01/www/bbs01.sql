drop table bbs01;
drop sequence bbs01_seq;

create table bbs01(
	num number primary key,
	sub varchar2(30) default '제목없음',
	nalja date,
	id varchar2(30),
	content varchar2(2000)
);

create sequence bbs01_seq;

--dummy data 입력
insert into bbs01 (num, sub,nalja,id,content)
values (bbs01_sequence.nextval, '제목1',sysdate,'user1','나중에 입력');

insert into bbs01 (num, sub,nalja,id,content)
values (bbs01_sequence.nextval, '제목2',sysdate,'user2','나중에 입력');

insert into bbs01 (num, sub,nalja,id,content)
values (bbs01_sequence.nextval, '제목3',sysdate,'user3','나중에 입력');

insert into bbs01 (num, sub,nalja,id,content)
values (bbs01_sequence.nextval, '제목4',sysdate,'user4','나중에 입력');

insert into bbs01 (num, sub,nalja,id,content)
values (bbs01_sequence.nextval, '제목5',sysdate,'user5','나중에 입력');

insert into bbs01 (num, sub,nalja,id,content)
values (bbs01_sequence.nextval, '제목6',sysdate,'user6','나중에 입력');

commit;