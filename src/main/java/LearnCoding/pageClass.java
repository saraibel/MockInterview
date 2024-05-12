package LearnCoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class pageClass extends BaseClass {
 public WebElement checkBoxElement;
    public void clickSignIn() {
        driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
    }

    public void EnterEmailAddress() {
        driver.findElement(By.xpath("//*[@id=\"email_create\"] ")).sendKeys("sara.ibel06@gmail.com");
    }

    public void createButtonDisplayed() {
        WebElement createButton = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
        if (createButton.isDisplayed()) {
            createButton.click();
            System.out.println("createButton is clicked successfully");
        } else {
            System.out.println("createButton is not displayed");
        }

    }

    public void personalInformationText() {
        WebElement pInfo = driver.findElement(By.xpath("//div[@id='container-id']//h3[@class='page-subheading']\n"));
        if (pInfo.isDisplayed()) {
            System.out.println("text is displayed");
        } else {
            System.out.println("text is not displayed ");
        }
    }

    public void radioButtonIsSelected() {
        WebElement radioMrs = driver.findElement(By.xpath("//input[@id='id_gender2']"));
        if (radioMrs.isSelected()) {
            radioMrs.click();
            System.out.println("radio button is selected mrs ");
        } else {
            System.out.println(" radio button is not selected ");
        }
    }

    public void enterFirstName() {
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("sara");
    }

    public void enterLastName() {
        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Ibel");
    }

    public void enterEmail() {
    }

    public void enterPassWord() {
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Test1234567");
    }
    public void dayBirth(String day) {
        WebElement dayDropDown = driver.findElement(By.xpath("//select[@id='days']"));
        Select daySelect =new Select(dayDropDown);
        daySelect.selectByVisibleText(day);
    }
    public  void  monthBirth(String month) {
       WebElement monthDropDown  =driver.findElement(By.xpath("//select[@id='months']"));
        Select monthSelect =new Select(monthDropDown);
      monthSelect.selectByVisibleText(month);
    }
    public void  yearBirth(String year) {
        WebElement yearDropDown =driver.findElement(By.xpath("//select[@id='years']"));
        Select yearSelect =new Select(yearDropDown);
         yearSelect.selectByVisibleText(year);
    }
    public void locateCheckBox() {
        WebElement checkBoxElement = driver.findElement(By.xpath("//input[@id='newsletter']"));
    }
    public boolean isCheckBoxSelected() {
        checkBoxElement.isSelected();
        return isCheckBoxSelected();
    }
       public void clickCheckBox(){
            checkBoxElement.click();
        }
        public void  clickRegisterButton(){
        driver.findElement(By.xpath("//span[.='Register']")).click();
    }
        public String accountCreated(){
            WebElement accountMessageCreated =driver.findElement(By.xpath("driver.findElement(By.xpath(\"//sp"));
            return accountMessageCreated.getText();

        }
    }














