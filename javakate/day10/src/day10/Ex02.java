package day10;

public class Ex02 {

    int su;

    public Ex02(){//?��?��?���? ?��?��?��?�� ?��?�� default ?��?��?��. 그러?�� ?��기선 객체 ?��?�� ?��?��
        //su=1234; //1. this.su=1234; �? ?�� 거나 같다. this. ??? ?��?��?��?�� ?��?��
        this(1234);//2.?��??? 같이 ?��?�� �? ????��?�� ?��?���? ?�� ?�� ?��?��?��, ?��, 반드?�� 첫줄?�� ????�� ?��. ?��?��?��?��?���? 존재?�� ?�� ?��?��.
        //super(); //3.?�� ?���?�? 중에 ?��?���? ?��?��?�� ?��.
        //?��? 객체�? ?��?��?���? ?���? �? ?��?���? ?�� ?�� ?��?��. 그래?�� ?��?��?��?�� 첫줄?�� 반드?�� ????�� ?��.
        System.out.println("객체�? ?��?��?��?��?��?��?��");

        System.out.println(this);// ?�� ?��?��?�� ?��?��코드값을 출력?��. ?��?��코드???? 고유값�?? ?��?���? ?��?��?�� 만들?��?��?�� 값이�? ?��?�� 거의 중복?���? ?��?��?��.
    }

    public Ex02(int su){//객체?��?��??? ?��기서�? ?���? ?��?��
        //super();//?�� 코드�? ?��?��?��?�� ?��?�� ?��. ?��?��?�� ?��?��?�� 같음
        System.out.println("객체�? ?��?��?��?��?��?��?��");
        this.su=su;
        System.out.println(this);
    }
    public static void main(String[] args){
        Ex02 me=new Ex02(4321);//값을 주면 4321 출력?���?, ?��주면 첫번�? 1234 출력?��
        System.out.println("su="+me.su);//non-static �??��?�� su�? ?��?��?��?���? 참조�??���? ?��?��????�� ?��. 그냥 su?�� ?��류남.
        me=new Ex02();
        System.out.println("su="+me.su);
    }
}