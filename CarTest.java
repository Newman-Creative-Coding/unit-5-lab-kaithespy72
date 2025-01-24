public class CarTest{
    public static void main(String args[]){
        car car1 = new Car("Speedster");
        car car2 = new Car("Cubester");
        car car3 = new Car("Roadster");
        car car4 = new Car("Cubester");
        car4.setPlateNumber("504 INS");
        System.out.println(car4);
    }
}