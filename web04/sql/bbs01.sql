drop table bbs01;
drop sequence bbs01_seq;

create table bbs01(
	num number primary key,
	sub varchar2(30) default '�������',
	nalja date,
	id varchar2(30),
	content varchar2(2000),
	ref number default 0, --�θ�� ��ȣ. ù ���� num�� ����. ����� �������� num
	no number, --�����Ŀ�, ����� ��۵� �����ϴ�. ù ���� 0, ����� 1���� ���������� �ø�
	lev number --��� �鿩�����
);

create sequence bbs01_seq;

--dummy data �Է�

commit;