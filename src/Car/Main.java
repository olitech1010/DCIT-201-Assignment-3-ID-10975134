


package Car;

public class Main {
    public static void main(String args[]) {
        Car car1 = new Car("Toyota", "Camry", 2023, 120 );
        Car car2 = new Car("Honda", "Civic", 2021, 150);

        System.out.println("Car1 made by : " + car1.getMake() ) ;
        System.out.println("Car1 Model : " + car1.getModel() );
        System.out.println("Car1 made in year : " + car1.getYear() );
        System.out.println("Car1 speed : " + car1.getSpeed() + "mph" );
        car1.accelerate();
        car1.brake();
        System.out.println("Car1 Current speed : " + car1.getSpeed() + "mph" );


        System.out.println("********************************************\n" ) ;

        System.out.println("Car2 made by : " + car2.getMake() ) ;

        System.out.println("Car2 Model : " + car2.getModel() );
        System.out.println("Car2 made in year : " + car2.getYear() );
        System.out.println("Car1 speed : " + car2.getSpeed() + "mph" );
        car2.accelerate();
        car2.brake();
        System.out.println("Car2 Current speed : " + car2.getSpeed() + "mph" );
        

    }



}
