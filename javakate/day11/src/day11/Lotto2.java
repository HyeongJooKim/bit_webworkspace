package com.bit.day11;

class Ball{//κ³? λ½μ? λ³΄μ¬μ£Όλ κ°μ²΄
    private int num;//
    boolean check;
    String color;

    Ball(int num){
        this.num=num;
        check=false;
        if(num<11){
            color="?Έ???";
        }else if(num<21){
            color="????";
        }else if(num<31){
            color="λΉ¨κ°";
        }else if(num<41){
            color="κ²?? ";
        }else{
            color="μ΄λ‘";
        }
    }

    void marking(){
        check=true;
    }

    boolean checking(){
        return check;
    }

    void printNum(){
        System.out.println(color+"κ³? "+num);
    }
    int showNum(){
        return num;
    }
}

public class Lotto2 {
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
        int[] note=new int[6];
        int cnt=0;
        while(true){
            int ran=(int)(Math.random()*45);//0~44λ²κΉμ§? 45κ°? λ²νΈ λ½κΈ°
            Ball ball=box[ran];
            if(ball.checking()){
                //ball? check κ°μ΄ trueλ©?, μ¦? κΈ? κ³΅μ?? ?΄λ―? marking???€? ?», μ¦? μ€λ³΅?λ©? pass
            }else{//μ€λ³΅ ??λ©?
          //      note[cnt++]=ball.showNum();
                ball.printNum();
                note[cnt]=ball.showNum();//λ½μ?? 6λ²νΈ κΈ°λ‘
                ball.marking();
                cnt++;
                if(cnt==6){break;}
            }
        }
        //λ½μ?? κ³? ?€λ¦μ°¨??Όλ‘? ? ? ¬?΄? ?€? λ³΄μ¬μ£ΌκΈ°

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

        System.out.print("?΄λ²μ£Ό λ‘λ ?Ήμ²¨λ²?Έ? ");
        for(int i=0; i<6; i++){
            System.out.print(note[i]+" ");
        }
        System.out.print("???€.\nμΆν?λ¦½λ?€.");

    
    
    
    }
}