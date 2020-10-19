package com.bit.day11;

class Ball{//�? 뽑아?�� 보여주는 객체
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
        //int[] note=new int[6];
        int cnt=0;
        while(true){
            int ran=(int)(Math.random()*45);//0~44번까�? 45�? 번호 뽑기
            Ball ball=box[ran];
            if(ball.checking()){
                //ball?�� check 값이 true�?, �? �? 공�?? ?���? marking?��?��?��?�� ?��, �? 중복?���? pass
            }else{//중복 ?��?���?
          //      note[cnt++]=ball.showNum();
                ball.showNum();
                ball.marking();
                cnt++;
                if(cnt==6){break;}
            }
        }
    
    
    
    
    }
}