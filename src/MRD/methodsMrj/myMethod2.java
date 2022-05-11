package MRD.methodsMrj;

public class myMethod2 {

    // My static method
    static void myStaticMethod(){
        System.out.println("Static Method Mr J");
    }

    // My public method
    public void myPublicMethod(){
        System.out.println("Public Method Mr J");
    }

    public static void main(String[] args) {
        myStaticMethod(); // Calling the static method
        // myPublicMethod(); This would compile an error


        // This is how we call the publicMethod
        myMethod2 myObject = new myMethod2();
        myObject.myPublicMethod(); // Calling the public method
    }
}
