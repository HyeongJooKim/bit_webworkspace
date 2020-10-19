package com.bit.day11;

class Father{
    int money=1000;

    void work(){
        money+=100;
        System.out.println("?ˆ ë²Œì–´?˜¨?‹¤");
    }

    void push(){
        money-=10;
    }
}

class Son extends Father{//?ƒ?† ë°›ìœ¼ë©? ?‚˜?•œ?…Œ ?—†?Š” ê¸°ëŠ¥?„ ???
    int money=0;//ê·¸ëŸ¬?‚˜
    void work(){
        money+=10;
        System.out.println("?š©?ˆ?„ ë°›ëŠ”?‹¤");
    }//?ƒ?† ë°›ì•˜?Œ?—?„, ?‚˜?•œ?…Œ?„ ?™?¼?•œ ê¸°ëŠ¥?´ ?ˆ?œ¼ë©? ?ƒ?†ë°›ì?? ê¸°ëŠ¥ ë§ê³  ?‚´ ê¸°ëŠ¥?„ ???.
    //?´ê²ƒì„ method overriding?´?¼ ?•¨. ?ƒ?†ë°›ì?? ê²½ìš°ë§? ë°œìƒ?•˜?Š” ê²½ìš°. field?Š” overriding ?•ˆ?¨.
}

public class Ex10 {
    public static void main(String[] args) {
        // Father fa=new Father();
        // System.out.println(fa.money);
        // fa.work();
        // fa.work();
        // fa.work();
        // fa.push();
        // System.out.println(fa.money);
        
        // Son son=new Son();
        // System.out.println(son.money);
        // son.work();
        // System.out.println(son.money);

        Ex10 me=new Ex10();
        System.out.println(me.toString());//toString ? •?˜?•ˆ?–ˆ?Š”?°?„ ?‹¤?–‰?¨. ?™œ?
        System.out.println(me.hashCode());//? •?˜?•ˆ?–ˆ?Š”?°?„ ?‹¤?–‰?¨. ?™œ?
        System.out.println(me);//?•„ë¬´ê²ƒ?„ ì¶œë ¥?•  ê²ƒì´ ?—†?œ¼ë©? toString ê²°ê³¼ë¥? ì¶œë ¥?•¨

        // Object obj=new Object();
        // System.out.println(obj.toString());//Objecrt class?— ? •?˜?˜?–´ ?ˆ?œ¼ë¯?ë¡?
    }

    public String toString(){//?´? ‡ê²? ?ˆ?Š” methodë¥? ?‚´ class ?•ˆ?—?„œ ?ƒˆë¡? ? •?˜?•˜ë©? overriding?˜?–´ ?ƒˆ ê°’ì„ ?¸?‹?•œ?‹¤.
        return "?‚˜ ??‹ ";
    }
}