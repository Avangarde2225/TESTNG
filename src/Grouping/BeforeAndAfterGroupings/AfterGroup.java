package Grouping.BeforeAndAfterGroupings;

import org.testng.annotations.AfterGroups;

public class AfterGroup {
    @AfterGroups("regression")
    public void afterRegressionGroup(){
        System.out.println("After Regression Group");
    }

    @AfterGroups("functional")
    public void afterFunctionalGroup(){
        System.out.println("After Functional Group");
    }
}
