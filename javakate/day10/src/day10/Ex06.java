package day10;

public class Ex06 {
    public static void main(String[] args){
        int[] arr1={1,3,5,7,9};

        System.out.println(arr1[2]);//2번값(3번째 �?)?�� 5출력
        System.out.println(arr1);//[I@15db9742 출력. 강제�? toString ?��?�� 문자?���? �??��?��?�� 출력?�� �?. ?��?��??? 같�?? ?��.
        System.out.println(arr1.toString());//[I@15db9742

        int[] arr2={1,3,5,7,9};// int[] arr2=new int[]{1,3,5,7,9};?��?�� new int[] ?��?��?�� 것이?�� ?��?��?�� false ?��?��
        System.out.println(arr1==arr2);//false. 
        
        int[] arr3=new int[]{1,3,5,7,9};
        int[] arr4=arr3;//배열?�� ?��??? 복사
        System.out.println(arr3==arr4);//true. 

        arr4[2]=10;
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);//arr4?�� 값을 바꾸�? 참조?��?�� ?��리의 값이 바�?�는 것이�?�? arr4??? ?��?��?�� arr3?�� 값도 바�??
        }

        func01(arr3);//func01(arr3);?��?��로서 func01 ?��?��?�� arr3[3]=1234;�? ?��?��?�� ?��?�� ?��. ????��?�� ?��??? 복사?�� ?��
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);//arr4?�� 값을 바꾸�? 참조?��?�� ?��리의 값이 바�?�는 것이�?�? arr4??? ?��?��?�� arr3?�� 값도 바�??
        }
    }//main end
    public static void func01(int[] su){
        su[3]=1234;

    }
}