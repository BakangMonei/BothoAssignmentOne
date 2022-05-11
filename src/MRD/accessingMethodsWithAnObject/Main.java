package MRD.accessingMethodsWithAnObject;

// Create a car object named 'myCar'. Call the fullThrottle() and speed() methods on my car object, and run the code

public class Main {

    // Creating the fullThrottle() method
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can");
    }

    // Creating the speed() method
    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed + "km");
    }

    public static void main(String[] args) {
        Main myCar = new Main(); // Creating an object
        myCar.fullThrottle(); // calling the methods
        myCar.speed(200); // calling the methods
    }
}