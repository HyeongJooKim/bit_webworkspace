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
     public void func02(){//?�� 기능
        System.out.println("Ex15 func02");
    
     }
    public static void main(String[] args){
        //java?�� ?��?�� �? ?��?��?��
        Ex15 me=new Ex15();
        me.func01();
        me.func02();

    //    Lec15 me=new Ex15();//�?모�???��?���? ?�� 객체 ?��?��
        me.func01();
    //   me.func02(); type?�� Lec15�? 바꾸?�� ?���? ?���? 만든 func?�� ?���? 불�??

        //func02 ?��출하?���?
    //    Lec15 me=new Ex15();
        me.func01();
        Ex15 you=(Ex15)me;//Ex15 type?���? 강제?���??��. 
        //�?모에?�� ?��?��?��로는 ?��?��?��, ?��?��?��?�� �?모로?�� ?��?��?���??��?��
    //    Lec13 me2=you;
        you.func02();
        //Integer su=new Integer(1234);
        //double su=new Double(3.14);
    //    Number su=4321;
     //   Number su=3.14;//Number?�� Integer, Double?�� �?�? class?���?�? �? ?��?��?�� ?��?��?���??��?��
        //Number?�� 추상 class?���? ?��?�� 객체?��?��?�� ?��?�� ?��?��.
        //Number num=new Number();//?��?��게는 못쓴?��.

        func03(1234);
    }
    public static void func03(Number a){//?��?��, ?��?���? 모두 받음. (Objact a)�? ?���? 모든 ????�� ?�� �??��
        System.out.println(a);
    }


  
}