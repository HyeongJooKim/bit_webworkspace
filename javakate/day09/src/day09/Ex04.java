package day09;

class Car{
    private String model;
    //?���?�? car ?��름을 바꾸?�� 것을 막기 ?��?�� private?�� 붙임. ?��?�� 코딩?�� ?��?��?�� ?���??���? ?��?��.
    //?��?�� �? 캡슐?��?���? ?���? java?�� ?�� ?��?��. method?�� ?��?��?���? ?��?��?���? ?��근할 ?�� ?��?��.
    private int limit=150;
    private int speed=0;
    private int accel=5;

    Car(){
        model="?��?���?";
        limit=150;
        accel=10;
    }

    Car(String name, int a, int b){
        model=name;
        limit=a;
        accel=b;
    }

    void speedUp(){
        if((speed+=accel)>limit){speed=limit;}
    }
    void speedDown(){
        if((speed-=accel)<0){speed=0;}
    }
    void show(){
        System.out.println(model+"?�� "+speed+"km�? ?��린다");
    }
}//class Car end

class Ex04{
    public static void main(String[] args){
        Car car=new Car("모닝", 130, 10);
        car.show();
        car.speedUp();
        car.show();
        for(int i=0; i<40; i++){
            car.speedUp();
            car.show();
        }

        car=new Car("????��?��", 180, 15);
        car.show();
        car.speedUp();
        car.show();
        for(int i=0; i<40; i++){
            car.speedDown();
            car.show();
        }

        car=new Car();//car ?�� �? 중에 ?��?���? ?��?���? ?��??? car()�? 찾아�??�� method overload�? ?��.
        car.show();
        car.speedUp();
        car.show();
        for(int i=0; i<40; i++){
            car.speedUp();
            car.show();
        }


    //    java.util.Scanner sc=new java.util.Scanner(System.in);
    //  sc=new
    }//main end       

}//class Ex04 end