package LearnCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SearchBox extends BaseClass {
    public void typeOnSearchBox() {

        driver.findElement(By.id("search_query_top")).sendKeys("Blouse");
    }

    public void clickSearchButton() {
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();
    }

    public void waitTime() throws InterruptedException {
        Thread.sleep(2000);
    }

    public String verifyProductFound() {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1")).getText();
    }

    public void clickProduct() {
        driver.findElement(By.xpath(" //*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).click();
    }

    public void typeOnSearchBox02(String productName) {
        driver.findElement(By.id("search_query_top")).sendKeys(productName);
    }

    public String verifyProductNotFound() {
        return driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText();
    }
    public void performMoverOnWomen(){
        Actions a =new Actions(driver);
       a.moveToElement(driver.findElement(By.xpath("//a[.='Women']"))).build().perform();
    }
    public void clickOnCasualDresses(){
        WebElement casualDresses = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a"));
        casualDresses.click();
    }
}