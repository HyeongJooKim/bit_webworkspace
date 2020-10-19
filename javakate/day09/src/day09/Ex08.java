package day09;

public class Ex08 {
    public static void main(String[] args){

        //1~6ê¹Œì?? ?œ?¤?•œ ?ˆ˜ë¡? ë°°ì—´ ë§Œë“¤ê¸?
        //ì¤‘ë³µ ?—†?Œ
        int limit=6;
        int[] su=new int[limit];
        su[0]=(int)(Math.random()*limit)+1;
        for(int i=1; i<limit; i++){
            su[i]=(int)(Math.random()*limit)+1;
            for(int j=0;j<i;j++){
                while(su[i]==su[j]){
                    su[i]=(int)(Math.random()*limit)+1;
                    j=0;
                }
            }
        }

        System.out.println("for~for---------------------");
        for(int i=0; i<limit; i++){
            System.out.println(su[i]);
        }

    }
}