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
        System.out.println(Character.MAX_VALUE);//font ?λ§μ? μΆλ ₯ ?? κ²?
        System.out.println(Character.MIN_VALUE);//λΉμΉΈ μΆλ ₯

        System.out.println(ch2+"? ? ?μ½λ?Έκ°??"+Character.isDefined(ch2));
        System.out.println(ch2+"? ?«??Έκ°??"+Character.isDigit(ch2)); //0~9?Έμ§?λ₯? ?λ³?
        System.out.println(ch2+"? λ¬Έμ?Έκ°??"+Character.isAlphabetic(ch2));//??λ²? λΏ? ???Ό λ¬Έμλ©? true. κ·? ? Letterκ°? μΆκ????΄ Letterλ₯? ?°λ©? ? ?Έ?¨. κ·Έλ? ??  κ²μ?? ?? μ§? ??. ?? κ·? ?΄? ? ??±? μ½λ?€ λͺ»μΈ??.
        System.out.println(ch2+"? λ¬Έμ?Έκ°??"+Character.isLetter(ch2));
        System.out.println(ch2+"? ???λ¬Έμ?Έκ°??"+Character.isUpperCase(ch2));// ? μ€? ??κ°? trueλ©? ?λ¬? ??λ²³μ΄??? ?»
        System.out.println(ch2+"? ?λ¬Έμ?Έκ°??"+Character.isLowerCase(ch2));
        System.out.println(ch2+"??΄?°κΈ°μΈκ°??"+Character.isSpace(ch2));//κ³? ??΄μ§? ?? ?΄?Ό ???Όλ‘? μ€? κ°?.
        System.out.println(ch2+"??΄?°κΈ°μΈκ°??"+Character.isWhitespace(ch2));//λ³΄λ€ λͺν?κ²? λ°λ??


    }

}