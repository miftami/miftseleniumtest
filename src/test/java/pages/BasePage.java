package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    
    // WebDriver driver;
   public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>(); 
   public ThreadLocal<WebDriverWait> explisitWait = new ThreadLocal<WebDriverWait>();
   //public WebDriverWait explisitWait = new WebDriverWait();

    public BasePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explisitWait){
        this.driver = driver;
        this.explisitWait = explisitWait;
    }

    protected final void clickAndWait(WebElement element){
        explisitWait.get().until(ExpectedConditions.elementToBeClickable(element)).click();

    }

    protected final void setText(WebElement element, String text){
    explisitWait.get().until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    protected final String getText(WebElement element){
        String actualText = explisitWait.get().until(ExpectedConditions.visibilityOf(element)).getText();
        return actualText;
    }

    protected final void tunggu(WebElement element){
    explisitWait.get().until(ExpectedConditions.visibilityOfAllElements(element));
    }
}
