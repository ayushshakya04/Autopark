import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import utils.SearchSchedules;

public class SearchSchedule {
     WebDriver driver;
   
    @BeforeTest
    public void setup() throws InterruptedException
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://cloudeqincdemo2.service-now.com/side_door.do");
        // assertTrue( true );
        WebElement iframeElement=driver.findElement(By.id(SearchSchedules.IFRAME_ELEMENT));
        driver.switchTo().frame(iframeElement);
        // Thread.sleep(5000L);
        
        //Login to the application

        driver.findElement(By.xpath(SearchSchedules.LOGIN_XPATH)).sendKeys(SearchSchedules.LOGIN_NAME);
        
        driver.findElement(By.xpath(SearchSchedules.LOGINPASSWORD_XPATH)).sendKeys(SearchSchedules.PASSWORD_NAME);
   
        driver.findElement(By.xpath(SearchSchedules.LOGIN_BUTTON)).click();

        Thread.sleep(2000);

        driver.get("https://cloudeqincdemo2.service-now.com/rv1");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        //schedule button click
        WebElement schedule= driver.findElement(By.xpath(SearchSchedules.SCHEDULE_BUTTON));
        schedule.click();
        Thread.sleep(1000);

        //searching the schedule
        WebElement scheduleclick=driver.findElement(By.xpath(SearchSchedules.SEARCH_SCHEDULE));
        String[] scheduleName=SearchSchedules.SCHEDULE_NAME;
        for(String search : scheduleName){
            scheduleclick.click();
            scheduleclick.sendKeys(search);

            Thread.sleep(2000);

            scheduleclick.clear();
            Thread.sleep(1000);
            
            // driver.quit();
        
        }
        driver.quit();
}
}