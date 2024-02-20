package thy.com.JavaOOP2.person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    public Person() {
        name = "Thanh";
        age = 20;
        gender = "Female";
        address = "Sai Gon";
        phone = "+95999215";
    }

    void getDefault() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }

    protected void getProtected() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
