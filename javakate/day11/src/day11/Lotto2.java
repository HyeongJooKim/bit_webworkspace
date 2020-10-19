package com.bit.day11;

class Ball{//�? 뽑아?�� 보여주는 객체
    private int num;//
    boolean check;
    String color;

    Ball(int num){
        this.num=num;
        check=false;
        if(num<11){
            color="?��???";
        }else if(num<21){
            color="?��???";
        }else if(num<31){
            color="빨간";
        }else if(num<41){
            color="�??��";
        }else{
            color="초록";
        }
    }

    void marking(){
        check=true;
    }

    boolean checking(){
        return check;
    }

    void printNum(){
        System.out.println(color+"�? "+num);
    }
    int showNum(){
        return num;
    }
}

public class Lotto2 {
    public static void main(String[] args) {
        //박스?�� �? �?�?
        Ball[] box=new Ball[45];//�? 45개�?? ?��?�� ?�� ?��?�� 배열 ?��?��
        for(int i=0; i<box.length; i++){
            box[i]=new Ball(1+i);
        }
        //박스?��?�� �? ?���? 방법
        // Ball temp=null;
        // for(int i=0; i<999999; i++){
        //     temp=box[0];
        //     int ran=(int)(Math.random()*44)+1;
        //     box[0]=box[ran];
        //     box[ran]=temp;
        // }

        //박스?��?�� �? 뽑고 ?��?��?���? ?��?�� 뽑는 방법
        int[] note=new int[6];
        int cnt=0;
        while(true){
            int ran=(int)(Math.random()*45);//0~44번까�? 45�? 번호 뽑기
            Ball ball=box[ran];
            if(ball.checking()){
                //ball?�� check 값이 true�?, �? �? 공�?? ?���? marking?��?��?��?�� ?��, �? 중복?���? pass
            }else{//중복 ?��?���?
          //      note[cnt++]=ball.showNum();
                ball.printNum();
                note[cnt]=ball.showNum();//뽑�?? 6번호 기록
                ball.marking();
                cnt++;
                if(cnt==6){break;}
            }
        }
        //뽑�?? �? ?��름차?��?���? ?��?��?��?�� ?��?�� 보여주기

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

        System.out.print("?��번주 로또 ?��첨번?��?�� ");
        for(int i=0; i<6; i++){
            System.out.print(note[i]+" ");
        }
        System.out.print("?��?��?��.\n축하?��립니?��.");

    
    
    
    }
}