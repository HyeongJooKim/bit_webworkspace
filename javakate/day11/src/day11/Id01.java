package com.bit.day11;

public class Id01 {
    public static void main(String[] args) {
        // 주�?�번?��?��?��: 090206-3124567
        // >>?��?��??? 00?�� ?��?��?��?��?��
        // 주�?�번?��?��?��: 990206-2124567
        // >>?��?��??? 00?�� ?��?��?��?��?��
        // 주�?�번?��?��?��: 9902062124567
        // >>?��?��?��?��?�� ?��?�� ?��?��?��?��?��(00000-00000000)
        // 주�?�번?��?��?��: 99020602124567
        // >>?��?��?��?��?�� ?��?�� ?��?��?��?��?��(000000-0000000)
        // 주�?�번?��?��?��: 990206-212456
        // >>주�?�번?�� ?��리수�? ?��?�� ?��?��?��?��?��(000000-0000000)

        int yyNow=2020;
        int age=0;
        String mf="";//?��?�� ?��?��
        // boolean error=true;//error ?��?���? true?��?�� while �? ?��?��?���?, ?��?���? false�? pass?���?. 초기값�?? true�? 줘서 while ?��?���? ?��?���?�?
        char[] chArr;
        String[] stArr;
        int error=1;//error?�� �??��. while loop?��?�� ?��?���?�? ?��?���? 초기값을 �?
        String fst="";//주�?�번?�� ?��6?���?
        String snd="";//주�?�번?�� ?��7?���?
        int sufst=0;//주�?�번?�� ?��6?���?
        int susnd=0;//주�?�번?�� ?��7?���?

        while(error>0){
            error=0;//?��?�� ?��?���?�? 0?���? 리셋
            System.out.print("주�?�번?��?��?��: ");
            java.util.Scanner sc=new java.util.Scanner(System.in);
            String input=sc.nextLine();
            chArr=input.toCharArray();//?��?��값을 char �? �??��
 
            if(chArr.length!=14){//길이�? 14?��리인 경우�? ?��?�� ?��계로 ?���?
                System.out.println(">>주�?�번?�� ?��리수�? ?��?�� ?��?��?��?��?��(000000-0000000)");
                error++;//?��?��발견
            }

            stArr=new String[chArr.length];//String?���? 배열 �??��
            for(int i=0; i<chArr.length; i++){
                stArr[i]=Character.toString(chArr[i]);
            }
    
            for(int i=0; i<6; i++){
                fst+=stArr[i];
            }
            sufst=new Integer(fst);
            for(int i=7; i<chArr.length; i++){
                snd+=stArr[i];
            }
            susnd=new Integer(snd);
    
            if(chArr[6]!='-'||!(sufst>0||susnd>0)){//-?�� ?�� ?��치에 ?��?�� 경우�? ?���?
                error++;//?��?��발견
                System.out.println(">>?��?��?��?��?�� ?��?�� ?��?��?��?��?��(00000-00000000)");
            }
        }

        int su01=sufst/10000;//�? 2?��
        int su7=susnd/1000000;//?��7?���? 첫수

        if(su7==1||su7==2){
            age=yyNow-(1900+su01)+1;
        }else if(su7==3||su7==4){
            age=yyNow-(2000+su01)+1;
        }

        if(su7==1||su7==3){
            mf="?��?��";
        }else if(su7==2||su7==4){
            mf="?��?��";
        }

        System.out.print("?��?��??? "+age+"?�� "+mf+"?��?��?��");

    }//main end
}//class end