package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PricelistPage extends BasePage {
    public PricelistPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explisitWait) {
        super(driver, explisitWait);
        //TODO Auto-generated constructor stub
    }
   
        @FindBy (xpath = "//button[contains(.,'OKAY, GOT IT!')]")
        WebElement promo;
        String list = "";

        public String scrappingData(){
       //     promo.click();
            //WebElement webElement = driver.get().findElement(By.xpath("//span[@class='bgProperties  overlayCrossIcon icon20']"));
            //tunggu(webElement);
            for(int i = 1; i <= 5 ; i++){
                if (driver.get().findElement(By.xpath("//div[@class='clusterContent']/div[1]/div["+i+"]//p[@class='boldFont blackText airlineName']")).isDisplayed()) {
                            
                    list += driver.get().findElement(By.xpath("//div[@class='clusterContent']/div[1]/div["+i+"]//p[@class='boldFont blackText airlineName']")).getText();
                    list += " | \n";
                    list += driver.get().findElement(By.xpath( "//div[@class='clusterContent']/div[1]/div["+i+"]//div[@class='blackText fontSize18 blackFont white-space-no-wrap clusterViewPrice']")).getText();
                    list += " | \n";
                    } else{
                        i++;
                }
        }
            
           //div[@class='clusterContent']/div[1]/div[1]//div[@class='blackText fontSize18 blackFont white-space-no-wrap clusterViewPrice']
            //div[@class='clusterContent']/div[1]/div[1]//p[@class='boldFont blackText airlineName']
            //div[@class='clusterContent']/div[1]/div[2]//p[@class='boldFont blackText airlineName']
            //div[@class='clusterContent']/div[1]/div[1]//div[@class='blackText fontSize18 blackFont white-space-no-wrap clusterViewPrice']
            //div[@class='clusterContent']/div[1]/div[2]//div[@class='blackText fontSize18 blackFont white-space-no-wrap clusterViewPrice']
            //div[@class='clusterContent']//div[3]//p[@class='boldFont blackText airlineName']
            
            return list;
        }

    
}
