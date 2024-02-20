package thy.com.JavaOOP3.testcases;

import thy.com.JavaOOP3.common.BaseTest;

public class TestCases extends BaseTest {

    public void commonloginTC(){
        System.out.println("Open browswer");
        System.out.println("Access the to link: https://cms.anhtester.com/login");
        System.out.println("Put Email and Password in the field");
        System.out.println("Click on Login button");
    }
    public void login() {
        createDriver();
        commonloginTC();
        closeDriver();
    }

    public void addCategory() {
        createDriver();
        commonloginTC();

        System.out.println("Access to Category page");
        System.out.println("Add necessary fields");
        System.out.println("Then Save");
        System.out.println("Add new category successfully");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCases test = new TestCases();
        test.login();
        System.out.println("==========================");
        test.addCategory();
    }

}
