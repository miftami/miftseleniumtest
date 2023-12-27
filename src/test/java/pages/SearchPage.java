package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage{
    //@Test
    public SearchPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explisitWait) {
        super(driver, explisitWait);
        PageFactory.initElements(driver.get(), this);
    }
        //TODO Auto-generated constructor stub

       

       // WebDriverWait wait = new WebDriverWait(driver, 20);
         @FindBy(id = "fromCity")
        WebElement from;
       
        @FindBy(xpath = "//input[@placeholder='From']")
        WebElement fromCity;

        @FindBy(id = "toCity")
        WebElement to;

        @FindBy(xpath = "//input[@placeholder='To']")
        WebElement toCity;

        @FindBy(xpath = "//div[.='Surabaya, Indonesia JuandaSUB']")
        WebElement pilihDari;

        @FindBy(xpath = "//p[@class='blackText makeFlex hrtlCenter']")
        WebElement pilihKe;

        // @FindBy(xpath = "//span[.='Departure']")
        // WebElement departure;

        @FindBy(xpath = "//div[@class='DayPicker-Day DayPicker-Day--selected']")
        WebElement tanggal;
        
        // @FindBy(xpath = "//span[@class='lbl_input appendBottom5']")
        // WebElement penumpang;

        @FindBy(xpath = "//a[.='Search']")
        WebElement search;

        // @FindBy(xpath = "//li[@class='react-autosuggest__suggestion react-autosuggest__suggestion--first']")
        // WebElement pilihFrom;
        
        public void cari(String dari, String ke){
         
            from.click();
            setText(fromCity, dari);
            pilihDari.click();
            
            //to.wait();
            to.click();
            setText(toCity, ke);
            pilihKe.click();

            tanggal.click();
            //departure.wait();
            // departure.click();
            // setText(departure, pergi);
            // kembali.click();
            // setText(kembali, pulang);
            // penumpang.click();
            // setText(penumpang, orang);
            clickAndWait(search);
        }

    

}
