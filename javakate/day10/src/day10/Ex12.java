package day10;

public class Ex12 {
    public static void main(String[] args){

        //ë°©ë²•2.ë§? ?„??? ?›„ ?•?—?„œ 6ê°? ë½‘ì•„?‚´ê¸?. ì¤‘ë³µê²??‚¬ê°? ?•„?š”?—†?Š” ë°©ë²•

        int[] ball=new int[45];
        for(int i=0; i<ball.length; i++){
            ball[i]=i+1;
            System.out.print(ball[i]+" ");
        }

        int temp=0;
        for(int i=0; i<1000; i++){
            temp=ball[0];
            int ran=(int)(Math.random()*44)+1;
            ball[0]=ball[ran];
            ball[ran]=temp;
        }

        //?˜¤ë¦„ì°¨?ˆœ ? •? ¬??? ?™?¼

        System.out.println();

        for(int i=0; i<6; i++){
            System.out.print(ball[i]+" ");      
        }

        System.out.print("ë³´ë„ˆ?Š¤ë²ˆí˜¸:"+ball[6]);

    }
}