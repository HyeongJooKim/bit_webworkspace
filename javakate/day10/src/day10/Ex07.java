package day10;

public class Ex07 {
    public static void main(String[] args){
    
        int[] arr;//λ°°μ΄? ? ?Έ
        arr=new int[5];//λ°°μ΄? μ΄κΈ°?. μ΄κΈ°? ??λ©? int? default κ°μΈ 0?Έ ??΄κ³? μ΄κΈ°? ??΄? ?Έ ? ??€.
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);//0λ§? μΆλ ₯?¨
        }
        //λ°°μ΄? κΉμ?? λ³΅μ¬(κ°μ΄ λͺ¨λ ??Ό? λ°°μ΄? λ§λ€?΄ ?΄? κ²?. ????λ³΅μ¬? κ°μ΄ ?? μ£Όμλ§? λ³΅μ¬? κ²?)
        int[] arr1=new int[]{2,4,6,8};
        int[] arr2=new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            arr2[i]=arr1[i];//arr1? κ°? κ°μ arr2? ????.
        }

        arr1[1]=1234;//arr1? κ°μ λ°κΏ? arr2?? ??₯ ?μ€?.
        
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
                
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr2[i]);
        }
    
    
    }//main end
}