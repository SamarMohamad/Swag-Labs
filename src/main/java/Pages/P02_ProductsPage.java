package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static util.Utility.generateUniqueRandomNumbers;
import static util.Utility.parsePriceFromString;

public class P02_ProductsPage {

    WebDriver driver;
    public static float total;


    public P02_ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    int temp;

    public P02_ProductsPage addRandomProducts(int count) throws InterruptedException {
        temp = count;
        List<Integer> uniqueRandomNumbers = generateUniqueRandomNumbers(count);
        total = 0;
        // 1,4,6,2,3
        for (int i = 1; i <= count; i++) {
            // click "add to card"
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//button[@class=\"btn_primary btn_inventory\"])[" + uniqueRandomNumbers.get(i - 1) + "]")).click();
            // store price
            total += parsePriceFromString(driver.findElement(By.xpath("(//div[@class=\"inventory_item_price\"])[" + uniqueRandomNumbers.get(i -1) + "]")).getText());
        }
        System.out.println("Total Price is :" + total);
        Thread.sleep(5000);
        return this;
    }
}
    // TODO: to be done next friday

