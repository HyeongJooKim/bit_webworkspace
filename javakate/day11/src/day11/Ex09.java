package com.bit.day11;

class Lec09{
    int su=1234;

    void func01(){
        System.out.println("Lec09 func01 run");
    }
}

public class Ex09 extends Lec09{//Lec09ë¥? ?ƒ?†ë°›ê¸°
    public static void main(String[] args) {
    // Lec09 you=new Lec09();
    // you.func01();

    Ex09 me=new Ex09();//?ƒ?†ë°›ìœ¼ë©? Lec09ë¥? ì°¸ì¡°ë³??ˆ˜ë¡? ?Œ?–´?˜¤ì§? ?•Šê³? ê·¸ëƒ¥ ?‚´?´ë¦„ì˜ ì°¸ì¡°ë³??ˆ˜ë¡? ?‚¬?š©?•  ?ˆ˜ ?ˆ?‹¤.
    me.func01();
    }
}