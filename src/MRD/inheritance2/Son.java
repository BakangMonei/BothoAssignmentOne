package MRD.inheritance2;

import MRD.inheritance.car;

import javax.swing.*;

public class Son extends Mother {
    private car CARS;

    private String nose = "small";

    // Super Constructor
    public Son(String eyes, String legs, String ears) {
        super(eyes, legs, ears);
    }

    // Constructor

    public Son(String eyes, String legs, String ears, String nose) {
        super(eyes, legs, ears);
        this.nose = nose;
    }
}
