package com.bit.day11;

class Lec09{
    int su=1234;

    void func01(){
        System.out.println("Lec09 func01 run");
    }
}

public class Ex09 extends Lec09{//Lec09�? ?��?��받기
    public static void main(String[] args) {
    // Lec09 you=new Lec09();
    // you.func01();

    Ex09 me=new Ex09();//?��?��받으�? Lec09�? 참조�??���? ?��?��?���? ?���? 그냥 ?��?��름의 참조�??���? ?��?��?�� ?�� ?��?��.
    me.func01();
    }
}