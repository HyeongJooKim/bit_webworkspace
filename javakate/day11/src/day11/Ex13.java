// package com.bit.day11;
// final class Lec13{//class?�� final 붙이�? ?��?��불�???�� class�? ?��무도 ?��?��?�� ?�� ?��?��. ?��?�� 거�??
//     public void func01(){
//         System.out.println("func01");
//     }
//     private void func02(){
//         System.out.println("func02");
//     }
// }

// public class Ex13 extends Lec13 {

//     public void func01(){
//         super.func01();//�?�? 기능 받아?��?�� �?.
//         System.out.println("Ex13 func01");//overriding?��?�� ?�� 값만 ?���?
//     }
//     void func02(){};

// //method overring 주의: ?��근제?��?�� ?��리는 방향?��로만 �??��?��. public>default>private
// //�?, public--> public �??��, private-->private �??��, private--> public �??�� (반�??방향??? ?��?��)
//     public static void main(String[] args){
//         Ex13 me=new Ex13();
//         me.func01();
//         me.func02();//�?�? class?��?�� private?��?�� ?���? 불�??.
//     }
    
// }