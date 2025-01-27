public class CarTest{
    public static void main(String args[]){
        Car car1 = new Car("Speedster");
        Car car2 = new Car("Cubester");
        Car car3 = new Car("Roadster");
        Car car4 = new Car("Cubester");
        car4.setPlateNumber("504 INS");
        System.out.println(car4.returnString());
    }
}