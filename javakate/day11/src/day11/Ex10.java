package com.bit.day11;

class Father{
    int money=1000;

    void work(){
        money+=100;
        System.out.println("?�� 벌어?��?��");
    }

    void push(){
        money-=10;
    }
}

class Son extends Father{//?��?�� 받으�? ?��?��?�� ?��?�� 기능?�� ???
    int money=0;//그러?��
    void work(){
        money+=10;
        System.out.println("?��?��?�� 받는?��");
    }//?��?�� 받았?��?��?��, ?��?��?��?�� ?��?��?�� 기능?�� ?��?���? ?��?��받�?? 기능 말고 ?�� 기능?�� ???.
    //?��것을 method overriding?��?�� ?��. ?��?��받�?? 경우�? 발생?��?�� 경우. field?�� overriding ?��?��.
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
        System.out.println(me.toString());//toString ?��?��?��?��?��?��?�� ?��?��?��. ?��?
        System.out.println(me.hashCode());//?��?��?��?��?��?��?�� ?��?��?��. ?��?
        System.out.println(me);//?��무것?�� 출력?�� 것이 ?��?���? toString 결과�? 출력?��

        // Object obj=new Object();
        // System.out.println(obj.toString());//Objecrt class?�� ?��?��?��?�� ?��?���?�?
    }

    public String toString(){//?��?���? ?��?�� method�? ?�� class ?��?��?�� ?���? ?��?��?���? overriding?��?�� ?�� 값을 ?��?��?��?��.
        return "?�� ?��?��";
    }
}