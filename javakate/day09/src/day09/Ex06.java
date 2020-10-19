package day09;

public class Ex06 {
    public static void main(String[] args){
        //Q1. ?‹¤?Œ ë°°ì—´?— ê°’ì„ 2?”© ?”?•˜ê³? ì¶œë ¥?•˜?¼.
        //int[] su1={1,4,6,7,8};
        //Q2. 0~10ì¤? ????ˆ˜ë¥? ?‹´?Š” ë°°ì—´?„ ?ƒ?„±?•˜ê³? ì¶œë ¥?•˜?‹œ?˜¤.        
        //Q3. ?•Œ?ŒŒë²? ???ë¬¸ìë¥? ?‹´?Š” ë°°ì—´?„ ë§Œë“¤ê³? ì¶œë ¥?•˜?‹œ?˜¤.
        //Q4. ?‹¤?Œ?„ ?˜¤ë¦„ì°¨?ˆœ ? •? ¬ ì¶œë ¥?•˜?‹œ?˜¤.
        //int[] su2={7,2,4};
        //Q5. ?‹¤?Œ?„ ?˜¤ë¦„ì°¨?ˆœ ? •? ¬ ì¶œë ¥?•˜?‹œ?˜¤.
        //int[] su2={7,2,4,8,3,10};

        System.out.println("\nQ1.............."); 

        int[] su1={1,4,6,7,8};
        System.out.println("ë°°ì—´?˜ ê¸¸ì´:"+su1.length);
        for(int i=0; i<5; i++){
            su1[i]+=2;
        System.out.print(su1[i]+" ");
        }
        System.out.println();


        System.out.println("\nQ2.............."); 

        int cnt=0;
        for(int i=0; i<11; i++){
            if(i%2==1){cnt++;}
        }
        int[] su2=new int[cnt];
        int idx=0;
        for(int i=0;i<11; i++){
            if(i%2==1){
                su2[idx++]=i;
            }
        }
        for(int i=0; i<su2.length; i++){
            System.out.println(su2[i]);
        }

        System.out.println("\nQ3..............");
        char[] ch=new char['Z'-'A'+1];
        for(int i=0; i<ch.length; i++){
            ch[i]=(char)('A'+i);
        }
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]);
        }

        System.out.println(); 
        System.out.println("\nQ4.............."); 

        int[] su3={7,2,4};
        int temp=0;
        if(su3[0]<su3[1]&&su3[0]<su3[2]){
            su3[0]=su3[0];
        }else if(su3[1]<su3[0]&&su3[1]<su3[2]){
            temp=su3[0];
            su3[0]=su3[1];
            su3[1]=temp;
        }else if(su3[2]<su3[0]&&su3[2]<su3[1]){
            temp=su3[0];
            su3[0]=su3[2];
            su3[2]=temp;
        }
        if(su3[1]<su3[2]){
        }else{
            temp=su3[1];
            su3[1]=su3[2];
            su3[2]=temp;
        }
        for(int i=0; i<3; i++){
            System.out.println(su3[i]);
        }
        
     System.out.println("\nQ5.............."); 
        int[] su4={7,2,4,8,3,10};
        for(int i=0; i<su4.length-1; i++){
            for(int j=i+1; j<su4.length; j++){
                if(su4[i]>su4[j]){
                    temp=su4[i];
                    su4[i]=su4[j];
                    su4[j]=temp;
                }
            }
        }
        for(int i=0; i<su4.length; i++){
            System.out.println(su4[i]);
        }
    }//main end
}//class end