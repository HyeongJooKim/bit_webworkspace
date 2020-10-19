package day10;

//λ°©λ²3.κ°μ²΄μ§??₯? ?Όλ‘?

class Lotto{//λ‘λ λ²νΈ λ½κΈ° class λ§λ€κ³? ?΄ ?? ?€?? func ?£κΈ?. main??? λ§€κ°λ³??λ§? ?? ₯?λ©? λ²νΈ λ½μ ? ?κ²?
    int min=1;//λ½μ μ΅μ? ?
    int max=45;//λ½μ μ΅λ??? ?
    int pick=6;//λ½μ ?? κ°μ
    int bonus=1;//λ³΄λ?€ ?? κ°μ
    int[] ball=new int[max-min+1];

    Lotto(){
        ballAll();
        mixAll();
        show();
    }

    Lotto(int min1, int max1, int pick1, int bonus1){
        min=min1;//λ½μ μ΅μ? ?
        max=max1;//λ½μ μ΅λ??? ?
        pick=pick1;//λ½μ ?? κ°μ
        bonus=bonus1;//λ³΄λ?€ ?? κ°μ
        ballAll();
        mixAll();
        show();
    }

    void ballAll(){//? μ²? λ°°μ΄ λ§λ€κΈ?
        for(int i=0; i<ball.length; i++){
            ball[i]=i+1;
        }
    }

    void mixAll(){//λ°°μ΄ ? μ²? λ§κ΅¬ ?κΈ?
        int temp=0;
        for(int i=0; i<1000; i++){
            temp=ball[0];
            int ran=(int)(Math.random()*(ball.length-1))+1;
            ball[0]=ball[ran];
            ball[ran]=temp;
        }
    }

    void show(){//λ½κ³  μΆλ ₯?κΈ?
        System.out.print("Lotto λ²νΈ"+pick+"κ°?: ");
        for(int i=0; i<pick; i++){
            System.out.print(ball[i]+" ");
        }
        System.out.print("\nλ³΄λ?€λ²νΈ"+bonus+"κ°?: ");
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