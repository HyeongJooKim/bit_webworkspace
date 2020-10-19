package day10;

class Car{
    private String model;
    private int speed;
    private int limit;
    private int accel;

    Car(){
//        this("?°μ½?",100,10);//main?? ????  ?¬κΈ°μ λ³??λ₯? ?΄? κ²? μ€? ?? ??€.
    }

    Car(String model, int limit, int accel){
        this.model=model;
        this.limit=limit;
        this.accel=accel;
    }

    void speedUp(){
        if((speed+=accel)>limit){
            speed=limit;
        }
    }
    void speedDown(){
        if((speed-=accel)<0){
            speed=0;
        }
    }
    void show(){
        System.out.println(model+"?΄(κ°?) "+speed+"kmλ‘? ?¬λ¦°λ€");
    }
}//class Car end

public class Ex03 {
    public static void main(String[] args){
        Car car=new Car("λͺ¨λ",120,15);
        
        for(int i=0; i<15; i++){
            car.speedUp();
            car.show();
        }
        for(int i=0; i<15; i++){
            car.speedDown();
            car.show();
        }
    }
    
}//class Ex03 end