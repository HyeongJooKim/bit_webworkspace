package com.bit.day11;

public class Ex02 {
    public static void main(String[] args){
        //wrapping class 계속
        //byte <-> Byte
        //short <-> Short
        //long <-> Long
        byte su11=10;
        Byte su1=new Byte(su11);
        // Byte su1=new Byte(10);//  ?��류남. byte 값을 ?��?��?�� ?��?��?�� 10??? int ?���?�? ?�� ?��??? byte �? ?��?��?���??�� 불�??
        // short su22=10;
        // Short su2=new Short(su22); //(10) ?��?���? 마찬�?�?�? ?��류남. 10??? int ?���?�? 범위 ?���? short?���? ?��?��?���??�� 불�??
        // Long su3=new Long(10); //Long?�� 경우?�� int�? ?��?��?�� long?���? autocasting ?��. 명확?���? ?��?���? (10L)�? ?��?�� long type?��?�� ?��?��?��주면 ?��
        System.out.println(su1);



    }


}