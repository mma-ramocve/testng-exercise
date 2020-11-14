import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 0)
    void testOne() {
        System.out.println("This is test 1.");
    }

    @Test(priority = 1)
    void testTwo() {
        System.out.println("This is test 2.");
    }

    @Test(priority = 3)
    void testThree() {
        System.out.println("This is test 3.");
    }

    @Test(priority = 4, enabled = false)
    void testFour() {
        System.out.println("This is test 4.");
    }
}
