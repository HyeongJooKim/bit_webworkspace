package day11;

public class Ex01 {
    public static void main(String[] args){
        //?˜?¼?´?˜?Š¤(wrapper class)
        //ê¸°ë³¸?ë£Œí˜•?— ?•´?‹¹?•˜?Š” ?´?˜?Š¤?ë£Œí˜•
        //?˜¤?† ë°•ì‹±&?–¸ë°©ì‹?´ ?¼?–´?‚¨. ì¦? ê¸°ë³¸?ë£Œí˜•<->?˜?¼?´?˜?Š¤ ê°? ?ë£Œí˜•?´ ??™?œ¼ë¡? ë°”ë?ë‹¤.
        //ë°•ì‹±: ê°’ì„ ê°ì²´ë¡? ?‘˜?Ÿ¬?‹¸?Š” ê²?. ì¦?, int?¸ 1234ë¥? Interger ê°ì²´?¸ "1234"ë¡? ë°”ê¾¸?Š” ê²?
        //?–¸ë°•ì‹±: ê°ì²´????˜ ê°’ì„ ê°’ìœ¼ë¡? ë¶ˆëŸ¬?‚´?Š” ê²?
        //?˜ˆ: int <-> Integer
        int su1;
        su1=100;
        Integer su2;//int?— ?•´?‹¹?•˜?Š” ?˜?¼?´?˜?Š¤
        su2=new Integer(1000);//(ê°?)?„ ?•ˆ ?„£?œ¼ë©? ?˜¤ë¥?
        System.out.println(su2);
        System.out.println(su1+su2);//?—°?‚°?„ ê°??Š¥. ê·¸ëŸ¼ ë­ê?? ?‹¬?¼? ?™œ ?“°?‚˜?

        Integer su3=new Integer("3000");//ë¬¸ì?—´?¸ ?ˆ«?ë¥? ?ˆ«?ë¡? ?¸?‹?•  ?ˆ˜ ?ˆ?Š” ?´?˜?Š¤
        // Integer su4=new Integer("A");//ë¬¸ì?—´?— ë¬¸ìë¥? ?„£?œ¼ë©? ?˜¤ë¥?. ë¬¸ì?‘ ?ˆ«??‘ ?„?–´ ?¨?„ ?˜¤ë¥?
        System.out.println(su2+su3);//?—°?‚° ê²°ê³¼?˜ ????…??? int?„ (Integer ?•„?‹ˆê³?)
        
        Integer su4=1234;//?´? ‡ê²? ?¨?„ ?˜¤ë¥? ?•ˆ?‚¨. ì¦? Integer ????…?¸ "1234"ê°’ì„ ?•Œ?•„?„œ ?ŒŒ?•…?•œ ê²?. ?´ê²ƒì„ ?—°?‚°?•˜ë©? int 1234ë¡? auto unboxing?•¨
        System.out.println(su3+su4);//?—°?‚° ê²°ê³¼?˜ ????…??? int?„ (Integer ?•„?‹ˆê³?)
        
        // Integer class?˜ ?†?„± ?•Œ?•„ë³´ì
        // class?‹ˆê¹? ë³??ˆ˜ê°? ?ˆê² ì??
        System.out.println(Integer.MIN_VALUE);//-2147483648 ì¶œë ¥. MIN_VALUE?Š” ???ë¬¸ì?‹ˆ ?ƒ?ˆ˜?˜• ë³??ˆ˜?„¤
        System.out.println(Integer.MAX_VALUE);//2147483647 ì¶œë ¥
        System.out.println(Integer.SIZE);//32 ì¶œë ¥
        System.out.println(Integer.BYTES);//4 ì¶œë ¥

        // class?‹ˆê¹? method?„ ?ˆê² ì??
        Integer su5=new Integer(127);
        System.out.println(su5.byteValue());//127 ì¶œë ¥. ê°’ì„ byte ê°’ìœ¼ë¡? ì¶œë ¥
        su5=128;
        System.out.println(su5.byteValue());//-128 ì¶œë ¥
        System.out.println(su5.shortValue());//128 ì¶œë ¥
        System.out.println(su5.intValue());// 128 ì¶œë ¥

        // byte by=su5.byteValue();// ?´? ‡ê²? ?ë£Œí˜• ë³??™˜?´ ê°??Š¥. byteValue()?™¸?—” ?˜ ?•ˆ?“¸ ê²?
        // short sho=su5.shortValue();
        // int su=su5.intValue();
        // long su66=su5.longValue();

        Integer su7=new Integer(100);
        Integer su8=new Integer(100);
        System.out.println(su7==su8);// false ì¶œë ¥. ?ˆ«??Š” ê°™ì•„ ë³´ì—¬?„ ê°ê° ?ƒˆë¡œìš´ ê°ì²´ë¥? ì°ì–´?‚¸ ê²ƒì´ë¯?ë¡?
        System.out.println(100==su7);// true ì¶œë ¥. ?ë£Œí˜•?´ ?‹¤ë¥? ?‘˜?„ ë¹„êµ?•˜?Š” ?ˆœê°? auto-unboxing?´ ?¼?–´?‚˜ su7?˜ ê°’ì„ ?Œ?–´?‚´?„œ ë¹„êµ?•¨
        System.out.println(su7.equals(su8));// true ì¶œë ¥. equals()?Š” ê°’ì„ ë¹„êµ?•˜?Š” ë©”ì„œ?“œ

        String msg="1234";
        Integer su9=Integer.valueOf(msg);// ê°’ì?? ?½?–´?˜¤ì§?ë§? ?ë£Œí˜•??? ?—¬? „?ˆ Integer
        System.out.println(su9+1);//?—°?‚°?›„ ê²°ê³¼ê°’ì?? int type
        // int su10=Integer.parseInt(msg);//intë¡? type? „?™˜. ê°??¥ ë§ì´ ?´?š©?•¨.
        // int su99=su9;//Integer ?¸ su9ë¥? int?¸ su99?— ????…?•¨?œ¼ë¡œì„œ intë¡? type ë³??™˜

        int su11=Integer.max(12,9);
        int su12=Integer.min(12,9);
        System.out.println(su11);//12 ì¶œë ¥
        System.out.println(su12);//9 ì¶œë ¥

        int su13=0;
        int su14=Integer.reverse(su13);
        System.out.println(su13+"?˜ ë³´ìˆ˜:"+su14);//0?˜ ë³´ìˆ˜:0
 
        int su15=16;
        System.out.println("?‹­ì§„ìˆ˜:"+su15);//?‹­ì§„ìˆ˜:16
        System.out.println("2ì§„ìˆ˜:"+Integer.toBinaryString(su15));//2ì§„ìˆ˜:10000 // ê²°ê³¼ê°’ì?? String type?„
        System.out.println("8ì§„ìˆ˜: 0"+Integer.toOctalString(su15));//8ì§„ìˆ˜:020
        System.out.println("16ì§„ìˆ˜: 0x"+Integer.toHexString(su15));//16ì§„ìˆ˜:0x10

        int su16=10;
        int su17=10;
        int su18=Integer.compare(su16,su17);//?•?˜ ?ˆ˜ê°? ?¬ë©? 1, ?‘?œ¼ë©? -1, ê°™ìœ¼ë©? 0?„ ë°˜í™˜?•¨
        System.out.println(su18);//0
        Integer su19=11;
        int su20=su19.compareTo(su17);//compare??? ê°™ì?? ê¸°ëŠ¥. ?•?˜ ?ˆ˜ê°? ?¬ë©? 1, ?‘?œ¼ë©? -1, ê°™ìœ¼ë©? 0?„ ë°˜í™˜?•¨
        System.out.println(su20);//1

    }//main end
}//class Ex01 end