package day10;

public class Ex08 {
    public static void main(String[] args){
        //?‹¤ì¤‘ë°°?—´, ë°°ì—´?„ ê°?ì§?ê³? ?ˆ?Š” ë°°ì—´. main ?´ ë°°ì—´?´ë¯?ë¡? ?—¬ê¸? ë°°ì—´ ë§Œë“¤ë©? ?´ë¯? ?‹¤ì¤‘ë°°?—´?„
/*
        int[] arr1=new int[2];
        int[] arr2=new int[2];
        int[] arr3=new int[2];
        int[][] arr4=new int[3][2];//arr1, arr2, arr3?„ ê°’ìœ¼ë¡? ê°?ì§??Š” arr4ë§Œë“¬ ?¬ê¸?[ë°”ê¹¥ë°°ì—´?˜ ê¸¸ì´][ê°? ë°°ì—´?˜ ?¬ê¸?]
*/
        /*
        for(int i=0; i<arr4.length; i++){
            int[] temp=arr4[i];
            for(int j=0; j<temp.length; j++){
                System.out.println(temp[j]);//tempë¥? arr4[i]ë¡? ë°”ê¾¸ë©? ?•„?˜ì²˜ëŸ¼ ?¨
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
        int[] arr1 = new int[] { 1, 2 };// 7~10, 21~26?„ ?•©ì³ì„œ ì§§ê²Œ ?‹¤?‹œ ?“°ë©? ?´? ‡ê²? ?“¸ ?ˆ˜ ?ˆ?‹¤.
        int[] arr2 = new int[] { 3, 4, 7 };// ?¬ê¸°ë?? 2ê°œì—?„œ 3ê°œë¡œ ?Š˜? ¤?„ ??œ ë¡?ê²? arr4?—?„œ ?¸?‹?¨
        int[] arr3 = new int[] { 5, 6, 7, 8 };
        int[][] arr4 = new int[][] { arr1, arr2, arr3 };// int ë°°ì—´ë§? ê°?ì§?ë©? ?¨. ë°°ì—´?˜ ?¬ê¸°ëŠ” ??œ ?„. ?”°?¼?„œ ë©¤ë²„ ë°°ì—´?˜ ?¬ê¸°ë?? ì¡°ì •?•  ?ˆ˜ ?ˆ?Œ
        // int[][] arr4=new int[3][];//?´?Ÿ° ê²½ìš°?Š” ê°’ë°°?—´?´ undefined?´ë¯?ë¡? nullë¡? ?¸?‹. length ì¶œë ¥?•˜ë©?
        // null ?‚˜?˜´ ì¦? ?•„?˜?¸ ?…ˆ
        // int[][] arr4=new int[3][]{null, null, null};
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] == null) {
                continue;
            } // ê°’ì´ null?´?–´?„ ?˜¤ë¥˜ë‚˜ì§? ?•Šê²?.
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.println(arr4[i][j]);
            }
        }
    }
}