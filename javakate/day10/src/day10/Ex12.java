package day10;

public class Ex12 {
    public static void main(String[] args){

        //방법2.�? ?��??? ?�� ?��?��?�� 6�? 뽑아?���?. 중복�??���? ?��?��?��?�� 방법

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

        //?��름차?�� ?��?��??? ?��?��

        System.out.println();

        for(int i=0; i<6; i++){
            System.out.print(ball[i]+" ");      
        }

        System.out.print("보너?��번호:"+ball[6]);

    }
}