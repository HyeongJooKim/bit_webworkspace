package jump2java;

import java.util.ArrayList;

public class SelfNumberT {
    private static ArrayList<Integer> numbersHasGenerator;

    public static void main(String[] args) {
        calculateNumbersHasGenerator();
        int sum = 0;
        for (int i = 0; i < 5001; i++)
            if (!hasGenerator(i))
                sum += i;
        System.out.println("�� : " + sum);
    }

    private static boolean hasGenerator(int num) {
        return numbersHasGenerator.contains(num);
    }   

    private static void calculateNumbersHasGenerator() {
        numbersHasGenerator = new ArrayList<Integer>();
        for (int i = 0; i <= 5000; i++) {
            String num = String.valueOf(i);
            int no = 0;//�� �ڸ��� ���� ���� ��
            for (int n = 0; n < num.length(); n++)
                no += Integer.parseInt(num.substring(n, n + 1));//�� �ڸ��� ���� �����ؼ� ����
            numbersHasGenerator.add(no + i);//�ڸ��� ���� ���� ��(no)�� �� �ڽ�(i)�� ���ؼ� �迭�� ����
        }
    }
}//�� �ڵ庸�� ���� ��: �ڸ��� �� �������� Ȯ�强 ����. ���� ���� �� 4�ڸ��������� ��. String ��� �� �߳�.