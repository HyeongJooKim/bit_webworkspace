package day09;

public class Ex07 {

    public static void main(String[] args){

        //1~6까�?? ?��?��?�� ?���? 배열 만들�?
        //중복 ?��?��
        int[] su=new int[6];
        su[0]=(int)(Math.random()*6)+1;//1~6 ?��?��?�� 무작?�� ?��?�� ?��?��, a�? 받아 �?�? ?��?�� ?��번만, ?�� ?���? 만들?���? 매번 ?��?�� random ?��줘야 ?��.

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