package com.bit.day11;

class Lec09{
    int su=1234;

    void func01(){
        System.out.println("Lec09 func01 run");
    }
}

public class Ex09 extends Lec09{//Lec09λ₯? ??λ°κΈ°
    public static void main(String[] args) {
    // Lec09 you=new Lec09();
    // you.func01();

    Ex09 me=new Ex09();//??λ°μΌλ©? Lec09λ₯? μ°Έμ‘°λ³??λ‘? ??΄?€μ§? ?κ³? κ·Έλ₯ ?΄?΄λ¦μ μ°Έμ‘°λ³??λ‘? ?¬?©?  ? ??€.
    me.func01();
    }
}