package com.bit.day11;

public class Ex03 {
    public static void main(String[] args){
        //?€? ????. Integer??? λ³??, λ©μ?? κ±°μ ??Ό. ?€λ₯? κ²λ§ ?΄λ³΄μ
        Double su2;
        su2=new Double("3.14");
        System.out.println(su2);//3.14 μΆλ ₯

        Double su3=new Double(3.14);
        System.out.println(su3);//3.14 μΆλ ₯

        double su4=Double.parseDouble("3.14");//?€?κ²°κ³Όλ‘? λ°ν
        System.out.println(su4);//3.14 μΆλ ₯

        // int su5=Integer.parseInt(su2); ?€λ₯λ¨
        // System.out.println(su5); ??¨

        double su6=su3.doubleValue();//3.14 μΆλ ₯
        System.out.println(su6);//3.14 μΆλ ₯

        int su7=su3.intValue();//3 μΆλ ₯
        System.out.println(su7);//3 μΆλ ₯

        Double su8=2.0/3.0;
        System.out.println(su8);//0.6666666666666666 μΆλ ₯
        su8=2.0/0.0;
        System.out.println(su8);//Infinity μΆλ ₯. μ»΄ν¨?°κ°? ?°?°?  ? ??. λ§μ?Ό ?¨.
        System.out.println(su8.isInfinite());//Infinity λ©? true μΆλ ₯. ??λ©? false
        su8=0.0/0.0;
        System.out.println(su8);//λΆμκ°? κ°μλ‘? 0?Όλ‘? ?? ΄???°, λΆμ λΆλͺ¨ ? ?€ 0?Όλ‘? ?? ΄?λ©?  NaN (not a number) μΆλ ₯. κ³μ° λΆκ??
        System.out.println(su8.isNaN());//NaN λ©? true μΆλ ₯. ??λ©? false

        Float su1=new Float(3.14F);//float ??? ??. κ·Έλ₯ 3.14λ‘? doubleλ§? ?¨? ?κΈ? ?¨
        System.out.println(su1);//

    }
}