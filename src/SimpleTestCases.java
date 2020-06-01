import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SimpleTestCases {
    @Test
    public void Nationality() {
        System.out.println("Testing test case 1");
    }

    @Ignore
    public void City() {
        System.out.println("Testing test case 2");
    }

    @Test(enabled = false)
    public void Fee() {
        System.out.println("Testing test case 3");
    }

}
