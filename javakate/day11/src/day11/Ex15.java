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
     public void func02(){//? κΈ°λ₯
        System.out.println("Ex15 func02");
    
     }
    public static void main(String[] args){
        //java? ?₯?  μ€? ?€??±
        Ex15 me=new Ex15();
        me.func01();
        me.func02();

    //    Lec15 me=new Ex15();//λΆ?λͺ¨ν????Όλ‘? ?΄ κ°μ²΄ ??±
        me.func01();
    //   me.func02(); type? Lec15λ‘? λ°κΎΈ? ?΄κ°? ?λ‘? λ§λ  func? ?ΈμΆ? λΆκ??

        //func02 ?ΈμΆν? €λ©?
    //    Lec15 me=new Ex15();
        me.func01();
        Ex15 you=(Ex15)me;//Ex15 type?Όλ‘? κ°μ ?λ³??. 
        //λΆ?λͺ¨μ? ???Όλ‘λ ???, ???? λΆ?λͺ¨λ‘? ???λ³???¨
    //    Lec13 me2=you;
        you.func02();
        //Integer su=new Integer(1234);
        //double su=new Double(3.14);
    //    Number su=4321;
     //   Number su=3.14;//Number? Integer, Double? λΆ?λͺ? class?΄λ―?λ‘? λ­? ?£?΄? ???λ³???¨
        //Number? μΆμ class?Όκ³? ?΄? κ°μ²΄??±?  ?? ??€.
        //Number num=new Number();//?΄? κ²λ λͺ»μ΄?€.

        func03(1234);
    }
    public static void func03(Number a){//? ?, ?€?λ₯? λͺ¨λ λ°μ. (Objact a)λ‘? ?°λ©? λͺ¨λ  ???? ?€ κ°??₯
        System.out.println(a);
    }


  
}