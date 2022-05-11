package MRD.Constructors;

// Multiple constructors

public class manyConstructors {
    // Attributes
    int modelYear;
    String modelName;

    // Constructor
    public manyConstructors(int modelYear, String  modelName){
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    public static void main(String[] args) {
        manyConstructors myObj = new manyConstructors(2020, "Ford");
        System.out.println(myObj.modelName + " " + myObj.modelYear);
    }
}
