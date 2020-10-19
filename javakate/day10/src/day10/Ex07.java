package day10;

public class Ex07 {
    public static void main(String[] args){
    
        int[] arr;//ë°°ì—´?˜ ?„ ?–¸
        arr=new int[5];//ë°°ì—´?˜ ì´ˆê¸°?™”. ì´ˆê¸°?™” ?•ˆ?•˜ë©? int?˜ default ê°’ì¸ 0?¸ ?…ˆ?´ê³? ì´ˆê¸°?™” ?•ˆ?•´?„ ?“¸ ?ˆ˜ ?ˆ?‹¤.
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);//0ë§? ì¶œë ¥?¨
        }
        //ë°°ì—´?˜ ê¹Šì?? ë³µì‚¬(ê°’ì´ ëª¨ë‘ ?™?¼?•œ ë°°ì—´?„ ë§Œë“¤?–´ ?‚´?Š” ê²?. ?–•???ë³µì‚¬?Š” ê°’ì´ ?ˆ?Š” ì£¼ì†Œë§? ë³µì‚¬?•œ ê²?)
        int[] arr1=new int[]{2,4,6,8};
        int[] arr2=new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            arr2[i]=arr1[i];//arr1?˜ ê°? ê°’ì„ arr2?— ????….
        }

        arr1[1]=1234;//arr1?˜ ê°’ì„ ë°”ê¿”?„ arr2?—?Š” ?˜?–¥ ?•ˆì¤?.
        
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
                
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr2[i]);
        }
    
    
    }//main end
}