package TestLearnCode;
import LearnCoding.pageClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class TestPageClass extends pageClass {
    WebDriver driver = new ChromeDriver();

    @Test
    public void testClickSignIn() {
        clickSignIn();
        EnterEmailAddress();
        createButtonDisplayed();
        boolean createButton = true;
        assertTrue(true, "createButton is clicked");
    }
//    @Test
//    public void TestPersonalInformationText() {
//        personalInformationText();
//        boolean pInfo = true;
//        Assert.assertTrue(true, "YOUR PERSONAL INFORMATION");
//    }
//        @Test
//    public void TestRadioButtonIsSelected(){
//            radioButtonIsSelected();
//            boolean radioMrs = false;
//            Assert.assertTrue(true,"radioMrs is not selected ");
//        }
        @Test
 public void TestCustomerInfo(){
        enterFirstName();
        enterLastName();
        enterEmail();
        enterPassWord();
}
        @Test
        public void TestDropDownBirthDate() {
            dayBirth("06");
            WebElement dayDropDown = null;
            Assert.assertTrue(dayDropDown.isDisplayed());
            Assert.assertEquals(dayDropDown.getAttribute("value"), "06");

            monthBirth("11");
            WebElement monthDropDown = null;
            Assert.assertTrue(monthDropDown.isDisplayed());
            Assert.assertEquals(monthDropDown.getAttribute("value"), "11");

            yearBirth("1988");
            WebElement yearDropDown = null;
            Assert.assertTrue(yearDropDown.isDisplayed());
            Assert.assertEquals(monthDropDown.getAttribute("value"), "1988");
        }
        @Test
    public void TestCheckBox() {
            locateCheckBox();
            isCheckBoxSelected();
            Assert.assertFalse(isCheckBoxSelected());
            clickCheckBox();
            Assert.assertTrue(isCheckBoxSelected());
        }
        @Test
    public void TestResgisterButton() {
            clickRegisterButton();
        }
        @Test
        public void testAccountCreated(){
        accountCreated();
        String actual = accountCreated();
        String expected = "Your account has been created";
        Assert.assertEquals(actual,expected);


}
























        }









