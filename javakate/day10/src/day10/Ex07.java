package day10;

public class Ex07 {
    public static void main(String[] args){
    
        int[] arr;//배열?�� ?��?��
        arr=new int[5];//배열?�� 초기?��. 초기?�� ?��?���? int?�� default 값인 0?�� ?��?���? 초기?�� ?��?��?�� ?�� ?�� ?��?��.
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);//0�? 출력?��
        }
        //배열?�� 깊�?? 복사(값이 모두 ?��?��?�� 배열?�� 만들?�� ?��?�� �?. ?��???복사?�� 값이 ?��?�� 주소�? 복사?�� �?)
        int[] arr1=new int[]{2,4,6,8};
        int[] arr2=new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            arr2[i]=arr1[i];//arr1?�� �? 값을 arr2?�� ????��.
        }

        arr1[1]=1234;//arr1?�� 값을 바꿔?�� arr2?��?�� ?��?�� ?���?.
        
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
                
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr2[i]);
        }
    
    
    }//main end
}