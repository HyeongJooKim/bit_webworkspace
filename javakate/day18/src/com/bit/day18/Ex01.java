package com.bit.day18;

import java.text.DateFormat;
//Q1.�ֹι�ȣȮ��(�ѱ۵� ����, �ѱ۷� �����̻� �׷��� �Է°����ϰ�)
	//���1.�Է°��� ���ڷ� �̸� ��ȯ
		//���ǹ����� 10���� �ѱ۹��ڸ� 0~9�� ��ȯ. ��� ������.
		//�ٸ� ���: ���Ӽ��� �ο�. �̹������ �غ���.
	//���2.Exception�� ���� �׶� ��ȯ
//�ֹι�ȣ>>000000-0000000
//>>����� 00�� �����Դϴ�
//>>�Է������� �ٽ� Ȯ���ϼ���(000000-00000000)
public class Ex01 {//�������ڵ�

	public static void main(String[] args) {
		//���� �κ� ������ ����
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String msg=null;
		char[] origin={'0','1','2','3','4','5','6','7','8','9'};
		char[] target={'��','��','��','��','��','��','��','ĥ','��','��'};
		int age;
		char gender='#';
		
		//validation�� �ݺ� ����
		while(true){
			System.out.print("�ֹι�ȣ(000000-0000000)>>");
			msg=sc.nextLine();
			//�ڸ��� Ȯ��
			if(msg.length()!=14){
				System.out.println(">>�Է������� �ٽ� Ȯ���ϼ���(000000-00000000)");
				continue;
			}
			if(msg.charAt(6)!='-'){//���� ���� ���� ������, ���� �Է��� 6������ ª���� Exception ������ ��. �� ��ĵ� �̵� �غ���
				System.out.println(">>�Է������� �ٽ� Ȯ���ϼ���(000000-00000000)");
				continue;
			}
			
			//�ѱ�->���� ��ȯ
			for(int i=0; i<msg.length(); i++){
				if(i==6){continue;}
				if(!Character.isDigit(msg.charAt(i))){//���ڰ� �ƴϸ�
					for(int j=0; j<target.length; j++){
						if(msg.charAt(i)==target[j]){
							String before=msg.substring(0,i);
							//�ѱ۹߰ߵ��ڸ�(i)�������� ����.
							String after=msg.substring(i+1);
							//�ѱ۹߰�(i)������ ���� ����
							msg=before+origin[j]+after;
							//�ѱ��ڸ��� �ش����(j)�ֱ�
						}
					}
				}
			}

			boolean boo=false;
			for(int i=0; i<msg.length();i++){
				if(i==6){continue;}
				char temp=msg.charAt(i);
				if(!Character.isDigit(temp)){
					System.out.println(">>�Է������� �ٽ� Ȯ���ϼ���(000000-00000000)");
					boo=true;
					break;
				}
			}
			if(boo){continue;}//����߻��� boo=true �� while�� �ٽ� ���ư���.

			int year=Integer.parseInt(msg.substring(0,2));//����yy �̱�
			java.util.Date now = new java.util.Date();//�������� ���� ����yy �̱� 
			DateFormat now2 = java.text.DateFormat.getInstance();//#�̰� �� ��������
			String result = now2.format(now);
			int nowYear=Integer.parseInt(result.substring(0,2));
			gender=msg.charAt(7);
			if(gender=='1'||gender=='2'){
				age=(2000+nowYear)-(1900+year)+1;			
			}else{
				age=(2000+nowYear)-(2000+year)+1;		
			}
			if(gender=='1'||gender=='3'){
				gender='��';//#String�� �ٽ� ���� ���ϰ� �׳� �ᵵ ����			
			}else{
				gender='��';			
			}
			break;
		}
		System.out.println(">>����� "+age+"�� "+gender+"���Դϴ�");
		
		sc.close();
	}
}
