package Grouping.BeforeAndAfterGroupings;

import org.testng.annotations.BeforeGroups;

public class BeforeGroup {
    @BeforeGroups("regression")
    public void beforeRegressionGroup(){
        System.out.println("Before Regression Group");
    }

    @BeforeGroups("functional")
    public void beforeFunctionalGroup(){
        System.out.println("Before Functional Group");
    }

}
