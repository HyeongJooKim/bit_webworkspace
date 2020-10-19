package com.bit.day11;

public class Id01 {
    public static void main(String[] args) {
        // ì£¼ë?¼ë²ˆ?˜¸?…? ¥: 090206-3124567
        // >>?‹¹?‹ ??? 00?„¸ ?‚¨??…?‹ˆ?‹¤
        // ì£¼ë?¼ë²ˆ?˜¸?…? ¥: 990206-2124567
        // >>?‹¹?‹ ??? 00?„¸ ?—¬??…?‹ˆ?‹¤
        // ì£¼ë?¼ë²ˆ?˜¸?…? ¥: 9902062124567
        // >>?…? ¥?Œ¨?„´?„ ?‹¤?‹œ ?™•?¸?•˜?„¸?š”(00000-00000000)
        // ì£¼ë?¼ë²ˆ?˜¸?…? ¥: 99020602124567
        // >>?…? ¥?Œ¨?„´?„ ?‹¤?‹œ ?™•?¸?•˜?„¸?š”(000000-0000000)
        // ì£¼ë?¼ë²ˆ?˜¸?…? ¥: 990206-212456
        // >>ì£¼ë?¼ë²ˆ?˜¸ ?ë¦¬ìˆ˜ë¥? ?‹¤?‹œ ?™•?¸?•˜?„¸?š”(000000-0000000)

        int yyNow=2020;
        int age=0;
        String mf="";//?‚¨? ?—¬?
        // boolean error=true;//error ?ˆ?œ¼ë©? true?—¬?„œ while ë¬? ?‹¤?–‰?•˜ê³?, ?—†?œ¼ë©? falseë¡? pass?•˜ê²?. ì´ˆê¸°ê°’ì?? trueë¡? ì¤˜ì„œ while ?•ˆ?œ¼ë¡? ?“¤?–´ê°?ê²?
        char[] chArr;
        String[] stArr;
        int error=1;//error?˜ ê°??ˆ˜. while loop?•ˆ?— ?“¤?–´ê°?ê²? ?•˜? ¤ê³? ì´ˆê¸°ê°’ì„ ì¤?
        String fst="";//ì£¼ë?¼ë²ˆ?˜¸ ?•6?ë¦?
        String snd="";//ì£¼ë?¼ë²ˆ?˜¸ ?’¤7?ë¦?
        int sufst=0;//ì£¼ë?¼ë²ˆ?˜¸ ?•6?ë¦?
        int susnd=0;//ì£¼ë?¼ë²ˆ?˜¸ ?’¤7?ë¦?

        while(error>0){
            error=0;//?¼?‹¨ ?“¤?–´ê°?ë©? 0?œ¼ë¡? ë¦¬ì…‹
            System.out.print("ì£¼ë?¼ë²ˆ?˜¸?…? ¥: ");
            java.util.Scanner sc=new java.util.Scanner(System.in);
            String input=sc.nextLine();
            chArr=input.toCharArray();//?…? ¥ê°’ì„ char ë¡? ë³??™˜
 
            if(chArr.length!=14){//ê¸¸ì´ê°? 14?ë¦¬ì¸ ê²½ìš°ë§? ?‹¤?Œ ?‹¨ê³„ë¡œ ?†µê³?
                System.out.println(">>ì£¼ë?¼ë²ˆ?˜¸ ?ë¦¬ìˆ˜ë¥? ?‹¤?‹œ ?™•?¸?•˜?„¸?š”(000000-0000000)");
                error++;//?—?Ÿ¬ë°œê²¬
            }

            stArr=new String[chArr.length];//String?œ¼ë¡? ë°°ì—´ ë³??™˜
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
    
            if(chArr[6]!='-'||!(sufst>0||susnd>0)){//-?´ ? œ ?œ„ì¹˜ì— ?ˆ?Š” ê²½ìš°ë§? ?†µê³?
                error++;//?—?Ÿ¬ë°œê²¬
                System.out.println(">>?…? ¥?Œ¨?„´?„ ?‹¤?‹œ ?™•?¸?•˜?„¸?š”(00000-00000000)");
            }
        }

        int su01=sufst/10000;//ì²? 2?ˆ˜
        int su7=susnd/1000000;//?’·7?ˆ˜ì¤? ì²«ìˆ˜

        if(su7==1||su7==2){
            age=yyNow-(1900+su01)+1;
        }else if(su7==3||su7==4){
            age=yyNow-(2000+su01)+1;
        }

        if(su7==1||su7==3){
            mf="?‚¨?";
        }else if(su7==2||su7==4){
            mf="?—¬?";
        }

        System.out.print("?‹¹?‹ ??? "+age+"?„¸ "+mf+"?…?‹ˆ?‹¤");

    }//main end
}//class end