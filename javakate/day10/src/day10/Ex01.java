package day10;

public class Ex01 {

    int su1=1234;

    public void func01(){
        int su1=1111;//�??���??��??? ?��?���??��?�� ?��름이 같으�? �??���??�� ?��?��
        System.out.println("func01 run");
        this.func02();//non-static?��?�� this?�� ?���? ?��?��?�� ?���?. 그러?�� static?��?��?�� this�? ?��구인�? ?�� ?�� ?��?�� ?��류남.
        System.out.println("su1="+su1);
    }

    public void func01(Ex01 ex){
        System.out.println("func01(param:me) run");
        System.out.println(ex==this);
        System.out.println("su1="+ex.su1);
        ex.func02();
    }

    public void func02(){
        System.out.println("func02 run");
    }

    public Ex01 func03(Ex01 me){
        System.out.println("func03 run");
        return me;
    }
    
    public Ex01 func04(){
        System.out.println("func04 run");
        return this;
    }

    public static void main(String[] args){
        Ex01 me=new Ex01();
        me.func01();//func01 ?��?��?���?, �? ?��?�� ?��?�� func02?�� ?��?��?��.
        System.out.println(me.su1);
        me.func03(me).func03(me);//매개�??�� �??��?�� 경우 me 매개�??�� ?��?��?��?�� ?��?��?��
        me.func04().func04();//매개�??�� �??�� ?��?�� 경우 ?�� ?��?�� ?��?��?��. ?��?���? 계속 ?��결하?�� �? 체이?��?��?�� ?��. java?��?��?�� ?�� ?��???

    }

}