package rockScissorsPaper;

//�����ϸ� �ٽ� �ĺ� �ڵ�

public class RSP001M3 {

	public static void main(String[] args) {
	
		System.out.println("---------------------------");
		System.out.println("���������� ���� (ver 0.0.1)");
		System.out.println("---------------------------");
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int input=1;
		int pc=0;
		int win=0;
		int lose=0;
		int save=0;
		int cnt=0;
		
		while(input!=0){//����ڰ� 0.���� ���� ������
			System.out.print("1.���� 2.���� 3.�� 0.����>>");
			input=sc.nextInt();//����� ��ǲ
			if(input==0){break;}
			pc=(int)(Math.random()*3)+1;//1,2,3 ���� ���� �̱�
			cnt++;
			if(input==pc){//��� ���
				switch(input){
				case 1: System.out.print("���: ���� ��ǻ��: ����"); break;
				case 2: System.out.print("���: ���� ��ǻ��: ����"); break;
				case 3: System.out.print("���: �� ��ǻ��: ��"); break;
				}
				System.out.println("�����ϴ�");
				save++;
			}else if(input==1){//�� ����
				if(pc==2){//�� ���� 
					System.out.print("���: ���� ��ǻ��: ����");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
					lose++;
				}else{//�� 3��
					System.out.print("���: ���� ��ǻ��: ��");
					System.out.println("����� �̰���ϴ�");
					win++;
				}
			}else if(input==2){//�� ����
				if(pc==3){//�� �� 
					System.out.print("���: ���� ��ǻ��: ��");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
					lose++;
				}else{//�� 1����
					System.out.print("���: ���� ��ǻ��: ����");
					System.out.println("����� �̰���ϴ�");
					win++;
				}
			}else if(input==3){//�� ��
				if(pc==1){//�� ���� 
					System.out.print("���: �� ��ǻ��: ����");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
					lose++;
				}else{//�� 2����
					System.out.print("���: �� ��ǻ��: ����");
					System.out.println("����� �̰���ϴ�");
					win++;
				}
			}else{
				System.out.println("������� Ȯ�����ּ���");
			}
		}//while end
		
		System.out.println("��"+cnt+"���� "+win+"��"+save+"��"+lose+"��");
		
	}//main end
}//class end