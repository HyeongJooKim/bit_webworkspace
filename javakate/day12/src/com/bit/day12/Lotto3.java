package com.bit.day12;

public class Lotto3 {
	public static void main(String[] args) {
		int[] lotto=new int[6];
		int cnt=0;
		try{
			while(true){//조건 없이 그냥 true로 두고 값을 바꿔주지 않으면 무한으로 돌겠지
				lotto[cnt++]=(int)(Math.random()*45)+1;//이대로 두면 무한으로 뽑겠지. 그러나 try~catch 이용해서 6개까지만 뽑고 빠져나가는 것
			}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		for(int i=0; i<lotto.length; i++){
			System.out.println(lotto[i]);
		}
	}
}
