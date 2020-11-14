import org.testng.annotations.Test;

public class GroupingExample {

    @Test(groups = "sanity")
    void test1() {
        System.out.println("This is test 1...");
    }

    @Test(groups = "regression")
    void test2() {
        System.out.println("This is test 2...");
    }

    @Test(groups = "regression")
    void test3() {
        System.out.println("This is test 3...");
    }

    @Test
    void test4() {
        System.out.println("This is test 4...");
    }
    @Test
    void test5() {
        System.out.println("This is test 5...");
    }

    @Test(groups = {"sanity", "regression"})
    void test6() {
        System.out.println("This is test 6...");
    }

}
