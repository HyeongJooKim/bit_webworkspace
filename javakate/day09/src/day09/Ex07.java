package day09;

public class Ex07 {

    public static void main(String[] args){

        //1~6ê¹Œì?? ?œ?¤?•œ ?ˆ˜ë¡? ë°°ì—´ ë§Œë“¤ê¸?
        //ì¤‘ë³µ ?—†?Œ
        int[] su=new int[6];
        su[0]=(int)(Math.random()*6)+1;//1~6 ?‚¬?´?˜ ë¬´ì‘?œ„ ? •?ˆ˜ ?ƒ?„±, aë¥? ë°›ì•„ ê°?ë©? ?‹¤?–‰ ?•œë²ˆë§Œ, ?ƒˆ ?ˆ˜ë¥? ë§Œë“¤? ¤ë©? ë§¤ë²ˆ ?‹¤?‹œ random ?•´ì¤˜ì•¼ ?•¨.

        su[1]=(int)(Math.random()*6)+1;
        while(su[1]==su[0]){
            su[1]=(int)(Math.random()*6)+1;
        }

        su[2]=(int)(Math.random()*6)+1;
        while(su[2]==su[0]||su[2]==su[1]){
            su[2]=(int)(Math.random()*6)+1;
        }
 
        su[3]=(int)(Math.random()*6)+1;
        while(su[3]==su[0]||su[3]==su[1]||su[3]==su[2]){
            su[3]=(int)(Math.random()*6)+1;
        }
        
        su[4]=(int)(Math.random()*6)+1;
        while(su[4]==su[0]||su[4]==su[1]||su[4]==su[2]||su[4]==su[3]){
            su[4]=(int)(Math.random()*6)+1;
        }

        su[5]=(int)(Math.random()*6)+1;
        while(su[5]==su[0]||su[5]==su[1]||su[5]==su[2]||su[5]==su[3]||su[5]==su[4]){
            su[5]=(int)(Math.random()*6)+1;
        }

        System.out.println("while---------------------");
        for(int i=0; i<6; i++){
            System.out.println(su[i]);
        }
    }
}