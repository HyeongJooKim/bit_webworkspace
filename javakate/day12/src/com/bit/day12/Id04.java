package com.bit.day12;

public class Id04 {

	public static void main(String[] args) {
		//������ �ڵ�3. validation �κи� �� ����
		
		java.util.Scanner sc=null;
		sc=new java.util.Scanner(System.in);
		String input=null;
		char[] ju1=new char[6];//�ֹι�ȣ �� 6�ڸ�
		char[] ju2=new char[7];//�ֹι�ȣ �� 7�ڸ�
		System.out.print("�ֹι�ȣ�Է�: ");
		input=sc.nextLine();
		try{//�迭 ���̿� �ٸ� ���� �Էµ� ���� ���
			//validation
	
			for(int i=0; i<ju1.length; i++){
				ju1[i]=(char)('0'+Integer.parseInt(""+input.charAt(i)));
			}
			if(input.charAt(6)!='-'){
				Exception err=new Exception();
				throw err;
			}
			for(int i=0; i<ju2.length; i++){
				ju2[i]=(char)('0'+Integer.parseInt(""+input.charAt(i+ju1.length+1)));
			}
		}catch(Exception e){
			System.out.println(">>�Է������� �ٽ� Ȯ���ϼ���(000000-0000000)");
		}
	}

}
