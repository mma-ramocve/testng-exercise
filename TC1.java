import org.testng.annotations.*;

public class TC1 {

    @BeforeClass
    void beforeMClass() {
        System.out.println("This will execute before class.");
    }

    @AfterClass
    void afterMClass() {
        System.out.println("This will execute after class.");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will execute before every method.");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This will execute after every method.");
    }

    @Test
    void test1() {
        System.out.println("This is test 1...");
    }

    @Test
    void test2() {
        System.out.println("This is test 2...");
    }

    @BeforeTest
    void beforeTest() {
        System.out.println("This will execute before the TEST.");
    }

    @AfterTest
    void afterTest() {
        System.out.println("This will execute after the TEST.");
    }
}
