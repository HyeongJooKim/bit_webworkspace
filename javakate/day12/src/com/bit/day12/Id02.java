package com.bit.day12;

public class Id02 {

	public static void main(String[] args) {
        // �ֹι�ȣ�Է�: 090206-3124567
        // >>����� 00�� �����Դϴ�
        // �ֹι�ȣ�Է�: 990206-2124567
        // >>����� 00�� �����Դϴ�
        // �ֹι�ȣ�Է�: 9902062124567
        // >>�Է������� �ٽ� Ȯ���ϼ���(00000-00000000)
        // �ֹι�ȣ�Է�: 99020602124567
        // >>�Է������� �ٽ� Ȯ���ϼ���(000000-0000000)
        // �ֹι�ȣ�Է�: 990206-212456
        // >>�ֹι�ȣ �ڸ����� �ٽ� Ȯ���ϼ���(000000-0000000)

		//������ �ڵ�1. �������� ��� ��������
		
		@SuppressWarnings("resource")
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String msg=null;

		while(true){
			System.out.print("�ֹι�ȣ�Է�: ");
			msg=sc.nextLine();
			
			//�Է� �� ��� �� validation�ؾ� ��
			if(msg.length()!=14){
                System.out.println(">>�ֹι�ȣ �ڸ����� �ٽ� Ȯ���ϼ���(000000-0000000)");
                continue;//�ݺ����� ��������. ��, ���� ����� while, if�� ���ư�.
			}
			
			if(msg.charAt(6)!='-'){
                System.out.println(">>�Է������� �ٽ� Ȯ���ϼ���(000000-0000000)");
                continue;
			}
			boolean suCheck=false;
			for(int i=0; i<msg.length(); i++){
				if(i==6){continue;}
				if(!(msg.charAt(i)>='0'&&msg.charAt(i)<='9')){
					suCheck=true;
				}
			}
			if(suCheck){continue;}//������ �ƴϸ� while�� ���ư���
			
			char year1=msg.charAt(0);//** String���� ���° ���� �̾Ƴ���
			char year2=msg.charAt(1);
			int yy=(year1-'0')*10+(year2-'0')*1;
			//** ���ڹ�ȣ�� ������ '0'�� �ش��ϴ� ��ȣ�� ���� �� ���̸�ŭ�� �ش������� �ҷ��� 
			int age=0;
					
			char gender=msg.charAt(7);
			
			if(gender=='1'||gender=='2'){
				age=120-yy+1;
			}else if(gender=='3'||gender=='4'){
				age=20-yy+1;
			}	
	        System.out.print("����� "+age+"�� ");
	        		
			if(gender=='1'||gender=='3'){
				System.out.print("�����Դϴ�");
			}else if(gender=='2'||gender=='4'){
				System.out.print("�����Դϴ�");
			}
			break;
		}//while end
	}//main end
}//class end
