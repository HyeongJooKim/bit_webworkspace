package day09;

public class Ex03 {
    
    final int su;

    Ex03(int a){
        su=a;
    }

    public static void main(String[] args){
        //?ƒ?ˆ˜?˜• ë³??ˆ˜. ?´ë¦„ì„ ???ë¬¸ìë¡œë§Œ ?“°?Š” ê²ƒì´ ?•½?†?´?‹¤.
        //final int a;//final ë¶™ì´ë©? ?” ?´?ƒ ê°’ì„ ë°”ê?? ?ˆ˜ ?—†?‹¤. a=2222;ê°? ?ˆ?œ¼ë©? ?˜¤ë¥˜ë‚¨. a=1111; ì´ˆê¸°ê°? ?•˜?‚˜ë§Œì„ finalë¡? ì¢…ë£Œ. ?” ?´?ƒ ê°’ì„ ë°”ê?? ?ˆ˜ ?—†?–´ final ì¦?, ?ƒ?ˆ˜?˜• ë³??ˆ˜?¼ ?•¨.
        //a=1111;//ë³??ˆ˜?˜ ì´ˆê¸°?™”.final?˜ ê²½ìš°?Š” ì´ˆê¸°?™”ë¥? ë°˜ë“œ?‹œ ?•´ì¤˜ì•¼ ?•¨. ì´ˆê¸°?™” ?•ˆ?•˜ë©? int?˜ default?¸ 0?œ¼ë¡? ì²˜ë¦¬?•˜ì§? ?•Šê³? ?˜¤ë¥˜ë‚¨
        //a=2222;//ë³??ˆ˜ ????…
        //Ex03 me=new Ex03();
        //System.out.println(a);

        //final double PI=3.14;
        //Ex03 me=new Ex03();
        //System.out.println(PI);

        Ex03 me=new Ex03(1111);
        Ex03 you=new Ex03(2222);
        System.out.println(me.su);
        System.out.println(you.su);

    }

}