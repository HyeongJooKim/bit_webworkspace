package day09;

class Car{
    private String model;
    //?¨λΆ?λ‘? car ?΄λ¦μ λ°κΎΈ? κ²μ λ§κΈ° ??΄ private? λΆμ. ?? μ½λ©? ??±? ? μ§??κΈ? ??΄.
    //?΄?° κ±? μΊ‘μ??Όκ³? ?λ©? java? ?° ?₯? . method? ??±?λ₯? ?΅?΄?λ§? ? κ·Όν  ? ??€.
    private int limit=150;
    private int speed=0;
    private int accel=5;

    Car(){
        model="?Ή?©μ°?";
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
        System.out.println(model+"?΄ "+speed+"kmλ‘? ?¬λ¦°λ€");
    }
}//class Car end

class Ex04{
    public static void main(String[] args){
        Car car=new Car("λͺ¨λ", 130, 10);
        car.show();
        car.speedUp();
        car.show();
        for(int i=0; i<40; i++){
            car.speedUp();
            car.show();
        }

        car=new Car("???? ?€", 180, 15);
        car.show();
        car.speedUp();
        car.show();
        for(int i=0; i<40; i++){
            car.speedDown();
            car.show();
        }

        car=new Car();//car ? κ°? μ€μ ?Έ?κ°? ??Όλ©? ???? car()λ₯? μ°Ύμκ°?? method overloadκ°? ?¨.
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