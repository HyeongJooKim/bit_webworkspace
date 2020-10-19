package day10;

public class Ex01 {

    int su1=1234;

    public void func01(){
        int su1=1111;//ì§??—­ë³??ˆ˜??? ? „?—­ë³??ˆ˜?˜ ?´ë¦„ì´ ê°™ìœ¼ë©? ì§??—­ë³??ˆ˜ ?š°?„ 
        System.out.println("func01 run");
        this.func02();//non-static?—?„œ this?Š” ?ê¸? ??‹ ?„ ?˜ë¯?. ê·¸ëŸ¬?‚˜ static?—?„œ?Š” thisê°? ?ˆ„êµ¬ì¸ì§? ?•Œ ?ˆ˜ ?—†?–´ ?˜¤ë¥˜ë‚¨.
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
        me.func01();//func01 ?‹¤?–‰?•˜ê³?, ê·? ?•ˆ?— ?ˆ?Š” func02?„ ?‹¤?–‰?•¨.
        System.out.println(me.su1);
        me.func03(me).func03(me);//ë§¤ê°œë³??ˆ˜ ì§?? •?•œ ê²½ìš° me ë§¤ê°œë³??ˆ˜ ?…? ¥?•´?•¼ ?‹¤?–‰?¨
        me.func04().func04();//ë§¤ê°œë³??ˆ˜ ì§?? • ?•ˆ?•œ ê²½ìš° ?•ˆ ?¨?•¼ ?‹¤?–‰?¨. ?´? ‡ê²? ê³„ì† ?—°ê²°í•˜?Š” ê±? ì²´ì´?‹?´?¼ ?•¨. java?—?„œ?Š” ?˜ ?•ˆ???

    }

}