package com.bit.day15;
//Q1.�ֹι�ȣȮ��(�ѱ۵� ����, �ѱ۷� �����̻� �׷��� �Է°����ϰ�)
//�ֹι�ȣ>>000000-0000000
//>>����� 00�� �����Դϴ�
//>>�Է������� �ٽ� Ȯ���ϼ���(000000-00000000)
public class Id05 {//���ڵ�

	public static void main(String[] args) {

		java.util.Scanner sc=new java.util.Scanner(System.in);
		String input=null;
		char[] id=null;
		boolean pass=false;//�ʱⰪ�� false�� �ְ� test �հ��ϸ� true�� �ٲ��ֱ� 
		boolean test=false;//������ test ��� �ʱⰪ�� false�� �ְ� test �հ��ϸ� true�� �ٲ��ֱ� 
		int age=0;
		String gen="";
		//�հ��̸� �� pass�ϰ� �������� ������ ���Ƽ� ó������
		do{
			System.out.print("�ֹι�ȣ(000000-0000000)>>");
			input=sc.nextLine();
			id=input.toCharArray();// �ϳ��� �ֹι�ȣ�� ���� �� �ִ� �迭. ����ȣ ������ ���� �����ؾ�
			if(id.length==14&&id[6]=='-'){//�Է� ���̿�, 6�ڸ��� -������ ��� 
				//������ �ڸ����� ���������� Ȯ��, ���ڸ� ��� �� �� ������ ����ؼ� test=true�� �ٲ���.
				for(int i=0; i<id.length; i++){
					if(i==6){continue;}
					if(id[i]>='0'&&id[i]<='9'){
						test=true; continue; //������ ��� ����� �ͼ� �հ�
					}else{
						switch(id[i]){//���� �ƴ� ��� ����� �ͼ� �ѱ۰��� ���ڷ� �����ϰ� test=true
							case '��': id[i]='1'; test=true; break;
							case '��': id[i]='2'; test=true; break;
							case '��': id[i]='3'; test=true; break;
							case '��': id[i]='4'; test=true; break;
							case '��': id[i]='5'; test=true; break;
							case '��': case '��': id[i]='6'; test=true; break;
							case 'ĥ': id[i]='7'; test=true; break;
							case '��': id[i]='8'; test=true; break;
							case '��': id[i]='9'; test=true; break;
							case '��': case '��': id[i]='0'; break;
							default: test=false;//case�� ���� �Է°��� ������ fail
						}//switch end
					}//else end
				}//for end
			}//if end
			if(test){//test=true�� ��츸 ����ϰ� ��� ���
				if(id[7]=='1'||id[7]=='2'){
					age=2020-Integer.parseInt("19"+id[0]+id[1]);
				}else if(id[7]=='3'||id[7]=='4'){
					age=2020-Integer.parseInt("20"+id[0]+id[1]);
				}
				if(id[7]=='1'||id[7]=='3'){
					gen="��";
				}else if(id[7]=='2'||id[7]=='4'){
					gen="��";
				}
				System.out.println(">>����� "+age+"�� "+gen+"���Դϴ�");
				pass=true;
			}else{//���հ��̸� �����޽��� ������ ó������ ���ư���
				System.out.println(">>�Է������� �ٽ� Ȯ���ϼ���(000000-00000000)");
			}
		}while(!pass);//pass=fail;�̸� ���ư���. !pass=true�� ��
		sc.close();
	}//main end
}//class end