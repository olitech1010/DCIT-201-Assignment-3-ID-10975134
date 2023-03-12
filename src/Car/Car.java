/**•	
 Create a Java class Car with the following attributes:
•	make (a string)
•	model (a string)
•	year (an int)
•	speed (a double)

The class should have the following methods:
•	getMake(): This method should return the make of the car.
•	getModel(): This method should return the model of the car.
•	getYear(): This method should return the year of the car.
•	getSpeed(): This method should return the speed of the car.
•	accelerate(): This method should increase the speed of the car by 10 mph.
•	brake(): This method should decrease the speed of the car by 7 mph.
You should also write a Main class that creates two Car objects, sets their attributes, and demonstrates the use of each of the methods
 */

package Car;

public class Car {
    private String make;
    private String model;
    private int year;
    private double speed;

    public Car(String make, String model, int year, double speed){
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;

    }

    public String getMake() {
        return make;

    }

    public String getModel(){
        return model;
    }

    public int getYear() { 
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public void accelerate() {
        speed += 10;
    }

    public void brake(){
        speed -= 7;
    }
    
}
