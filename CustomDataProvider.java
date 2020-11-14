import org.testng.annotations.DataProvider;

public class CustomDataProvider {

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getObject() {

        Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"}, {"qwe@gmail.com", "qwe"}};
        return data;
    }
}
