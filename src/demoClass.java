import java.util.Objects;

/*
THE BODY OF A CLASS
* 1. Attributes
* 2. Setters
* 3. Getters
* 4. toString() methods
* 5. hashCodes and equals
* */

public class demoClass {
    // Attributes
    public String name, surname, email, address;
    public int phoneNumber, age;
    public char Gender;

    // Constructors

    public demoClass(String name, String surname, String email, String address, int phoneNumber, int age, char gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age = age;
        Gender = gender;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return Gender;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        Gender = gender;
    }

    // toString methods

    @Override
    public String toString() {
        return "demoClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", age=" + age +
                ", Gender=" + Gender +
                '}';
    }

    // hashCodes and equals()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        demoClass demoClass = (demoClass) o;
        return phoneNumber == demoClass.phoneNumber && age == demoClass.age && Gender == demoClass.Gender && name.equals(demoClass.name) && surname.equals(demoClass.surname) && email.equals(demoClass.email) && address.equals(demoClass.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, address, phoneNumber, age, Gender);
    }
}
