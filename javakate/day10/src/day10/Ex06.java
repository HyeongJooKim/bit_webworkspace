package day10;

public class Ex06 {
    public static void main(String[] args){
        int[] arr1={1,3,5,7,9};

        System.out.println(arr1[2]);//2ë²ˆê°’(3ë²ˆì§¸ ê°?)?¸ 5ì¶œë ¥
        System.out.println(arr1);//[I@15db9742 ì¶œë ¥. ê°•ì œë¡? toString ?•´?„œ ë¬¸ì?—´ë¡? ë³??™˜?•´?„œ ì¶œë ¥?•œ ê²?. ?•„?˜??? ê°™ì?? ?…ˆ.
        System.out.println(arr1.toString());//[I@15db9742

        int[] arr2={1,3,5,7,9};// int[] arr2=new int[]{1,3,5,7,9};?—?„œ new int[] ?ƒ?µ?œ ê²ƒì´?¼ ?•„?˜?Š” false ?‚˜?˜´
        System.out.println(arr1==arr2);//false. 
        
        int[] arr3=new int[]{1,3,5,7,9};
        int[] arr4=arr3;//ë°°ì—´?˜ ?˜…??? ë³µì‚¬
        System.out.println(arr3==arr4);//true. 

        arr4[2]=10;
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);//arr4?˜ ê°’ì„ ë°”ê¾¸ë©? ì°¸ì¡°?•˜?Š” ?ë¦¬ì˜ ê°’ì´ ë°”ë?ŒëŠ” ê²ƒì´ë¯?ë¡? arr4??? ?™?¼?•œ arr3?˜ ê°’ë„ ë°”ë??
        }

        func01(arr3);//func01(arr3);?•¨?œ¼ë¡œì„œ func01 ?•ˆ?—?„œ arr3[3]=1234;ê°? ?…? ¥?´ ?˜?Š” ?…ˆ. ????‘œ?  ?˜…??? ë³µì‚¬?˜ ?˜ˆ
        for(int i=0; i<arr3.length; i++){
            System.out.println(arr3[i]);//arr4?˜ ê°’ì„ ë°”ê¾¸ë©? ì°¸ì¡°?•˜?Š” ?ë¦¬ì˜ ê°’ì´ ë°”ë?ŒëŠ” ê²ƒì´ë¯?ë¡? arr4??? ?™?¼?•œ arr3?˜ ê°’ë„ ë°”ë??
        }
    }//main end
    public static void func01(int[] su){
        su[3]=1234;

    }
}