package com.bit.day11;

class Ball{//κ³? λ½μ? λ³΄μ¬μ£Όλ κ°μ²΄
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
        //λ°μ€? κ³? μ€?λΉ?
        Ball[] box=new Ball[45];//κ³? 45κ°λ?? ?΄? ? ?? λ°°μ΄ ??±
        for(int i=0; i<box.length; i++){
            box[i]=new Ball(1+i);
        }
        //λ°μ€?? κ³? ?κΈ? λ°©λ²
        // Ball temp=null;
        // for(int i=0; i<999999; i++){
        //     temp=box[0];
        //     int ran=(int)(Math.random()*44)+1;
        //     box[0]=box[ran];
        //     box[ran]=temp;
        // }

        //λ°μ€?? κ³? λ½κ³  ??Έ?κ³? ?€? λ½λ λ°©λ²
        //int[] note=new int[6];
        int cnt=0;
        while(true){
            int ran=(int)(Math.random()*45);//0~44λ²κΉμ§? 45κ°? λ²νΈ λ½κΈ°
            Ball ball=box[ran];
            if(ball.checking()){
                //ball? check κ°μ΄ trueλ©?, μ¦? κΈ? κ³΅μ?? ?΄λ―? marking???€? ?», μ¦? μ€λ³΅?λ©? pass
            }else{//μ€λ³΅ ??λ©?
          //      note[cnt++]=ball.showNum();
                ball.showNum();
                ball.marking();
                cnt++;
                if(cnt==6){break;}
            }
        }
    
    
    
    
    }
}