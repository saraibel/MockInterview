package TestLearnCode;

import LearnCoding.SearchBox;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchClass extends SearchBox {
        @Test
    public void testSearchBox() throws InterruptedException {
        typeOnSearchBox();
        waitTime();
        clickSearchButton();
        clickProduct();
        String expectedText = "Blouse";
        Assert.assertEquals(verifyProductFound(), expectedText);
    }
    @Test
    public void testSearchBoxInvalidProduct() throws InterruptedException {
        typeOnSearchBox02("querty");
        waitTime();
        clickSearchButton();
        String expectedText = "No results were found for your search \"querty\"";
        Assert.assertEquals(verifyProductNotFound(), expectedText);
        Assert.assertTrue(verifyProductNotFound().contains("No results were found for your search"));
    }

    @Test
    public void testHoverWomen(){
//            hoverOnWomen();
//            Assert.assertTrue(isHoveredOnWomen(),"Element is not visible after mouse hover");
//            clickOnCasualDresses();
//            Assert.assertTrue(clickOnCasualDresses(),"is Displayed");
    }

}
