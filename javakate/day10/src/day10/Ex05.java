package day10;

public class Ex05 {
    public static void main(String[] args){
    
        String msg1="java";
        String msg2="Framework";
        String msg3=msg1+msg2;
        System.out.println(msg3);
        String msg4=msg1.concat(msg2);//ë¬¸ì?—´ ?”?•˜?Š” instance method
        System.out.println(msg4);

        System.out.println("----------------");
        String msg5="ja"+"va";
        System.out.println(msg1==msg5);//true
        String msg6="ja".concat("va");
        System.out.println(msg1==msg6);//false

        String msg7="ABCD EFG";
        System.out.println(msg7.charAt(0));//1ë²ˆì§¸ê°’ì¸ A ì¶œë ¥
        System.out.println(msg7.charAt(6));//7ë²ˆì§¸ê°’ì¸ Fì¶œë ¥
        for(int i=0; i<msg7.length(); i++){
            //ê·¸ëƒ¥ ë°°ì—´?—?„œ?Š” ë°°ì—´ëª?.length?•˜ë©? ?˜?Š”?° ë¬¸ì?—´?—?„œ?Š” ë¬¸ì?—´ëª?.length()?•´?•¼ ë¬¸ì?—´ ê¸¸ì´ ?‚˜?˜´.
            System.out.println(msg7.charAt(i));
        }

        char[] ch1={'A','B','C','D'};
        String msg8=new String(ch1);
        System.out.println(msg8);//ë¬¸ì?—´?„ ?†µ?•´ ìºë¦­?„° ë°°ì—´?„ ?–»?–´?‚´ë³´ì
        String msg9="ABCD";
        char[] ch2=msg9.toCharArray();
        for(int i=0; i<ch2.length; i++){
            System.out.println(ch2[i]);
        }

    } 
}