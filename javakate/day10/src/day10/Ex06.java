package day10;

public class Ex06 {
    public static void main(String[] args){
        int[] arr1={1,3,5,7,9};

        System.out.println(arr1[2]);//2λ²κ°(3λ²μ§Έ κ°?)?Έ 5μΆλ ₯
        System.out.println(arr1);//[I@15db9742 μΆλ ₯. κ°μ λ‘? toString ?΄? λ¬Έμ?΄λ‘? λ³???΄? μΆλ ₯? κ²?. ????? κ°μ?? ?.
        System.out.println(arr1.toString());//[I@15db9742

        int[] arr2={1,3,5,7,9};// int[] arr2=new int[]{1,3,5,7,9};?? new int[] ??΅? κ²μ΄?Ό ??? false ??΄
        System.out.println(arr1==arr2);//false. 
        
        int[] arr3=new int[]{1,3,5,7,9};
        int[] arr4=arr3;//λ°°μ΄? ???? λ³΅μ¬
        System.out.println(arr3==arr4);//true. 

        arr4[2]=10;
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);//arr4? κ°μ λ°κΎΈλ©? μ°Έμ‘°?? ?λ¦¬μ κ°μ΄ λ°λ?λ κ²μ΄λ―?λ‘? arr4??? ??Ό? arr3? κ°λ λ°λ??
        }

        func01(arr3);//func01(arr3);?¨?Όλ‘μ func01 ??? arr3[3]=1234;κ°? ?? ₯?΄ ?? ?. ?????  ???? λ³΅μ¬? ?
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);//arr4? κ°μ λ°κΎΈλ©? μ°Έμ‘°?? ?λ¦¬μ κ°μ΄ λ°λ?λ κ²μ΄λ―?λ‘? arr4??? ??Ό? arr3? κ°λ λ°λ??
        }
    }//main end
    public static void func01(int[] su){
        su[3]=1234;

    }
}