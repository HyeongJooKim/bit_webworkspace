package com.bit.day11;

public class Ex05 {
    public static void main(String[] args) {
        
        char ch1='A';
        Character ch2=new Character(ch1);
        Character ch3=new Character('A');
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);

        System.out.println(Character.BYTES);//2
        System.out.println(Character.SIZE);//16
        System.out.println(Character.MAX_VALUE);//font ?��맞아?�� 출력 ?��?�� �?
        System.out.println(Character.MIN_VALUE);//빈칸 출력

        System.out.println(ch2+"?�� ?��?��코드?���??"+Character.isDefined(ch2));
        System.out.println(ch2+"?�� ?��?��?���??"+Character.isDigit(ch2)); //0~9?���?�? ?���?
        System.out.println(ch2+"?�� 문자?���??"+Character.isAlphabetic(ch2));//?��?���? �? ?��?��?�� 문자�? true. �? ?�� Letter�? 추�???��?�� Letter�? ?���? ?�� ?��?��. 그래?�� ?��?�� 것�?? ?��?���? ?��?��. ?��? �? ?��?��?�� ?��?��?�� 코드?�� 못쓸?��?��.
        System.out.println(ch2+"?�� 문자?���??"+Character.isLetter(ch2));
        System.out.println(ch2+"?�� ???문자?���??"+Character.isUpperCase(ch2));// ?�� �? ?��?���? true�? ?���? ?��?��벳이??? ?��
        System.out.println(ch2+"?�� ?��문자?���??"+Character.isLowerCase(ch2));
        System.out.println(ch2+"?��?��?��기인�??"+Character.isSpace(ch2));//�? ?��?���? ?��?��?��?�� ?��?��?���? �? �?.
        System.out.println(ch2+"?��?��?��기인�??"+Character.isWhitespace(ch2));//보다 명확?���? 바�??


    }

}