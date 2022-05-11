package MRD.NonModifiers;

public class second {
    public static void main(String[] args) {
        // creating object
        Student myObj = new Student();

        System.out.println("Name: " + myObj.name);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // Calls the abstract method
    }
}
