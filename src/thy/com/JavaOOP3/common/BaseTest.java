package thy.com.JavaOOP3.common;

public class BaseTest {

    public void createDriver() {
        Constants constants = new Constants();
        System.out.println("Brower: "+Constants.browser);
        System.out.println("Report: "+constants.report);
        System.out.println("Headless: "+constants.headless);
    }

    public void closeDriver() {
        System.out.println("Closed Browser: "+Constants.browser);
    }

    public void closeDriver(String browser) {
        System.out.println("Closed Browser: "+Constants.browser);
    }

    public static void main(String[] args) {
        BaseTest test = new BaseTest();
        test.createDriver();

        test.closeDriver();
    }
}
