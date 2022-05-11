package MRD.inheritance;

public class car extends vehicle{
    private String modelName = "Ford Ranger";

    public static void main(String[] args) {
        // Creating an object
        car myCar = new car();

        // calling the honk
        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
