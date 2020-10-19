package day10;

//방법3.객체�??��?��?���?

class Lotto{//로또 번호 뽑기 class 만들�? ?�� ?��?�� ?��?��?�� func ?���?. main?��?��?�� 매개�??���? ?��?��?���? 번호 뽑을 ?�� ?���?
    int min=1;//뽑을 최소?�� ?��
    int max=45;//뽑을 최�???�� ?��
    int pick=6;//뽑을 ?��?�� 개수
    int bonus=1;//보너?�� ?��?�� 개수
    int[] ball=new int[max-min+1];

    Lotto(){
        ballAll();
        mixAll();
        show();
    }

    Lotto(int min1, int max1, int pick1, int bonus1){
        min=min1;//뽑을 최소?�� ?��
        max=max1;//뽑을 최�???�� ?��
        pick=pick1;//뽑을 ?��?�� 개수
        bonus=bonus1;//보너?�� ?��?�� 개수
        ballAll();
        mixAll();
        show();
    }

    void ballAll(){//?���? 배열 만들�?
        for(int i=0; i<ball.length; i++){
            ball[i]=i+1;
        }
    }

    void mixAll(){//배열 ?���? 마구 ?���?
        int temp=0;
        for(int i=0; i<1000; i++){
            temp=ball[0];
            int ran=(int)(Math.random()*(ball.length-1))+1;
            ball[0]=ball[ran];
            ball[ran]=temp;
        }
    }

    void show(){//뽑고 출력?���?
        System.out.print("Lotto 번호"+pick+"�?: ");
        for(int i=0; i<pick; i++){
            System.out.print(ball[i]+" ");
        }
        System.out.print("\n보너?��번호"+bonus+"�?: ");
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