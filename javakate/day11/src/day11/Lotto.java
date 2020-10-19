package com.bit.day11;

class Ball{//ê³? ë½‘ì•„?„œ ë³´ì—¬ì£¼ëŠ” ê°ì²´
    private int num;//
    boolean check;

    Ball(int num){
        this.num=num;
        check=false;
    }

    void marking(){
        check=true;
    }

    boolean checking(){
        return check;
    }

    void showNum(){
        System.out.println(num);
    }
}

public class Lotto {
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
        //int[] note=new int[6];
        int cnt=0;
        while(true){
            int ran=(int)(Math.random()*45);//0~44ë²ˆê¹Œì§? 45ê°? ë²ˆí˜¸ ë½‘ê¸°
            Ball ball=box[ran];
            if(ball.checking()){
                //ball?˜ check ê°’ì´ trueë©?, ì¦? ê¸? ê³µì?? ?´ë¯? marking?˜?—ˆ?‹¤?Š” ?œ», ì¦? ì¤‘ë³µ?˜ë©? pass
            }else{//ì¤‘ë³µ ?•„?‹ˆë©?
          //      note[cnt++]=ball.showNum();
                ball.showNum();
                ball.marking();
                cnt++;
                if(cnt==6){break;}
            }
        }
    
    
    
    
    }
}