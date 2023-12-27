package automation.simple;

import org.testng.annotations.Test;

import init.BaseWebTest;
import pages.PricelistPage;
import pages.SearchPage;


public class Automation extends BaseWebTest {
  @Test
    public void suksesCari() throws InterruptedException{
        SearchPage searchPage = new SearchPage(driver, explisitWait);
        PricelistPage pricelistPage = new PricelistPage(driver, explisitWait);

      searchPage.cari("Surabaya", "Jakarta");
      String ok;
      ok = pricelistPage.scrappingData();
      System.out.println(ok);
    }

    

}
