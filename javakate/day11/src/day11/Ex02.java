package com.bit.day11;

public class Ex02 {
    public static void main(String[] args){
        //wrapping class κ³μ
        //byte <-> Byte
        //short <-> Short
        //long <-> Long
        byte su11=10;
        Byte su1=new Byte(su11);
        // Byte su1=new Byte(10);//  ?€λ₯λ¨. byte κ°μ ?£?΄?Ό ???° 10??? int ?΄λ―?λ‘? ? ???? byte λ‘? ???λ³?? λΆκ??
        // short su22=10;
        // Short su2=new Short(su22); //(10) ?£?Όλ©? λ§μ°¬κ°?μ§?λ‘? ?€λ₯λ¨. 10??? int ?΄λ―?λ‘? λ²μ ?€λ₯? short?Όλ‘? ???λ³?? λΆκ??
        // Long su3=new Long(10); //Long? κ²½μ°? intλ₯? ?£?΄? long?Όλ‘? autocasting ?¨. λͺν?κ²? ?? €λ©? (10L)λ‘? ?¨? long type?? ???΄μ£Όλ©΄ ?¨
        System.out.println(su1);



    }


}