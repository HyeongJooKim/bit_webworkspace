package com.bit.day11;

public class Ex03 {
    public static void main(String[] args){
        //?��?�� ????��. Integer??? �??��, 메소?��?�� 거의 ?��?��. ?���? 것만 ?��보자
        Double su2;
        su2=new Double("3.14");
        System.out.println(su2);//3.14 출력

        Double su3=new Double(3.14);
        System.out.println(su3);//3.14 출력

        double su4=Double.parseDouble("3.14");//?��?��결과�? 반환
        System.out.println(su4);//3.14 출력

        // int su5=Integer.parseInt(su2); ?��류남
        // System.out.println(su5); ?��?��

        double su6=su3.doubleValue();//3.14 출력
        System.out.println(su6);//3.14 출력

        int su7=su3.intValue();//3 출력
        System.out.println(su7);//3 출력

        Double su8=2.0/3.0;
        System.out.println(su8);//0.6666666666666666 출력
        su8=2.0/0.0;
        System.out.println(su8);//Infinity 출력. 컴퓨?���? ?��?��?�� ?�� ?��?��. 막아?�� ?��.
        System.out.println(su8.isInfinite());//Infinity �? true 출력. ?��?���? false
        su8=0.0/0.0;
        System.out.println(su8);//분자�? 갈수�? 0?���? ?��?��?��?��?��, 분자 분모 ?�� ?�� 0?���? ?��?��?���?  NaN (not a number) 출력. 계산 불�??
        System.out.println(su8.isNaN());//NaN �? true 출력. ?��?���? false

        Float su1=new Float(3.14F);//float ?��?��?�� ?��?��. 그냥 3.14�? double�? ?��?�� ?���? ?��
        System.out.println(su1);//

    }
}