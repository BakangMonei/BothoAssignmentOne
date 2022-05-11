package MRD.Constructors;

/*
* MRD.Constructors can also take parameters, which is used to initialize attributes.
* The next example adds an 'ínt y' parameter to the constructor. Inside the constructor we set x to y
* When we call the constructor, we pass a parameter to the constructor(5), which will
* set the value of x to 5*/

public class constructorParameters {
    int x; // Attribute

    public constructorParameters(int u){
        x = u;
    }

    public static void main(String[] args) {
        constructorParameters muyObj = new constructorParameters(5);
        System.out.println(muyObj.x);
    }
}
