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
        System.out.println(Character.MAX_VALUE);//font ?•ˆë§ì•„?„œ ì¶œë ¥ ?•ˆ?œ ê²?
        System.out.println(Character.MIN_VALUE);//ë¹ˆì¹¸ ì¶œë ¥

        System.out.println(ch2+"?Š” ?œ ?‹ˆì½”ë“œ?¸ê°??"+Character.isDefined(ch2));
        System.out.println(ch2+"?Š” ?ˆ«??¸ê°??"+Character.isDigit(ch2)); //0~9?¸ì§?ë¥? ?Œë³?
        System.out.println(ch2+"?Š” ë¬¸ì?¸ê°??"+Character.isAlphabetic(ch2));//?•Œ?ŒŒë²? ë¿? ?•„?‹ˆ?¼ ë¬¸ìë©? true. ê·? ?›„ Letterê°? ì¶”ê???˜?–´ Letterë¥? ?“°ë©? ?” ?¸?•¨. ê·¸ë˜?„ ?˜ˆ? „ ê²ƒì?? ?—†?• ì§? ?•Š?Œ. ?™œ? ê·? ?´? „?— ?‘?„±?œ ì½”ë“œ?“¤ ëª»ì“¸?…Œ?‹ˆ.
        System.out.println(ch2+"?Š” ë¬¸ì?¸ê°??"+Character.isLetter(ch2));
        System.out.println(ch2+"?Š” ???ë¬¸ì?¸ê°??"+Character.isUpperCase(ch2));// ?‘˜ ì¤? ?•˜?‚˜ê°? trueë©? ?˜ë¬? ?•Œ?ŒŒë²³ì´??? ?œ»
        System.out.println(ch2+"?Š” ?†Œë¬¸ì?¸ê°??"+Character.isLowerCase(ch2));
        System.out.println(ch2+"?„?–´?“°ê¸°ì¸ê°??"+Character.isSpace(ch2));//ê³? ?—†?–´ì§? ?˜ˆ? •?´?¼ ??™?œ¼ë¡? ì¤? ê°?.
        System.out.println(ch2+"?„?–´?“°ê¸°ì¸ê°??"+Character.isWhitespace(ch2));//ë³´ë‹¤ ëª…í™•?•˜ê²? ë°”ë??


    }

}