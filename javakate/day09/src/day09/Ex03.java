package day09;

public class Ex03 {
    
    final int su;

    Ex03(int a){
        su=a;
    }

    public static void main(String[] args){
        //??? λ³??. ?΄λ¦μ ???λ¬Έμλ‘λ§ ?°? κ²μ΄ ?½??΄?€.
        //final int a;//final λΆμ΄λ©? ? ?΄? κ°μ λ°κ?? ? ??€. a=2222;κ°? ??Όλ©? ?€λ₯λ¨. a=1111; μ΄κΈ°κ°? ??λ§μ finalλ‘? μ’λ£. ? ?΄? κ°μ λ°κ?? ? ??΄ final μ¦?, ??? λ³???Ό ?¨.
        //a=1111;//λ³??? μ΄κΈ°?.final? κ²½μ°? μ΄κΈ°?λ₯? λ°λ? ?΄μ€μΌ ?¨. μ΄κΈ°? ??λ©? int? default?Έ 0?Όλ‘? μ²λ¦¬?μ§? ?κ³? ?€λ₯λ¨
        //a=2222;//λ³?? ????
        //Ex03 me=new Ex03();
        //System.out.println(a);

        //final double PI=3.14;
        //Ex03 me=new Ex03();
        //System.out.println(PI);

        Ex03 me=new Ex03(1111);
        Ex03 you=new Ex03(2222);
        System.out.println(me.su);
        System.out.println(you.su);

    }

}