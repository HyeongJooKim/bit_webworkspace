package com.bit.day11;

class Ball{//ê³? ë½‘ì•„?„œ ë³´ì—¬ì£¼ëŠ” ê°ì²´
    private int num;//
    boolean check;
    String color;

    Ball(int num){
        this.num=num;
        check=false;
        if(num<11){
            color="?…¸???";
        }else if(num<21){
            color="?ŒŒ???";
        }else if(num<31){
            color="ë¹¨ê°„";
        }else if(num<41){
            color="ê²?? •";
        }else{
            color="ì´ˆë¡";
        }
    }

    void marking(){
        check=true;
    }

    boolean checking(){
        return check;
    }

    void printNum(){
        System.out.println(color+"ê³? "+num);
    }
    int showNum(){
        return num;
    }
}

public class Lotto2 {
    public static void main(String[] args) {
        //ë°•ìŠ¤?— ê³? ì¤?ë¹?
        Ball[] box=new Ball[45];//ê³? 45ê°œë?? ?‹´?„ ?ˆ˜ ?ˆ?Š” ë°°ì—´ ?ƒ?„±
        for(int i=0; i<box.length; i++){
            box[i]=new Ball(1+i);
        }
        //ë°•ìŠ¤?•ˆ?˜ ê³? ?„ê¸? ë°©ë²•
        // Ball temp=null;
        // for(int i=0; i<999999; i++){
        //     temp=box[0];
        //     int ran=(int)(Math.random()*44)+1;
        //     box[0]=box[ran];
        //     box[ran]=temp;
        // }

        //ë°•ìŠ¤?•ˆ?˜ ê³? ë½‘ê³  ?™•?¸?•˜ê³? ?‹¤?‹œ ë½‘ëŠ” ë°©ë²•
        int[] note=new int[6];
        int cnt=0;
        while(true){
            int ran=(int)(Math.random()*45);//0~44ë²ˆê¹Œì§? 45ê°? ë²ˆí˜¸ ë½‘ê¸°
            Ball ball=box[ran];
            if(ball.checking()){
                //ball?˜ check ê°’ì´ trueë©?, ì¦? ê¸? ê³µì?? ?´ë¯? marking?˜?—ˆ?‹¤?Š” ?œ», ì¦? ì¤‘ë³µ?˜ë©? pass
            }else{//ì¤‘ë³µ ?•„?‹ˆë©?
          //      note[cnt++]=ball.showNum();
                ball.printNum();
                note[cnt]=ball.showNum();//ë½‘ì?? 6ë²ˆí˜¸ ê¸°ë¡
                ball.marking();
                cnt++;
                if(cnt==6){break;}
            }
        }
        //ë½‘ì?? ê³? ?˜¤ë¦„ì°¨?ˆœ?œ¼ë¡? ? •? ¬?•´?„œ ?‹¤?‹œ ë³´ì—¬ì£¼ê¸°

        int tmp=0;
        for(int i=0; i<note.length-1; i++){
            for(int j=i+1; j<note.length; j++){
                if(note[i]>note[j]){
                    tmp=note[i];
                    note[i]=note[j];
                    note[j]=tmp;
                }
            }
        }

        System.out.print("?´ë²ˆì£¼ ë¡œë˜ ?‹¹ì²¨ë²ˆ?˜¸?Š” ");
        for(int i=0; i<6; i++){
            System.out.print(note[i]+" ");
        }
        System.out.print("?…?‹ˆ?‹¤.\nì¶•í•˜?“œë¦½ë‹ˆ?‹¤.");

    
    
    
    }
}