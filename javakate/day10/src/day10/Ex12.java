package day10;

public class Ex12 {
    public static void main(String[] args){

        //λ°©λ²2.λ§? ???? ? ??? 6κ°? λ½μ?΄κΈ?. μ€λ³΅κ²??¬κ°? ???? λ°©λ²

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

        //?€λ¦μ°¨? ? ? ¬??? ??Ό

        System.out.println();

        for(int i=0; i<6; i++){
            System.out.print(ball[i]+" ");      
        }

        System.out.print("λ³΄λ?€λ²νΈ:"+ball[6]);

    }
}