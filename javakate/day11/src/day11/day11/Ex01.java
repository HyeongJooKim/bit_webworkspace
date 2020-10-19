package day11;

public class Ex01 {
    public static void main(String[] args){
        //?��?��?��?��?��(wrapper class)
        //기본?��료형?�� ?��?��?��?�� ?��?��?��?��료형
        //?��?��박싱&?��방식?�� ?��?��?��. �? 기본?��료형<->?��?��?��?��?�� �? ?��료형?�� ?��?��?���? 바�?�다.
        //박싱: 값을 객체�? ?��?��?��?�� �?. �?, int?�� 1234�? Interger 객체?�� "1234"�? 바꾸?�� �?
        //?��박싱: 객체????�� 값을 값으�? 불러?��?�� �?
        //?��: int <-> Integer
        int su1;
        su1=100;
        Integer su2;//int?�� ?��?��?��?�� ?��?��?��?��?��
        su2=new Integer(1000);//(�?)?�� ?�� ?��?���? ?���?
        System.out.println(su2);
        System.out.println(su1+su2);//?��?��?�� �??��. 그럼 뭐�?? ?��?��? ?�� ?��?��?

        Integer su3=new Integer("3000");//문자?��?�� ?��?���? ?��?���? ?��?��?�� ?�� ?��?�� ?��?��?��
        // Integer su4=new Integer("A");//문자?��?�� 문자�? ?��?���? ?���?. 문자?�� ?��?��?�� ?��?�� ?��?�� ?���?
        System.out.println(su2+su3);//?��?�� 결과?�� ????��??? int?�� (Integer ?��?���?)
        
        Integer su4=1234;//?��?���? ?��?�� ?���? ?��?��. �? Integer ????��?�� "1234"값을 ?��?��?�� ?��?��?�� �?. ?��것을 ?��?��?���? int 1234�? auto unboxing?��
        System.out.println(su3+su4);//?��?�� 결과?�� ????��??? int?�� (Integer ?��?���?)
        
        // Integer class?�� ?��?�� ?��?��보자
        // class?���? �??���? ?��겠�??
        System.out.println(Integer.MIN_VALUE);//-2147483648 출력. MIN_VALUE?�� ???문자?�� ?��?��?�� �??��?��
        System.out.println(Integer.MAX_VALUE);//2147483647 출력
        System.out.println(Integer.SIZE);//32 출력
        System.out.println(Integer.BYTES);//4 출력

        // class?���? method?�� ?��겠�??
        Integer su5=new Integer(127);
        System.out.println(su5.byteValue());//127 출력. 값을 byte 값으�? 출력
        su5=128;
        System.out.println(su5.byteValue());//-128 출력
        System.out.println(su5.shortValue());//128 출력
        System.out.println(su5.intValue());// 128 출력

        // byte by=su5.byteValue();// ?��?���? ?��료형 �??��?�� �??��. byteValue()?��?�� ?�� ?��?�� �?
        // short sho=su5.shortValue();
        // int su=su5.intValue();
        // long su66=su5.longValue();

        Integer su7=new Integer(100);
        Integer su8=new Integer(100);
        System.out.println(su7==su8);// false 출력. ?��?��?�� 같아 보여?�� 각각 ?��로운 객체�? 찍어?�� 것이�?�?
        System.out.println(100==su7);// true 출력. ?��료형?�� ?���? ?��?�� 비교?��?�� ?���? auto-unboxing?�� ?��?��?�� su7?�� 값을 ?��?��?��?�� 비교?��
        System.out.println(su7.equals(su8));// true 출력. equals()?�� 값을 비교?��?�� 메서?��

        String msg="1234";
        Integer su9=Integer.valueOf(msg);// 값�?? ?��?��?���?�? ?��료형??? ?��?��?�� Integer
        System.out.println(su9+1);//?��?��?�� 결과값�?? int type
        // int su10=Integer.parseInt(msg);//int�? type?��?��. �??�� 많이 ?��?��?��.
        // int su99=su9;//Integer ?�� su9�? int?�� su99?�� ????��?��?��로서 int�? type �??��

        int su11=Integer.max(12,9);
        int su12=Integer.min(12,9);
        System.out.println(su11);//12 출력
        System.out.println(su12);//9 출력

        int su13=0;
        int su14=Integer.reverse(su13);
        System.out.println(su13+"?�� 보수:"+su14);//0?�� 보수:0
 
        int su15=16;
        System.out.println("?��진수:"+su15);//?��진수:16
        System.out.println("2진수:"+Integer.toBinaryString(su15));//2진수:10000 // 결과값�?? String type?��
        System.out.println("8진수: 0"+Integer.toOctalString(su15));//8진수:020
        System.out.println("16진수: 0x"+Integer.toHexString(su15));//16진수:0x10

        int su16=10;
        int su17=10;
        int su18=Integer.compare(su16,su17);//?��?�� ?���? ?���? 1, ?��?���? -1, 같으�? 0?�� 반환?��
        System.out.println(su18);//0
        Integer su19=11;
        int su20=su19.compareTo(su17);//compare??? 같�?? 기능. ?��?�� ?���? ?���? 1, ?��?���? -1, 같으�? 0?�� 반환?��
        System.out.println(su20);//1

    }//main end
}//class Ex01 end