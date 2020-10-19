drop table bbs01;
drop sequence bbs01_seq;

create table bbs01(
	num number primary key,
	sub varchar2(30) default '�������',
	nalja date,
	id varchar2(30),
	content varchar2(2000)
);

create sequence bbs01_seq;

--dummy data �Է�
insert into bbs01 (num, sub,nalja,id,content)
values (bbs01_sequence.nextval, '����1',sysdate,'user1','���߿� �Է�');

insert into bbs01 (num, sub,nalja,id,content)
values (bbs01_sequence.nextval, '����2',sysdate,'user2','���߿� �Է�');

insert into bbs01 (num, sub,nalja,id,content)
values (bbs01_sequence.nextval, '����3',sysdate,'user3','���߿� �Է�');

insert into bbs01 (num, sub,nalja,id,content)
values (bbs01_sequence.nextval, '����4',sysdate,'user4','���߿� �Է�');

insert into bbs01 (num, sub,nalja,id,content)
values (bbs01_sequence.nextval, '����5',sysdate,'user5','���߿� �Է�');

insert into bbs01 (num, sub,nalja,id,content)
values (bbs01_sequence.nextval, '����6',sysdate,'user6','���߿� �Է�');

commit;