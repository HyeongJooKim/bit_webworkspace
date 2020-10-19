package day10;

public class Ex09 {
    public static void main(String[] args){
        //λ‘λ ?λ‘κ·Έ?¨ ? ??κΈ?
        //1~45, 45κ°? μ€? μ€λ³΅ ??΄ 6κ°? ?«? λ½κΈ°, ??€
        //μΆλ ₯??? ?€λ¦μ°¨??Όλ‘? ? ? ¬
        //λ³΄λ?€λ²νΈ, ?λ½μ?? κ³΅μ λ§μ??λ§? κ³΅μΌλ‘?
        //λ°©λ²1.?΄?  λ°°μ΄ κ±?.λ³μ°κΈ?, λΉκ΅ ??©
        //λ°©λ²2.λ§? ???? ? ??? 6κ°? λ½μ?΄κΈ?
        //λ°©λ²3.κ°μ²΄μ§??₯? ?Όλ‘?

        //λ°©λ²1.?΄?  λ°°μ΄ κ±?.λ³μ°κΈ?, λΉκ΅ ??©
        int limit=45;//? λ²μ 1~45
        int cnt=7;//λ½μ ?? κ°μ 6κ°?. ?΄κ²μ΄ λ°°μ΄? ?¬κΈ?
        int[] su=new int[cnt];//?¬κΈ°κ?? 6?Έ ? ? λ°°μ΄ ? ?Έ
        su[0]=(int)(Math.random()*limit)+1;//0?λ¦¬μ? λ¨Όμ?? λ½κ³ , κ·? ?΄?λ§? λΉκ΅
        for(int i=1; i<cnt; i++){
            su[i]=(int)(Math.random()*limit)+1;
            for(int j=0;j<i;j++){
                while(su[i]==su[j]){
                    su[i]=(int)(Math.random()*limit)+1;
                    j=0;
                }
            }
        }

        System.out.println("-----lotto(? ? ¬? )-----");
        for(int i=0; i<cnt; i++){
            System.out.print(su[i]+" ");
        }
        //su[0]~su[5]λ₯? ?€λ¦μ°¨??Όλ‘? ? ? ¬,λ³΄λ?€λ²νΈ?Έ su[6]??? κ·Έλ??λ‘? μΆλ ₯?κΈ?
        int temp;
        for(int i=0; i<cnt-2; i++){
            for(int j=i+1; j<cnt-1;j++){
                if(su[i]>su[j]){
                    temp=su[i];
                    su[i]=su[j];
                    su[j]=temp;
                }
            }
        }
        System.out.println();       
        System.out.println("-----lotto(? ? ¬?)-----");
        System.out.print("λ‘λλ²νΈ  :");
        for(int i=0; i<cnt-1; i++){
            System.out.print(su[i]+" ");
        }
        System.out.println();       
        System.out.println("λ³΄λ?€λ²νΈ:"+su[6]);
    }
}