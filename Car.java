    /** Car
     * My company, Zoomster, makes 3 models of car at a single factory.
     * Each car has a VIN, a make, a model, and a license plate number.
     * I want to track the total number of cars I have produced, as well
     * as the number of cars of each model, and the total profits from
     * my factory.
     * <p>
     * The Speedster sells for  $102,000.00 
     * The Roadster  sells for  $206,000.00
     * The Cubester  sells for  $74,000.00
     * <p>
     * VIN: unique ID for each car. VIN starts at A10000 and increases 
     * by one for each sequential car produced by the company.
     * E.g.: Our first car, a Speedster, has VIN A10000. Our second car,
     * a Cubester, has VIN A10001. Our third car, a Speedster, has VIN 
     * A10002. After A99999, VIN becomes B10000.
     * <p>
     * make: the company that produced the car. Should be the same for 
     * each car produced by my company.
     * <p>
     * model: can be any of the 3 models of car that I produce: 
     * the Cubester, the Speedster, or the Roadster.
     * <p>
     * license plate number: remains blank until the car is purchased and 
     * registered by a customer. Should be able to be modified by a 
     * method accessible to the customer.
     */
public class Car {
    // Variables:
    private String vin;
    private static String make = "Zoomster";
    private String model;
    private String licensePlateNumber;
    private static int totalCars;
    private static int speedsterCars;
    private static int roadsterCars;
    private static int cubesterCars;
    private static double totalProfits;
    private static int vinLetter;
    private static int vinNumber;

    // Constructor:
    public Car(String carModel){
        if(vinNumber == 0){
            vinNumber = 10000;
        }
        if (vinLetter == 0){
            vinLetter = 65;
        }
        vin = Character.toString((char)vinLetter) + vinNumber;
        if (vinNumber == 99999){
            vinLetter++;
            vinNumber = 10000;
        } else {
        vinNumber++;
        }
        model = carModel;
        totalCars++;
        if(model.equals("Speedster")){
            speedsterCars++;
            totalProfits += 102000;
        } else if(model.equals("Roadster")){
            roadsterCars++;
            totalProfits += 206000;
        } else if(model.equals("Cubester")){
            cubesterCars++;
            totalProfits += 74000;
        }
    }

    // Methods:
    /**
     * Returns the String VIN of a given Car object.
     * Precondition: Car object must be initialized
     * Postcondition: Returns String VIN accessed from the Car object
     * @return VIN -the VIN of the Car object
     */
    public String getVIN(){
        return vin;
    }
    /**
     * [your Javadocs here]
     */
    public String getModel(){
        return model;
    }
    /**
     * [your Javadocs here]
     */
    public String getMake(){
        return make;
    }
    /**
     * Sets the String license plate number of a given Car object.
     * Precondition: Car object must be initialized
     * Postcondition: Modifies the license plate number of the Car object
     * @param plateNumber -the customer's String license plate number
     */
    public void setPlateNumber(String plateNumber){
        licensePlateNumber = plateNumber;
    }
    /**
     * Returns the total profits from cars produced by my factory.
     * @return totalProfits -the total sale price of all Car objects created
     */
    public String getTotalProfits(){
        return "$" + totalProfits;
    }
    /**
     * Returns the total number of cars produced by my factory.
     * @return totalCars -the total number of Car objects created
     */
    public int getTotalCars(){
        return totalCars;
    }
    /**
     * Returns the  number of Speedster cars produced by my factory.
     * @return totalSpeedsters -the total number of Car objects 
     * with model "Speedster" created
     */
    public int getTotalSpeedsters(){
        return speedsterCars;
    }
    /**
     * Returns the  number of Roadster cars produced by my factory.
     * @return totalRoadsters -the total number of Car objects 
     * with model "Roadster" created
     */
    public int getTotalRoadsters(){
        return roadsterCars;
    }
    /**
     * Returns the  number of Cubester cars produced by my factory.
     * @return totalCubeters -the total number of Car objects 
     * with model "Cubester" created
     */
    public int getTotalCubesters(){
        return cubesterCars;
    }

    public String returnString(){
        return "This car has make " + make + ", model " + model + ", a VIN of " + vin + ", a license plate number of " + licensePlateNumber +  ", is the " + totalCars + "th car sold, and the company has made $" + totalProfits + ".";
    }
}