package day10;

public class Ex11 {

    public static void main(String[] args){
        //μ€λ³΅κ²??¬ ? ?? ₯
        //μ€λ³΅? ?€?λ½κΈ°
        int[] lotto=new int[7];
        for(int i = 0;i<lotto.length;i++){
            int ran = (int) (Math.random() * 45) + 1;
            lotto[i] = ran;
            for(int j=0; j<i;j++){
                if(lotto[i]==lotto[j]){
                    i--;
                    break;
                }
            }
        }
        System.out.println("-----lotto(? ? ¬? )-----");
        for(int i=0; i<7; i++){
            System.out.print(lotto[i]+" ");
        }

        //?€λ¦μ°¨? ? ? ¬
        int temp=0;
        for(int i=0; i<5; i++){
            for(int j=i+1; j<6;j++){
                if(lotto[i]>lotto[j]){
                    temp=lotto[i];
                    lotto[i]=lotto[j];
                    lotto[j]=temp;
                }
            }
        }
        System.out.println();       
        System.out.println("-----lotto(? ? ¬?)-----");
        System.out.print("λ‘λλ²νΈ  :");
        for(int i=0; i<6; i++){
            System.out.print(lotto[i]+" ");
        }
        System.out.println();       
        System.out.println("λ³΄λ?€λ²νΈ:"+lotto[6]);
    }

}