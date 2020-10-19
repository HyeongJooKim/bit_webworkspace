package com.bit.day11;

public class Ex02 {
    public static void main(String[] args){
        //wrapping class ê³„ì†
        //byte <-> Byte
        //short <-> Short
        //long <-> Long
        byte su11=10;
        Byte su1=new Byte(su11);
        // Byte su1=new Byte(10);//  ?˜¤ë¥˜ë‚¨. byte ê°’ì„ ?„£?–´?•¼ ?•˜?Š”?° 10??? int ?´ë¯?ë¡? ?” ?‘??? byte ë¡? ??™?˜•ë³??™˜ ë¶ˆê??
        // short su22=10;
        // Short su2=new Short(su22); //(10) ?„£?œ¼ë©? ë§ˆì°¬ê°?ì§?ë¡? ?˜¤ë¥˜ë‚¨. 10??? int ?´ë¯?ë¡? ë²”ìœ„ ?‹¤ë¥? short?œ¼ë¡? ??™?˜•ë³??™˜ ë¶ˆê??
        // Long su3=new Long(10); //Long?˜ ê²½ìš°?Š” intë¥? ?„£?–´?„ long?œ¼ë¡? autocasting ?•¨. ëª…í™•?•˜ê²? ?•˜? ¤ë©? (10L)ë¡? ?¨?„œ long type?„?„ ?‘œ?‹œ?•´ì£¼ë©´ ?¨
        System.out.println(su1);



    }


}