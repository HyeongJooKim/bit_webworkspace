package day10;

public class Ex09 {
    public static void main(String[] args){
        //ë¡œë˜ ?”„ë¡œê·¸?¨ ? œ?‘?•˜ê¸?
        //1~45, 45ê°? ì¤? ì¤‘ë³µ ?—†?´ 6ê°? ?ˆ«? ë½‘ê¸°, ?œ?¤
        //ì¶œë ¥??? ?˜¤ë¦„ì°¨?ˆœ?œ¼ë¡? ? •? ¬
        //ë³´ë„ˆ?Š¤ë²ˆí˜¸, ?•ˆë½‘ì?? ê³µì„ ë§ˆì??ë§? ê³µìœ¼ë¡?
        //ë°©ë²•1.?–´? œ ë°°ìš´ ê±?.ë³„ì°ê¸?, ë¹„êµ ?‘?š©
        //ë°©ë²•2.ë§? ?„??? ?›„ ?•?—?„œ 6ê°? ë½‘ì•„?‚´ê¸?
        //ë°©ë²•3.ê°ì²´ì§??–¥? ?œ¼ë¡?

        //ë°©ë²•1.?–´? œ ë°°ìš´ ê±?.ë³„ì°ê¸?, ë¹„êµ ?‘?š©
        int limit=45;//?ˆ˜ ë²”ìœ„ 1~45
        int cnt=7;//ë½‘ì„ ?ˆ˜?˜ ê°œìˆ˜ 6ê°?. ?´ê²ƒì´ ë°°ì—´?˜ ?¬ê¸?
        int[] su=new int[cnt];//?¬ê¸°ê?? 6?¸ ? •?ˆ˜ ë°°ì—´ ?„ ?–¸
        su[0]=(int)(Math.random()*limit)+1;//0?ë¦¬ìˆ˜?Š” ë¨¼ì?? ë½‘ê³ , ê·? ?´?›„ë§? ë¹„êµ
        for(int i=1; i<cnt; i++){
            su[i]=(int)(Math.random()*limit)+1;
            for(int j=0;j<i;j++){
                while(su[i]==su[j]){
                    su[i]=(int)(Math.random()*limit)+1;
                    j=0;
                }
            }
        }

        System.out.println("-----lotto(? •? ¬? „)-----");
        for(int i=0; i<cnt; i++){
            System.out.print(su[i]+" ");
        }
        //su[0]~su[5]ë¥? ?˜¤ë¦„ì°¨?ˆœ?œ¼ë¡? ? •? ¬,ë³´ë„ˆ?Š¤ë²ˆí˜¸?¸ su[6]??? ê·¸ë??ë¡? ì¶œë ¥?•˜ê¸?
        int temp;
        for(int i=0; i<cnt-2; i++){
            for(int j=i+1; j<cnt-1;j++){
                if(su[i]>su[j]){
                    temp=su[i];
                    su[i]=su[j];
                    su[j]=temp;
                }
            }
        }
        System.out.println();       
        System.out.println("-----lotto(? •? ¬?›„)-----");
        System.out.print("ë¡œë˜ë²ˆí˜¸  :");
        for(int i=0; i<cnt-1; i++){
            System.out.print(su[i]+" ");
        }
        System.out.println();       
        System.out.println("ë³´ë„ˆ?Š¤ë²ˆí˜¸:"+su[6]);
    }
}