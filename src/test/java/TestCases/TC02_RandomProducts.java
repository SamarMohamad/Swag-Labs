package TestCases;

import Pages.P02_ProductsPage;
import org.testng.annotations.Test;
import util.Utility;

public class TC02_RandomProducts extends TestBase{


    @Test
    public void addRandomProducts_P() throws InterruptedException {
        int number_Of_Products=Utility.generateUniqueRandomNumbers(3).get(0);
        System.out.println(number_Of_Products);
        new P02_ProductsPage(driver).addRandomProducts(number_Of_Products);
        Thread.sleep(1000);
    }

}
