package day09;

class Ex02{//class?? private?°λ©? λ¬Έλ² ?€λ₯?, public?΄κ±°λ ??°κ±°λ(default)λ§? κ°??₯
    public static void main(String[] args){
        Ex01.func01();
        System.out.println(Ex01.su2);
        Ex01 you=new Ex01();
        you.func02();
        System.out.println(you.su);
        
        System.out.println(day08.Ex02.su1);//?€λ₯? package? ?€?΄ ?? public class? public λ³?? λΆλ¬?€κΈ?. ??Ό package???? public ??΄? λΆλ¬?΄
        //? κ·Όμ ??: public >> default > private (??©? ?)
        //public - ?΄??? ? κ·? ??©
        //default - public? ??΅?λ©? default. ??Ό package??λ§? ? κ·? ??©
        //private - ??Ό class ???λ§? ? κ·? ??©
        //public int su; default
        //public Ex02(){}//??°λ©? ?? ??±? ??΅??΄ ??

        //Math you=new Math();//Math? ????? ?Έ private class. ?ΈλΆ???? κ°μ²΄??± λΆκ???₯. ?΄? κ²? ?Έ ? ??.
    }
}