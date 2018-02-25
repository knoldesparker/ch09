public class Car {
    public void m1(){
        System.out.println("car 1");
    }
    public void m2(){
        System.out.println("car 2");
    }

    @Override
    public String toString() {
        return "vroom";         //Makes a toString
    }
}
class Truck extends Car {
    public void m1() { //Overrides the m1 from car
        System.out.println("truck 1");
    }

}
class SportUtilityVehicle extends Car{
    public static void main(String[] args) {
        SportUtilityVehicle SUV = new SportUtilityVehicle();

        SUV.m1();
        SUV.m2();
        System.out.println(SUV);
    }
    public void m1(){ //Overrides the m1 method again
        System.out.println("SUV 1");
    }
    public void m2(){
        super.m1();     //super calls the original m1 method from car
    }

    @Override
    public String toString() {
        return "SUV " + super.toString(); //combines the super toString from car with SUV
    }
}