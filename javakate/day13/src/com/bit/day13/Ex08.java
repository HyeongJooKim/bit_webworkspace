package com.bit.day13;

public class Ex08 {
	
	public static void main(String[] args) {
		
		String menu="1.���� 2.�Է� 3.���� 4.���� 0.����>>";
		String ln1="�й�>";
		String ln2="����>";
		String ln3="����>";
		String ln4="����>";
		String ln="---------------------------------------------";
		String lntitle="�й�\t����\t����\t����\t�հ�\t���";
		
		int sum=0;
		int avg=0;
		
		String msg="";
		java.util.Scanner sc=new java.util.Scanner(System.in);
		String num="";
		String input="";
		int cnt=0;

		while(true){	
			System.out.println(menu);
			num=sc.nextLine();
			if(num.equals("1")){
				System.out.println(lntitle);
				System.out.println(ln);
				System.out.println(msg);
				continue;
			}else if(num.equals("2")){
				System.out.print(ln2);
				input=sc.nextLine();
				cnt++;
				msg+=(cnt)+". \t"+input+"\t";
				sum=Integer.parseInt(input);
				System.out.print(ln3);
				input=sc.nextLine();
				msg+=input+"\t";
				sum+=Integer.parseInt(input);
				System.out.print(ln4);
				input=sc.nextLine();
				msg+=input+"\t";
				sum+=Integer.parseInt(input);
				msg+=sum+"\t";
				avg=sum/3;
				msg+=avg+"\n";
				continue;
			}else if(num.equals("3")){
				System.out.print(ln1);
				input=sc.nextLine();//������ �л���ȣ ����
				int id1=msg.indexOf("\n"+input);
				int id2=msg.indexOf("\n",id1);
				String msgNew=input+"\t";
				System.out.print(ln2);
				input=sc.nextLine();
				msgNew+=input+"\t";
				sum=Integer.parseInt(input);
				System.out.print(ln3);
				input=sc.nextLine();
				msgNew+=input+"\t";
				sum+=Integer.parseInt(input);
				System.out.print(ln4);
				input=sc.nextLine();
				msgNew+=input+"\t";
				sum+=Integer.parseInt(input);
				msgNew+=sum+"\t";
				avg=sum/3;
				msgNew+=avg+"\n";
				String data1=msg.substring(0, id1+1);
				String data2=msg.substring(id2+1);
				msg=data1+msgNew+data2;
				continue;
			}else if(num.equals("4")){
				System.out.print(ln1);
				input=sc.nextLine();//������ �л���ȣ ����
				int id1=msg.indexOf("\n"+input);
				int id2=msg.indexOf("\n",id1);
				String data1=msg.substring(0, id1+1);
				String data2=msg.substring(id2+1);
				msg=data1+data2;
				continue;
			}else if(num.equals("0")){
				break;
			}
		}
	}//main end
}//class end
