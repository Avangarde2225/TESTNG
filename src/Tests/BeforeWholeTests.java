package Tests;

import org.testng.annotations.BeforeTest;

public class BeforeWholeTests {
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before running test");
    }
}
