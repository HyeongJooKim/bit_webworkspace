package day10;

public class Ex05 {
    public static void main(String[] args){
    
        String msg1="java";
        String msg2="Framework";
        String msg3=msg1+msg2;
        System.out.println(msg3);
        String msg4=msg1.concat(msg2);//문자?�� ?��?��?�� instance method
        System.out.println(msg4);

        System.out.println("----------------");
        String msg5="ja"+"va";
        System.out.println(msg1==msg5);//true
        String msg6="ja".concat("va");
        System.out.println(msg1==msg6);//false

        String msg7="ABCD EFG";
        System.out.println(msg7.charAt(0));//1번째값인 A 출력
        System.out.println(msg7.charAt(6));//7번째값인 F출력
        for(int i=0; i<msg7.length(); i++){
            //그냥 배열?��?��?�� 배열�?.length?���? ?��?��?�� 문자?��?��?��?�� 문자?���?.length()?��?�� 문자?�� 길이 ?��?��.
            System.out.println(msg7.charAt(i));
        }

        char[] ch1={'A','B','C','D'};
        String msg8=new String(ch1);
        System.out.println(msg8);//문자?��?�� ?��?�� 캐릭?�� 배열?�� ?��?��?��보자
        String msg9="ABCD";
        char[] ch2=msg9.toCharArray();
        for(int i=0; i<ch2.length; i++){
            System.out.println(ch2[i]);
        }

    } 
}