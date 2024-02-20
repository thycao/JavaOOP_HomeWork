package thy.com.JavaOOP2.company;

import thy.com.JavaOOP2.person.Person;

public class Company extends Person {
    public void GetInfoPerson() {
        getProtected();
    }
    public static void main(String[] args) {
        Person person = new Person();
        Company company = new Company();
        company.getProtected();
        System.out.println("=====================");
        company.GetInfoPerson();
    }
}
