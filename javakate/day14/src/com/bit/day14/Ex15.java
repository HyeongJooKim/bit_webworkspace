package com.bit.day14;

public class Ex15 {

	public static void main(String[] args) {
//		int[] arr1={1,3,5,7};
//		System.out.println(arr1);//배열의 주소 출력
//		System.out.println(arr1.toString());//이거랑 다르다
//		System.out.println(java.util.Arrays.toString(arr1));//배열 출력
//
//		//배열 전체 복사
////		int[] arr2=new int[arr1.length];
////		for(int i=0; i<arr1.length; i++){
////			arr2[i]=arr1[i];
////		}
////
////		int[] arr3=new int[arr1.length];
////		System.arraycopy(arr1,  0,  arr3,  0,  arr1.length);
////		
////		int[] arr4=java.util.Arrays.copyOf(arr1,  arr1.length);
////		System.out.println(java.util.Arrays.toString(arr4));
//		
//		//배열 일부 복사
//		int[] arr2=new int[2];
//		for(int i=0; i<arr2.length; i++){
//			arr2[i]=arr1[i+1];
//		}
//
//		int[] arr3=new int[2];
//		System.arraycopy(arr1, 1,  arr3,  0, 2);
//		
//		int[] arr4=java.util.Arrays.copyOfRange(arr1,1,3);
//		System.out.println(java.util.Arrays.toString(arr4));

		int[] rans={41,2,23,10,11,28};
		java.util.Arrays.sort(rans);//
		System.out.println(java.util.Arrays.toString(rans));//[2, 10, 11, 23, 28, 41] 출력
		System.out.println(java.util.Arrays.binarySearch(rans, 28)); //소팅 이후 하면 4 잘 출력됨. 소트 안하고 하면 이상한 값 나옴
		
	}

}
