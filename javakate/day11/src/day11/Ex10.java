package com.bit.day11;

class Father{
    int money=1000;

    void work(){
        money+=100;
        System.out.println("? λ²μ΄?¨?€");
    }

    void push(){
        money-=10;
    }
}

class Son extends Father{//?? λ°μΌλ©? ??? ?? κΈ°λ₯? ???
    int money=0;//κ·Έλ¬?
    void work(){
        money+=10;
        System.out.println("?©?? λ°λ?€");
    }//?? λ°μ???, ???? ??Ό? κΈ°λ₯?΄ ??Όλ©? ??λ°μ?? κΈ°λ₯ λ§κ³  ?΄ κΈ°λ₯? ???.
    //?΄κ²μ method overriding?΄?Ό ?¨. ??λ°μ?? κ²½μ°λ§? λ°μ?? κ²½μ°. field? overriding ??¨.
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
        System.out.println(me.toString());//toString ? ?????°? ?€??¨. ??
        System.out.println(me.hashCode());//? ?????°? ?€??¨. ??
        System.out.println(me);//?λ¬΄κ²? μΆλ ₯?  κ²μ΄ ??Όλ©? toString κ²°κ³Όλ₯? μΆλ ₯?¨

        // Object obj=new Object();
        // System.out.println(obj.toString());//Objecrt class? ? ???΄ ??Όλ―?λ‘?
    }

    public String toString(){//?΄? κ²? ?? methodλ₯? ?΄ class ??? ?λ‘? ? ??λ©? overriding??΄ ? κ°μ ?Έ???€.
        return "? ?? ";
    }
}