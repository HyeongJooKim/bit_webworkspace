package com.bit.day11;

class Lec15{
 public void func01(){
    System.out.println("Lec15 func01");

 }
}
public class Ex15 extends Lec15{
    public void func01(){//override
        System.out.println("Ex15 func01");
    
     }
     public void func02(){//?ƒˆ ê¸°ëŠ¥
        System.out.println("Ex15 func02");
    
     }
    public static void main(String[] args){
        //java?˜ ?¥?  ì¤? ?‹¤?˜•?„±
        Ex15 me=new Ex15();
        me.func01();
        me.func02();

    //    Lec15 me=new Ex15();//ë¶?ëª¨í???…?œ¼ë¡? ?‚´ ê°ì²´ ?ƒ?„±
        me.func01();
    //   me.func02(); type?„ Lec15ë¡? ë°”ê¾¸?‹ˆ ?‚´ê°? ?ƒˆë¡? ë§Œë“  func?Š” ?˜¸ì¶? ë¶ˆê??

        //func02 ?˜¸ì¶œí•˜? ¤ë©?
    //    Lec15 me=new Ex15();
        me.func01();
        Ex15 you=(Ex15)me;//Ex15 type?œ¼ë¡? ê°•ì œ?˜•ë³??™˜. 
        //ë¶?ëª¨ì—?„œ ??‹?œ¼ë¡œëŠ” ?•ˆ?˜?‚˜, ??‹?—?„œ ë¶?ëª¨ë¡œ?Š” ??™?˜•ë³??™˜?¨
    //    Lec13 me2=you;
        you.func02();
        //Integer su=new Integer(1234);
        //double su=new Double(3.14);
    //    Number su=4321;
     //   Number su=3.14;//Number?Š” Integer, Double?˜ ë¶?ëª? class?´ë¯?ë¡? ë­? ?„£?–´?„ ??™?˜•ë³??™˜?¨
        //Number?Š” ì¶”ìƒ class?¼ê³? ?•´?„œ ê°ì²´?ƒ?„±?•  ?ˆ˜?Š” ?—†?‹¤.
        //Number num=new Number();//?´? ‡ê²ŒëŠ” ëª»ì“´?‹¤.

        func03(1234);
    }
    public static void func03(Number a){//? •?ˆ˜, ?‹¤?ˆ˜ë¥? ëª¨ë‘ ë°›ìŒ. (Objact a)ë¡? ?“°ë©? ëª¨ë“  ????… ?‹¤ ê°??Š¥
        System.out.println(a);
    }


  
}