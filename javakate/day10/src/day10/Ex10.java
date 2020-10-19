package day10;

//ë°©ë²•3.ê°ì²´ì§??–¥? ?œ¼ë¡?

class Lotto{//ë¡œë˜ ë²ˆí˜¸ ë½‘ê¸° class ë§Œë“¤ê³? ?´ ?•ˆ?— ?‹¤?–‘?•œ func ?„£ê¸?. main?—?„œ?Š” ë§¤ê°œë³??ˆ˜ë§? ?…? ¥?•˜ë©? ë²ˆí˜¸ ë½‘ì„ ?ˆ˜ ?ˆê²?
    int min=1;//ë½‘ì„ ìµœì†Œ?˜ ?ˆ˜
    int max=45;//ë½‘ì„ ìµœë???˜ ?ˆ˜
    int pick=6;//ë½‘ì„ ?ˆ˜?˜ ê°œìˆ˜
    int bonus=1;//ë³´ë„ˆ?Š¤ ?ˆ˜?˜ ê°œìˆ˜
    int[] ball=new int[max-min+1];

    Lotto(){
        ballAll();
        mixAll();
        show();
    }

    Lotto(int min1, int max1, int pick1, int bonus1){
        min=min1;//ë½‘ì„ ìµœì†Œ?˜ ?ˆ˜
        max=max1;//ë½‘ì„ ìµœë???˜ ?ˆ˜
        pick=pick1;//ë½‘ì„ ?ˆ˜?˜ ê°œìˆ˜
        bonus=bonus1;//ë³´ë„ˆ?Š¤ ?ˆ˜?˜ ê°œìˆ˜
        ballAll();
        mixAll();
        show();
    }

    void ballAll(){//? „ì²? ë°°ì—´ ë§Œë“¤ê¸?
        for(int i=0; i<ball.length; i++){
            ball[i]=i+1;
        }
    }

    void mixAll(){//ë°°ì—´ ? „ì²? ë§ˆêµ¬ ?„ê¸?
        int temp=0;
        for(int i=0; i<1000; i++){
            temp=ball[0];
            int ran=(int)(Math.random()*(ball.length-1))+1;
            ball[0]=ball[ran];
            ball[ran]=temp;
        }
    }

    void show(){//ë½‘ê³  ì¶œë ¥?•˜ê¸?
        System.out.print("Lotto ë²ˆí˜¸"+pick+"ê°?: ");
        for(int i=0; i<pick; i++){
            System.out.print(ball[i]+" ");
        }
        System.out.print("\në³´ë„ˆ?Š¤ë²ˆí˜¸"+bonus+"ê°?: ");
        for(int i=pick; i<pick+bonus; i++){
            System.out.print(ball[i]+" ");
        }
        System.out.println();

    }
}//class Lotto end

public class Ex10 {
    public static void main(String[] args){

    Lotto lotto=new Lotto();
    
    lotto=new Lotto(1,50,8,2);

    }//main end
}//class Ex10 end