package day10;

public class Ex05 {
    public static void main(String[] args){
    
        String msg1="java";
        String msg2="Framework";
        String msg3=msg1+msg2;
        System.out.println(msg3);
        String msg4=msg1.concat(msg2);//λ¬Έμ?΄ ??? instance method
        System.out.println(msg4);

        System.out.println("----------------");
        String msg5="ja"+"va";
        System.out.println(msg1==msg5);//true
        String msg6="ja".concat("va");
        System.out.println(msg1==msg6);//false

        String msg7="ABCD EFG";
        System.out.println(msg7.charAt(0));//1λ²μ§Έκ°μΈ A μΆλ ₯
        System.out.println(msg7.charAt(6));//7λ²μ§Έκ°μΈ FμΆλ ₯
        for(int i=0; i<msg7.length(); i++){
            //κ·Έλ₯ λ°°μ΄??? λ°°μ΄λͺ?.length?λ©? ???° λ¬Έμ?΄??? λ¬Έμ?΄λͺ?.length()?΄?Ό λ¬Έμ?΄ κΈΈμ΄ ??΄.
            System.out.println(msg7.charAt(i));
        }

        char[] ch1={'A','B','C','D'};
        String msg8=new String(ch1);
        System.out.println(msg8);//λ¬Έμ?΄? ?΅?΄ μΊλ¦­?° λ°°μ΄? ?»?΄?΄λ³΄μ
        String msg9="ABCD";
        char[] ch2=msg9.toCharArray();
        for(int i=0; i<ch2.length; i++){
            System.out.println(ch2[i]);
        }

    } 
}