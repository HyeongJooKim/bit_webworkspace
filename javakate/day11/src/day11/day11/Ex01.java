package day11;

public class Ex01 {
    public static void main(String[] args){
        //??Ό?΄??€(wrapper class)
        //κΈ°λ³Έ?λ£ν? ?΄?Ή?? ?΄??€?λ£ν
        //?€? λ°μ±&?Έλ°©μ?΄ ?Ό?΄?¨. μ¦? κΈ°λ³Έ?λ£ν<->??Ό?΄??€ κ°? ?λ£ν?΄ ???Όλ‘? λ°λ?λ€.
        //λ°μ±: κ°μ κ°μ²΄λ‘? ??¬?Έ? κ²?. μ¦?, int?Έ 1234λ₯? Interger κ°μ²΄?Έ "1234"λ‘? λ°κΎΈ? κ²?
        //?Έλ°μ±: κ°μ²΄???? κ°μ κ°μΌλ‘? λΆλ¬?΄? κ²?
        //?: int <-> Integer
        int su1;
        su1=100;
        Integer su2;//int? ?΄?Ή?? ??Ό?΄??€
        su2=new Integer(1000);//(κ°?)? ? ?£?Όλ©? ?€λ₯?
        System.out.println(su2);
        System.out.println(su1+su2);//?°?°? κ°??₯. κ·ΈλΌ λ­κ?? ?¬?Ό? ? ?°??

        Integer su3=new Integer("3000");//λ¬Έμ?΄?Έ ?«?λ₯? ?«?λ‘? ?Έ??  ? ?? ?΄??€
        // Integer su4=new Integer("A");//λ¬Έμ?΄? λ¬Έμλ₯? ?£?Όλ©? ?€λ₯?. λ¬Έμ? ?«?? ??΄ ?¨? ?€λ₯?
        System.out.println(su2+su3);//?°?° κ²°κ³Ό? ??????? int? (Integer ??κ³?)
        
        Integer su4=1234;//?΄? κ²? ?¨? ?€λ₯? ??¨. μ¦? Integer ?????Έ "1234"κ°μ ??? ??? κ²?. ?΄κ²μ ?°?°?λ©? int 1234λ‘? auto unboxing?¨
        System.out.println(su3+su4);//?°?° κ²°κ³Ό? ??????? int? (Integer ??κ³?)
        
        // Integer class? ??± ??λ³΄μ
        // class?κΉ? λ³??κ°? ?κ² μ??
        System.out.println(Integer.MIN_VALUE);//-2147483648 μΆλ ₯. MIN_VALUE? ???λ¬Έμ? ??? λ³???€
        System.out.println(Integer.MAX_VALUE);//2147483647 μΆλ ₯
        System.out.println(Integer.SIZE);//32 μΆλ ₯
        System.out.println(Integer.BYTES);//4 μΆλ ₯

        // class?κΉ? method? ?κ² μ??
        Integer su5=new Integer(127);
        System.out.println(su5.byteValue());//127 μΆλ ₯. κ°μ byte κ°μΌλ‘? μΆλ ₯
        su5=128;
        System.out.println(su5.byteValue());//-128 μΆλ ₯
        System.out.println(su5.shortValue());//128 μΆλ ₯
        System.out.println(su5.intValue());// 128 μΆλ ₯

        // byte by=su5.byteValue();// ?΄? κ²? ?λ£ν λ³???΄ κ°??₯. byteValue()?Έ? ? ??Έ κ²?
        // short sho=su5.shortValue();
        // int su=su5.intValue();
        // long su66=su5.longValue();

        Integer su7=new Integer(100);
        Integer su8=new Integer(100);
        System.out.println(su7==su8);// false μΆλ ₯. ?«?? κ°μ λ³΄μ¬? κ°κ° ?λ‘μ΄ κ°μ²΄λ₯? μ°μ΄?Έ κ²μ΄λ―?λ‘?
        System.out.println(100==su7);// true μΆλ ₯. ?λ£ν?΄ ?€λ₯? ?? λΉκ΅?? ?κ°? auto-unboxing?΄ ?Ό?΄? su7? κ°μ ??΄?΄? λΉκ΅?¨
        System.out.println(su7.equals(su8));// true μΆλ ₯. equals()? κ°μ λΉκ΅?? λ©μ?

        String msg="1234";
        Integer su9=Integer.valueOf(msg);// κ°μ?? ?½?΄?€μ§?λ§? ?λ£ν??? ?¬? ? Integer
        System.out.println(su9+1);//?°?°? κ²°κ³Όκ°μ?? int type
        // int su10=Integer.parseInt(msg);//intλ‘? type? ?. κ°??₯ λ§μ΄ ?΄?©?¨.
        // int su99=su9;//Integer ?Έ su9λ₯? int?Έ su99? ?????¨?Όλ‘μ intλ‘? type λ³??

        int su11=Integer.max(12,9);
        int su12=Integer.min(12,9);
        System.out.println(su11);//12 μΆλ ₯
        System.out.println(su12);//9 μΆλ ₯

        int su13=0;
        int su14=Integer.reverse(su13);
        System.out.println(su13+"? λ³΄μ:"+su14);//0? λ³΄μ:0
 
        int su15=16;
        System.out.println("?­μ§μ:"+su15);//?­μ§μ:16
        System.out.println("2μ§μ:"+Integer.toBinaryString(su15));//2μ§μ:10000 // κ²°κ³Όκ°μ?? String type?
        System.out.println("8μ§μ: 0"+Integer.toOctalString(su15));//8μ§μ:020
        System.out.println("16μ§μ: 0x"+Integer.toHexString(su15));//16μ§μ:0x10

        int su16=10;
        int su17=10;
        int su18=Integer.compare(su16,su17);//?? ?κ°? ?¬λ©? 1, ??Όλ©? -1, κ°μΌλ©? 0? λ°ν?¨
        System.out.println(su18);//0
        Integer su19=11;
        int su20=su19.compareTo(su17);//compare??? κ°μ?? κΈ°λ₯. ?? ?κ°? ?¬λ©? 1, ??Όλ©? -1, κ°μΌλ©? 0? λ°ν?¨
        System.out.println(su20);//1

    }//main end
}//class Ex01 end