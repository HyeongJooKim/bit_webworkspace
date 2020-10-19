package com.bit.day16;
//StudentVO를 동적할당하여 배열의 크기와 상관 없이 사용하게 해주는 클래스

public class StudentArrayUtil {
	
	//배열의 크기를 1 늘려주는 메소드
	private static StudentVO[] expand(StudentVO[] arr){
		StudentVO[] temp=new StudentVO[arr.length];
		for(int i=0; i<arr.length; i++){
			temp[i]=arr[i];
		}
		arr=new StudentVO[temp.length+1];
		for(int i=0; i<temp.length; i++){
			arr[i]=temp[i];
		}
		return arr;
	}
	
	//베열에 값을 더하는 메소드
	public static StudentVO[] add(StudentVO[] arr, StudentVO s){
		arr=expand(arr);//배열의 크기를 하나 늘리고
		arr[arr.length-1]=s;//배열의 마지막 칸에 값 입력하기
		return arr;
		//parameter에 있는 이름은 설명일 뿐, 실재하지 않음.
		//거기 넣은 값이 아래에서 계산에 대입된다는 것을 보여주는 것 뿐.
		//즉 arr 이라는 배열은 아직 없다
	}
	
	//배열에서 해당 객체가 몇번째 인덱스인지 알려주는 메소드
		//객체를 비교할 때는 비교연산자가 아닌 method를 통해서 비교해야 한다.
		//왜냐 비교연산자는 저장된 값이 아닌 주소값만을 비교하기 때문에.
		//equals method를 만들어보자.: StudentVO.equals 만듬. 
		
		//다음으로 몇번째 index인지 확인할 때
		//우리 배열에 없는 애의 인덱스를 요구하게 된다면?
		//배열에서 절대 존재할 수 없는 음의 정수 인덱스를 주면 됨.
		//음의 정수 중 가장 간단한 -1을 리턴하게 만들어 주면 됨
	public static int indexOf(StudentVO[] arr, StudentVO s){
		for(int i=0; i<arr.length; i++){
			if(s.equals(arr[i])){
				return i;
			}//하나라도 있으면 그 index 번호를 리턴
		}
		return -1;//배열에 없는 값일 경우 리턴값
	}
	
	//만약 배열에서 특정 객체를 제거하고 크기도 -1할려면?
	//1단계. 해당 배열에 그 객체가 존재하는지 확인. 없으면 그냥 그대로 둠
	//2단계. 존재하면, 2개의 배열을 만들어서 0~그번호까지 복사, 그번호다음부터 끝까지 복사
	//3단계. 두 배열을 하나로 합체
	//다른 방법
	//2단계.존재하면, 기존 배열을 temp에 복사
	//3단계. 기존 배열의 크기를 하나 줄여 새로 만든다.
	//4단계. 템프의 내용을 복사하되 indexOf가 같을 땐 복사하지 않는다.
	//* 참고: continue;로 끊는 코딩 나쁜 코딩, 너무 복잡해서 스파게티 코드라 하고 쓰지 말라는 추세
	public static StudentVO[] remove(StudentVO[] arr, StudentVO s){
		if(indexOf(arr, s)!=-1){// 존재하는 값이므로 고고
			int index=indexOf(arr, s);
			StudentVO[]  temp=new StudentVO[arr.length];
			for(int i=0; i<indexOf(arr,s); i++){
				temp[i]=arr[i];
			}
			arr=new StudentVO[temp.length-1];
			for(int i=0; i<temp.length; i++){
				if(i<index){
					arr[i]=temp[i];
				}else if(i>index){
					arr[i-1]=temp[i];					
				}
			}
		}
		return arr;
	}
	
}
