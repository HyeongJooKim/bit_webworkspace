package day09;

class Car{
    private String model;
    //?•¨ë¶?ë¡? car ?´ë¦„ì„ ë°”ê¾¸?Š” ê²ƒì„ ë§‰ê¸° ?œ„?•´ private?„ ë¶™ìž„. ?›?ž˜ ì½”ë”©?•œ ?†?„±?„ ?œ ì§??•˜ê¸? ?œ„?•´.
    //?´?Ÿ° ê±? ìº¡ìŠ?™”?¼ê³? ?•˜ë©? java?˜ ?° ?ž¥? . method?‚˜ ?ƒ?„±?žë¥? ?†µ?•´?„œë§? ? ‘ê·¼í•  ?ˆ˜ ?žˆ?‹¤.
    private int limit=150;
    private int speed=0;
    private int accel=5;

    Car(){
        model="?Š¹?š©ì°?";
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
        System.out.println(model+"?´ "+speed+"kmë¡? ?‹¬ë¦°ë‹¤");
    }
}//class Car end

class Ex04{
    public static void main(String[] args){
        Car car=new Car("ëª¨ë‹", 130, 10);
        car.show();
        car.speedUp();
        car.show();
        for(int i=0; i<40; i++){
            car.speedUp();
            car.show();
        }

        car=new Car("????† ?Š¤", 180, 15);
        car.show();
        car.speedUp();
        car.show();
        for(int i=0; i<40; i++){
            car.speedDown();
            car.show();
        }

        car=new Car();//car ?‘ ê°? ì¤‘ì— ?¸?žê°? ?—†?œ¼ë©? ?—†??? car()ë¥? ì°¾ì•„ê°??„œ method overloadê°? ?¨.
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