package day09;

public class Ex03 {
    
    final int su;

    Ex03(int a){
        su=a;
    }

    public static void main(String[] args){
        //?��?��?�� �??��. ?��름을 ???문자로만 ?��?�� 것이 ?��?��?��?��.
        //final int a;//final 붙이�? ?�� ?��?�� 값을 바�?? ?�� ?��?��. a=2222;�? ?��?���? ?��류남. a=1111; 초기�? ?��?��만을 final�? 종료. ?�� ?��?�� 값을 바�?? ?�� ?��?�� final �?, ?��?��?�� �??��?�� ?��.
        //a=1111;//�??��?�� 초기?��.final?�� 경우?�� 초기?���? 반드?�� ?��줘야 ?��. 초기?�� ?��?���? int?�� default?�� 0?���? 처리?���? ?���? ?��류남
        //a=2222;//�??�� ????��
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