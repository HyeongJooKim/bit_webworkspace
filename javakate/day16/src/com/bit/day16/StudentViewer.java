package com.bit.day16;

import java.util.Scanner;

//day17. StudentViewer ��ü �� �ٽ� ����
//Ex���� �ݺ��Ǵ� ��ºκ� ����� �ű��� 
public class StudentViewer {

	//���� �Է¹޴� method
	public StudentVO setInformation(Scanner scanner){
		StudentVO s=new StudentVO(); 
		System.out.print("�̸�: ");
		s.setName(scanner.nextLine());
		System.out.print("����: ");
		s.setKorean(scanner.nextInt());
		System.out.print("����: ");
		s.setEnglish(scanner.nextInt());
		System.out.print("����: ");
		s.setMath(scanner.nextInt());
		return s;
	}
	
	//���� ����ϴ� method
	
	
	
	
	
}//class end		
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		StudentVO s = new StudentVO();
//		System.out.print("�л��� �̸��� �Է��ϼ���: ");
//		s.setName(scanner.nextLine());
//		System.out.print("�л��� ���������� �Է��ϼ���: ");
////		s.korean = scanner.nextInt();
//		s.setKorean(scanner.nextInt());
//		System.out.print("�л��� ���������� �Է��ϼ���: ");
//		s.setEnglish(scanner.nextInt());
//		System.out.print("�л��� ���������� �Է��ϼ���: ");
//		s.setMath(scanner.nextInt());
////		scanner.nextLine();
//		//nextInt(); ������ nextLine(); ��ĳ�� ���� ���ַ��� �̰� �� �� �� �־��ָ� ��.
//			//Scanner: nextLine ������ nextInt ���� ���� ���� �̾� �� �� ������,
//			//nextInt ������ nextLine ���� �����߻��ϴ���.
//			//��? nextInt()���� 15+enter�� ġ�� ���������� Ȯ���Ͽ� ������ 15�� ���� �ְ�
//			//enter �� buffer memory�� ������ ����.
//			//���⼭ nextLine�� ������ enter�� �Է°����� �ν��ؼ� �����
//			//nextInt ������ nextDouble�� ���� double ���� �� ������ ��ٸ�.
//			//nextLine������ �̷� �� �߻�
//			//nextInt ������ nextLine �ʿ��ϸ� nextLine �� �� �� ���� �����
//			//Scanner ���׸� �ذ��ϱ� ���� nextLine�� �ܵ���������� ��
//			//Eclipse�� �ڵ��ϼ� ����� ������� ������, �ڵ��ϼ��� ���ĺ������� ��õ�ؾ��� ������
//			//Scanner.hasNextLine();�� ����. ������ �̰� ���۸޸��� ���� �������� �ʰ�
//			//�ܼ��� ������ �ֳ� ������ �˷��ֹǷ� ���׸� �ذ� ����.
//			//�ݵ�� scanner.nextLine();�� ��� �����ؾ� ��.
//		
//		StudentController sc=new StudentController();
////		sc.calculateSum(s);
////		sc.calculateAverage(s);
//		
//		System.out.printf(
//				"�л��̸�: %s\t��������: %d\t ��������: %d\t ��������: %d\t ����: %d\t ���: %.2f",
//				s.getName(), s.getKorean(), s.getEnglish(), s.getMath(), sc.calculateSum(s), sc.calculateAverage(s));
//		scanner.close();//�Ƚᵵ �ǳ�, �޸𸮾�.

//�̷��� �����͸� ��� Ʋ(��). UI(��), ���� ��Ʈ���ϴ� ��Ʈ�ѷ��� �и��ؼ�
//���α׷��� ����� ������ MVC �����̶�� �� (Model View Controller Pattern)
