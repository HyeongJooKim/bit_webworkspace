package day10;

public class Ex01 {

    int su1=1234;

    public void func01(){
        int su1=1111;//μ§??­λ³????? ? ?­λ³??? ?΄λ¦μ΄ κ°μΌλ©? μ§??­λ³?? ?°? 
        System.out.println("func01 run");
        this.func02();//non-static?? this? ?κΈ? ?? ? ?λ―?. κ·Έλ¬? static??? thisκ°? ?κ΅¬μΈμ§? ? ? ??΄ ?€λ₯λ¨.
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
        me.func01();//func01 ?€??κ³?, κ·? ?? ?? func02? ?€??¨.
        System.out.println(me.su1);
        me.func03(me).func03(me);//λ§€κ°λ³?? μ§?? ? κ²½μ° me λ§€κ°λ³?? ?? ₯?΄?Ό ?€??¨
        me.func04().func04();//λ§€κ°λ³?? μ§??  ?? κ²½μ° ? ?¨?Ό ?€??¨. ?΄? κ²? κ³μ ?°κ²°ν? κ±? μ²΄μ΄??΄?Ό ?¨. java??? ? ????

    }

}