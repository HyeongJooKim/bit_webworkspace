package day10;

public class Ex08 {
    public static void main(String[] args){
        //?€μ€λ°°?΄, λ°°μ΄? κ°?μ§?κ³? ?? λ°°μ΄. main ?΄ λ°°μ΄?΄λ―?λ‘? ?¬κΈ? λ°°μ΄ λ§λ€λ©? ?΄λ―? ?€μ€λ°°?΄?
/*
        int[] arr1=new int[2];
        int[] arr2=new int[2];
        int[] arr3=new int[2];
        int[][] arr4=new int[3][2];//arr1, arr2, arr3? κ°μΌλ‘? κ°?μ§?? arr4λ§λ¬ ?¬κΈ?[λ°κΉ₯λ°°μ΄? κΈΈμ΄][κ°? λ°°μ΄? ?¬κΈ?]
*/
        /*
        for(int i=0; i<arr4.length; i++){
            int[] temp=arr4[i];
            for(int j=0; j<temp.length; j++){
                System.out.println(temp[j]);//tempλ₯? arr4[i]λ‘? λ°κΎΈλ©? ??μ²λΌ ?¨
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
        int[] arr1 = new int[] { 1, 2 };// 7~10, 21~26? ?©μ³μ μ§§κ² ?€? ?°λ©? ?΄? κ²? ?Έ ? ??€.
        int[] arr2 = new int[] { 3, 4, 7 };// ?¬κΈ°λ?? 2κ°μ? 3κ°λ‘ ?? €? ?? λ‘?κ²? arr4?? ?Έ??¨
        int[] arr3 = new int[] { 5, 6, 7, 8 };
        int[][] arr4 = new int[][] { arr1, arr2, arr3 };// int λ°°μ΄λ§? κ°?μ§?λ©? ?¨. λ°°μ΄? ?¬κΈ°λ ?? ?. ?°?Ό? λ©€λ² λ°°μ΄? ?¬κΈ°λ?? μ‘°μ ?  ? ??
        // int[][] arr4=new int[3][];//?΄?° κ²½μ°? κ°λ°°?΄?΄ undefined?΄λ―?λ‘? nullλ‘? ?Έ?. length μΆλ ₯?λ©?
        // null ??΄ μ¦? ???Έ ?
        // int[][] arr4=new int[3][]{null, null, null};
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] == null) {
                continue;
            } // κ°μ΄ null?΄?΄? ?€λ₯λμ§? ?κ²?.
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.println(arr4[i][j]);
            }
        }
    }
}