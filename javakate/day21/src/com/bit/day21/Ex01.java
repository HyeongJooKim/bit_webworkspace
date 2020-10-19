package com.bit.day21;

import java.io.IOException;

//IO - ����� ���Ϸ� �ؼ� �����غ� �Ŵ�. �ֿܼ� �ϴ� �͵� �� IO����.
//���� �ٷ��

public class Ex01 {

	public static void main(String[] args) throws IOException{

//		String path="C:\\javakate\\day21\\test01";//�̷� �� ������
//		String path="C:\\javakate\\day21\\src";
//		String path="test01";//�̷��Ե� �Ǵ� ������? ���� ��������?
//		String path="./test01";//�տ� ./ ������ �ִ� ��
		String path=".";//���� ���丮 
		//������ ��Ŭ�������� �ڵ������� �������� �����ϰ� java project name ������ �� ���丮�� �ν��ϴ� ��
//		String path="..";//���� ���丮 
//		String path="..\\day21\\test01";//���� ���丮 ���ٰ� �ٽ� �� ��.
		//�̷��� �� ��ġ���� �����ؼ� �Դ� ���� �ϴ� ��θ� ����ζ� ��.
		
		java.io.File file=new java.io.File(path);
		//default ������ ��� ���� ������. (path)ó�� ���� �־���� ��.
		//file ����: ��Ŭ�� File ����, property���� Location ������ path�� �־���.
		//�׷��� \������ ������. \\����� ��.
		System.out.println(path);//C:\javakate\day21\test01 �� ����
		
		//���� ���� �־ ���� �ȳ��Ƿ� �ִ� ��ü���� Ȯ������
		System.out.println("��������?\t"+file.exists());//true
		//Windows������ ���ϸ�.Ȯ���� ��Ģ������
		//UNIX�迭������ .���ϸ� �� ���� �����̶� ��. .���� �� ���� ������ �ᱹ �����̹Ƿ�
		//UNIX�迭���� Ȯ���� ���� ���ϵ� ����.
		//Windows 10 ������ ���ϸ� ���� ������ ���� �� ������. cmd���� ���������� ����.
		System.out.println("�����ΰ�?\t"+file.isFile());//true
		System.out.println("���丮�ΰ�?\t"+file.isDirectory());//false
		System.out.println("�̸���?\t\t"+file.getName());//
		System.out.println("��δ�?\t\t"+file.getPath());//��ü ��δ� �ȳ���. ���� ���� �� �� ��θ� ����.
		System.out.println("�ܼ������δ�?\t"+file.getAbsolutePath());//�߰��� ����� ������ �� ������ �װ͵� ���� ����
		System.out.println("�Ϲ������δ�?\t"+file.getCanonicalPath());//�߰��� ����� ������ �� �����ϰ� �����θ� �� �����µ� Exception ������. Exception ó���ϸ� ��
		System.out.println("Path��?\t\t"+file.getParent());//���� ��α���
		System.out.println("rwx r�б����?\t"+file.canRead());
		System.out.println("rwx w�������?\t"+file.canWrite());
		System.out.println("rwx x�������?\t"+file.canExecute());
		System.out.println("����ũ���?\t"+file.length()+"byte");
		System.out.println("���������ð�?\t"+file.lastModified());//1000���� 1�ʷ� ����
		System.out.println("���������ð�?\t"+new java.util.Date(file.lastModified()));
		System.out.println("--------------------------------");
		String[] dirs=file.list();
		for(int i=0; i<dirs.length; i++){
			System.out.println(dirs[i]);
		}
		System.out.println("--------------------------------");
		System.out.println(java.util.Arrays.toString(dirs));//for �� ���ϰ� ���
		System.out.println("--------------------------------");
		String path2=file.getParent();
		
		
		
	}

}
