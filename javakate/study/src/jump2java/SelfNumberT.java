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
        System.out.println("합 : " + sum);
    }

    private static boolean hasGenerator(int num) {
        return numbersHasGenerator.contains(num);
    }   

    private static void calculateNumbersHasGenerator() {
        numbersHasGenerator = new ArrayList<Integer>();
        for (int i = 0; i <= 5000; i++) {
            String num = String.valueOf(i);
            int no = 0;//각 자리의 수를 더할 수
            for (int n = 0; n < num.length(); n++)
                no += Integer.parseInt(num.substring(n, n + 1));//각 자리의 수를 추출해서 더함
            numbersHasGenerator.add(no + i);//자리의 수를 더한 수(no)를 수 자신(i)에 더해서 배열에 넣음
        }
    }
}//내 코드보다 나은 점: 자리가 더 많아져도 확장성 있음. 내가 만든 건 4자리수까지만 됨. String 사용 잘 했네.