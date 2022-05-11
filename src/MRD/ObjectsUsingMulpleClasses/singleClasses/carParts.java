package MRD.ObjectsUsingMulpleClasses.singleClasses;
// Creating 1 object

public class carParts {
    // Attributes (Parts of the car)
    String tyres = "sizeOfTyres= 20", steeringWheel, engine;
    int speed = 5;

    /* Creating an object*/
    public static void main(String[] args) {
        /*Syntax
        nameOfClass objectName = new nameOfClass();*/
        carParts myObj = new carParts();
        System.out.println(myObj.tyres);
    }
}
