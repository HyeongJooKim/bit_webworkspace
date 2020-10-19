package com.bit.day11;

public class Ex03 {
    public static void main(String[] args){
        //?‹¤?ˆ˜ ????…. Integer??? ë³??ˆ˜, ë©”ì†Œ?“œ?Š” ê±°ì˜ ?™?¼. ?‹¤ë¥? ê²ƒë§Œ ?•´ë³´ì
        Double su2;
        su2=new Double("3.14");
        System.out.println(su2);//3.14 ì¶œë ¥

        Double su3=new Double(3.14);
        System.out.println(su3);//3.14 ì¶œë ¥

        double su4=Double.parseDouble("3.14");//?‹¤?ˆ˜ê²°ê³¼ë¡? ë°˜í™˜
        System.out.println(su4);//3.14 ì¶œë ¥

        // int su5=Integer.parseInt(su2); ?˜¤ë¥˜ë‚¨
        // System.out.println(su5); ?•ˆ?¨

        double su6=su3.doubleValue();//3.14 ì¶œë ¥
        System.out.println(su6);//3.14 ì¶œë ¥

        int su7=su3.intValue();//3 ì¶œë ¥
        System.out.println(su7);//3 ì¶œë ¥

        Double su8=2.0/3.0;
        System.out.println(su8);//0.6666666666666666 ì¶œë ¥
        su8=2.0/0.0;
        System.out.println(su8);//Infinity ì¶œë ¥. ì»´í“¨?„°ê°? ?—°?‚°?•  ?ˆ˜ ?—†?Œ. ë§‰ì•„?•¼ ?•¨.
        System.out.println(su8.isInfinite());//Infinity ë©? true ì¶œë ¥. ?•„?‹ˆë©? false
        su8=0.0/0.0;
        System.out.println(su8);//ë¶„ìê°? ê°ˆìˆ˜ë¡? 0?œ¼ë¡? ?ˆ˜? ´?•˜?Š”?°, ë¶„ì ë¶„ëª¨ ?‘˜ ?‹¤ 0?œ¼ë¡? ?ˆ˜? ´?•˜ë©?  NaN (not a number) ì¶œë ¥. ê³„ì‚° ë¶ˆê??
        System.out.println(su8.isNaN());//NaN ë©? true ì¶œë ¥. ?•„?‹ˆë©? false

        Float su1=new Float(3.14F);//float ?˜•?„?„ ?‘œ?‹œ. ê·¸ëƒ¥ 3.14ë¡? doubleë§? ?¨?„ ?˜ê¸? ?¨
        System.out.println(su1);//

    }
}