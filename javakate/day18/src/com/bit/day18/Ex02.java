package com.bit.day18;

import java.text.DateFormat;
//Q1.�ֹι�ȣȮ��(�ѱ۵� ����, �ѱ۷� �����̻� �׷��� �Է°����ϰ�)
	//���1.�Է°��� ���ڷ� �̸� ��ȯ
		//���ǹ����� 10���� �ѱ۹��ڸ� 0~9�� ��ȯ. ��� ������.
		//�ٸ� ���: ���Ӽ��� �ο�. �̹������ �غ���.
	//���2.Exception�� ���� �׶� ��ȯ==>
//�ֹι�ȣ>>000000-0000000
//>>����� 00�� �����Դϴ�
//>>�Է������� �ٽ� Ȯ���ϼ���(000000-00000000)

public class Ex02 {//�������ڵ�-validation�� Exceptionó�� ������� ó�� (�ؿ� ���. �츮���󿡼��� �Ⱦ��ϴ� ���)

	public static void main(String[] args) {
		//���� �κ� ������ ����
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String msg=null;
		char[] origin={'0','1','2','3','4','5','6','7','8','9'};
		char[] target={'��','��','��','��','��','��','��','ĥ','��','��'};
		int age=1;
		char gender='#';
		
		//validation�� �ݺ� ����
		while(true){
			System.out.print("�ֹι�ȣ(000000-0000000)>>");
			msg=sc.nextLine();
//			//�ڸ��� Ȯ��
//			if(msg.length()!=14){
//				System.out.println(">>�Է������� �ٽ� Ȯ���ϼ���(000000-00000000)");
//				continue;
//			}
//			if(msg.charAt(6)!='-'){//���� ���� ���� ������, ���� �Է��� 6������ ª���� Exception ������ ��. �� ��ĵ� �̵� �غ���
//				System.out.println(">>�Է������� �ٽ� Ȯ���ϼ���(000000-00000000)");
//				continue;
//			}
//			
//			boolean boo=false;
//			for(int i=0; i<msg.length();i++){
//				if(i==6){continue;}
//				char temp=msg.charAt(i);
//				if(!Character.isDigit(temp)){
//					System.out.println(">>�Է������� �ٽ� Ȯ���ϼ���(000000-00000000)");
//					boo=true;
//					break;
//				}
//			}
//			if(boo){continue;}//����߻��� boo=true �� while�� �ٽ� ���ư���.

			int year=0;
			try{
			year=Integer.parseInt(msg.substring(0,2));//����yy �̱�. ����� �ȵǸ� �����߻�. try~catch�� �ذ�
			}catch(NumberFormatException e){//�ѱ��Է½� ������ ���� �߻��� �����ذ�
				String temp=msg.substring(0,2);
				char[] temp2=new char[2];
				for(int i=0; i<temp.length(); i++){
					char ch=temp.charAt(i);
					for(int j=0; j<target.length; j++){
						if(target[j]==ch){
							temp2[i]=origin[j];
						}
					}
				}
				try{
				year=Integer.parseInt(new String(temp2));//�ѱ� �ƴ� ���� �Է½� �� ���� �߻�. �ٽ� try~catch ��������
				}catch(NumberFormatException ex){//���� �̸� �޶�� ��
					System.out.println(">>�Է������� �ٽ� Ȯ���ϼ���(000000-00000000)");
					continue;
				}
			}
			java.util.Date now = new java.util.Date();//�������� ���� ����yy �̱� 
			DateFormat now2 = java.text.DateFormat.getInstance();//#�̰� �� ��������
			String result = now2.format(now);
			int nowYear=Integer.parseInt(result.substring(0,2));
			gender=msg.charAt(7);
			if(gender=='1'||gender=='2'||gender=='��'||gender=='��'){
				age=(2000+nowYear)-(1900+year)+1;			
			}else{
				age=(2000+nowYear)-(2000+year)+1;		
			}
			if(gender=='1'||gender=='3'||gender=='��'||gender=='��'){
				gender='��';//#String�� �ٽ� ���� ���ϰ� �׳� �ᵵ ����			
			}else if(gender=='2'||gender=='4'||gender=='��'||gender=='��'){
				gender='��';			
			}
			break;
		}
		System.out.println(">>����� "+age+"�� "+gender+"���Դϴ�");
		sc.close();
	}//main end
}//class end