package com.bit.day11;

public class Id01 {
    public static void main(String[] args) {
        // μ£Όλ?Όλ²?Έ?? ₯: 090206-3124567
        // >>?Ή? ??? 00?Έ ?¨????€
        // μ£Όλ?Όλ²?Έ?? ₯: 990206-2124567
        // >>?Ή? ??? 00?Έ ?¬????€
        // μ£Όλ?Όλ²?Έ?? ₯: 9902062124567
        // >>?? ₯?¨?΄? ?€? ??Έ??Έ?(00000-00000000)
        // μ£Όλ?Όλ²?Έ?? ₯: 99020602124567
        // >>?? ₯?¨?΄? ?€? ??Έ??Έ?(000000-0000000)
        // μ£Όλ?Όλ²?Έ?? ₯: 990206-212456
        // >>μ£Όλ?Όλ²?Έ ?λ¦¬μλ₯? ?€? ??Έ??Έ?(000000-0000000)

        int yyNow=2020;
        int age=0;
        String mf="";//?¨? ?¬?
        // boolean error=true;//error ??Όλ©? true?¬? while λ¬? ?€??κ³?, ??Όλ©? falseλ‘? pass?κ²?. μ΄κΈ°κ°μ?? trueλ‘? μ€μ while ??Όλ‘? ?€?΄κ°?κ²?
        char[] chArr;
        String[] stArr;
        int error=1;//error? κ°??. while loop?? ?€?΄κ°?κ²? ?? €κ³? μ΄κΈ°κ°μ μ€?
        String fst="";//μ£Όλ?Όλ²?Έ ?6?λ¦?
        String snd="";//μ£Όλ?Όλ²?Έ ?€7?λ¦?
        int sufst=0;//μ£Όλ?Όλ²?Έ ?6?λ¦?
        int susnd=0;//μ£Όλ?Όλ²?Έ ?€7?λ¦?

        while(error>0){
            error=0;//?Ό?¨ ?€?΄κ°?λ©? 0?Όλ‘? λ¦¬μ
            System.out.print("μ£Όλ?Όλ²?Έ?? ₯: ");
            java.util.Scanner sc=new java.util.Scanner(System.in);
            String input=sc.nextLine();
            chArr=input.toCharArray();//?? ₯κ°μ char λ‘? λ³??
 
            if(chArr.length!=14){//κΈΈμ΄κ°? 14?λ¦¬μΈ κ²½μ°λ§? ?€? ?¨κ³λ‘ ?΅κ³?
                System.out.println(">>μ£Όλ?Όλ²?Έ ?λ¦¬μλ₯? ?€? ??Έ??Έ?(000000-0000000)");
                error++;//??¬λ°κ²¬
            }

            stArr=new String[chArr.length];//String?Όλ‘? λ°°μ΄ λ³??
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
    
            if(chArr[6]!='-'||!(sufst>0||susnd>0)){//-?΄ ?  ?μΉμ ?? κ²½μ°λ§? ?΅κ³?
                error++;//??¬λ°κ²¬
                System.out.println(">>?? ₯?¨?΄? ?€? ??Έ??Έ?(00000-00000000)");
            }
        }

        int su01=sufst/10000;//μ²? 2?
        int su7=susnd/1000000;//?·7?μ€? μ²«μ

        if(su7==1||su7==2){
            age=yyNow-(1900+su01)+1;
        }else if(su7==3||su7==4){
            age=yyNow-(2000+su01)+1;
        }

        if(su7==1||su7==3){
            mf="?¨?";
        }else if(su7==2||su7==4){
            mf="?¬?";
        }

        System.out.print("?Ή? ??? "+age+"?Έ "+mf+"???€");

    }//main end
}//class end