// package com.bit.day11;
// final class Lec13{//class? final λΆμ΄λ©? ??λΆκ??? classλ‘? ?λ¬΄λ ???  ? ??. ?? κ±°λ??
//     public void func01(){
//         System.out.println("func01");
//     }
//     private void func02(){
//         System.out.println("func02");
//     }
// }

// public class Ex13 extends Lec13 {

//     public void func01(){
//         super.func01();//λΆ?λͺ? κΈ°λ₯ λ°μ?€? κ²?.
//         System.out.println("Ex13 func01");//overriding??΄ ?΄ κ°λ§ ?ΈμΆ?
//     }
//     void func02(){};

// //method overring μ£Όμ: ? κ·Όμ ??΄ ?΄λ¦¬λ λ°©ν₯?Όλ‘λ§ κ°??₯?¨. public>default>private
// //μ¦?, public--> public κ°??₯, private-->private κ°??₯, private--> public κ°??₯ (λ°λ??λ°©ν₯??? ??¨)
//     public static void main(String[] args){
//         Ex13 me=new Ex13();
//         me.func01();
//         me.func02();//λΆ?λͺ? class?¬? private?? ? κ·? λΆκ??.
//     }
    
// }