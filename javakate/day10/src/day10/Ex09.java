package day10;

public class Ex09 {
    public static void main(String[] args){
        //로또 ?��로그?�� ?��?��?���?
        //1~45, 45�? �? 중복 ?��?�� 6�? ?��?�� 뽑기, ?��?��
        //출력??? ?��름차?��?���? ?��?��
        //보너?��번호, ?��뽑�?? 공을 마�??�? 공으�?
        //방법1.?��?�� 배운 �?.별찍�?, 비교 ?��?��
        //방법2.�? ?��??? ?�� ?��?��?�� 6�? 뽑아?���?
        //방법3.객체�??��?��?���?

        //방법1.?��?�� 배운 �?.별찍�?, 비교 ?��?��
        int limit=45;//?�� 범위 1~45
        int cnt=7;//뽑을 ?��?�� 개수 6�?. ?��것이 배열?�� ?���?
        int[] su=new int[cnt];//?��기�?? 6?�� ?��?�� 배열 ?��?��
        su[0]=(int)(Math.random()*limit)+1;//0?��리수?�� 먼�?? 뽑고, �? ?��?���? 비교
        for(int i=1; i<cnt; i++){
            su[i]=(int)(Math.random()*limit)+1;
            for(int j=0;j<i;j++){
                while(su[i]==su[j]){
                    su[i]=(int)(Math.random()*limit)+1;
                    j=0;
                }
            }
        }

        System.out.println("-----lotto(?��?��?��)-----");
        for(int i=0; i<cnt; i++){
            System.out.print(su[i]+" ");
        }
        //su[0]~su[5]�? ?��름차?��?���? ?��?��,보너?��번호?�� su[6]??? 그�??�? 출력?���?
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
        System.out.println("-----lotto(?��?��?��)-----");
        System.out.print("로또번호  :");
        for(int i=0; i<cnt-1; i++){
            System.out.print(su[i]+" ");
        }
        System.out.println();       
        System.out.println("보너?��번호:"+su[6]);
    }
}