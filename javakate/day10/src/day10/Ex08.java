package day10;

public class Ex08 {
    public static void main(String[] args){
        //?��중배?��, 배열?�� �?�?�? ?��?�� 배열. main ?�� 배열?���?�? ?���? 배열 만들�? ?���? ?��중배?��?��
/*
        int[] arr1=new int[2];
        int[] arr2=new int[2];
        int[] arr3=new int[2];
        int[][] arr4=new int[3][2];//arr1, arr2, arr3?�� 값으�? �?�??�� arr4만듬 ?���?[바깥배열?�� 길이][�? 배열?�� ?���?]
*/
        /*
        for(int i=0; i<arr4.length; i++){
            int[] temp=arr4[i];
            for(int j=0; j<temp.length; j++){
                System.out.println(temp[j]);//temp�? arr4[i]�? 바꾸�? ?��?��처럼 ?��
            }
        }
        */
/*
        arr4[0][0]=1;
        arr4[0][1]=2;
        arr4[1][0]=3;
        arr4[1][1]=4;
        arr4[2][0]=5;
        arr4[2][1]=6;
*/
        int[] arr1 = new int[] { 1, 2 };// 7~10, 21~26?�� ?��쳐서 짧게 ?��?�� ?���? ?��?���? ?�� ?�� ?��?��.
        int[] arr2 = new int[] { 3, 4, 7 };// ?��기�?? 2개에?�� 3개로 ?��?��?�� ?��?���?�? arr4?��?�� ?��?��?��
        int[] arr3 = new int[] { 5, 6, 7, 8 };
        int[][] arr4 = new int[][] { arr1, arr2, arr3 };// int 배열�? �?�?�? ?��. 배열?�� ?��기는 ?��?��?��. ?��?��?�� 멤버 배열?�� ?��기�?? 조정?�� ?�� ?��?��
        // int[][] arr4=new int[3][];//?��?�� 경우?�� 값배?��?�� undefined?���?�? null�? ?��?��. length 출력?���?
        // null ?��?�� �? ?��?��?�� ?��
        // int[][] arr4=new int[3][]{null, null, null};
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] == null) {
                continue;
            } // 값이 null?��?��?�� ?��류나�? ?���?.
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.println(arr4[i][j]);
            }
        }
    }
}