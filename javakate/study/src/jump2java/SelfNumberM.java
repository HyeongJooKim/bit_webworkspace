package jump2java;

import java.util.ArrayList;

//어떤 자연수 n이 있을 때,
//d(n)을 n의 각 자릿수 숫자들과 n 자신을 더한 숫자라고 정의하자
//예: d(91) = 9 + 1 + 91 = 101
//이때 n을 d의 제너레이터라고 한다. 즉, 91은 101의 제너레이터다.
//어떤 숫자들은 하나 이상의 제너레이터를 가지는데, 예: 100도 101의 제너레이터.
//제너레이터가 없는 숫자들도 있다. 이런 수를 Self-Number라 부른다.
//예: 1, 3, 5, 7, 9, 20, 31은 셀프넘버들이다.
//1이상 5000보다 작은 셀프 넘버들의 합을 구하라.

public class SelfNumberM {
	
	public static void main(String[] args) {

		int begin=1;
		int end=5000;
		int sum=0;
		ArrayList<Integer> selfNumbers=new ArrayList<>();
		ArrayList<Integer> nonSelfNumbers=new ArrayList<>(); 
		
		for(int n=begin; n<end+1; n++){
			int d=n+(n/1000)+(n/100%10)+(n%100/10)+(n%10);
			nonSelfNumbers.add(d);
		}
		
		for(int n=begin; n<end+1; n++){
			if(!nonSelfNumbers.contains(n)){
				selfNumbers.add(n);
				sum+=n;
			}
		}
//		System.out.println(sn.toString());
		System.out.println(begin+"~"+end+" 중 셀프넘버는 "+selfNumbers.size()+"개이고 합은 "+sum+"(이)다.");
//		System.out.println(nsn.toString());
	}
}