import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import utils.EditSchedules;


class RenameSchedule{
     WebDriver driver;
   
    /**
     * @throws InterruptedException
     */
    @BeforeTest
    public void setup() throws InterruptedException
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://cloudeqincdemo2.service-now.com/side_door.do");
        // assertTrue( true );
        WebElement iframeElement=driver.findElement(By.id(EditSchedules.IFRAME_ELEMENT));
        driver.switchTo().frame(iframeElement);
        // Thread.sleep(5000L);
        
        //Login to the application

        driver.findElement(By.xpath(EditSchedules.LOGIN_XPATH)).sendKeys(EditSchedules.LOGIN_NAME);
        
        driver.findElement(By.xpath(EditSchedules.LOGINPASSWORD_XPATH)).sendKeys(EditSchedules.PASSWORD_NAME);
   
        driver.findElement(By.xpath(EditSchedules.LOGIN_BUTTON)).click();

        Thread.sleep(2000);

        String url="https://cloudeqincdemo2.service-now.com/autopark";
        driver.get(url);

        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));

        //schedule button click
        WebElement schedule= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.SCHEDULE_BUTTON)));
        schedule.click();
        Thread.sleep(2000);

        WebElement schedule_record= driver.findElement(By.xpath(EditSchedules.SCHEDULE));
        //a[@class='anchor-btn cursor-hover']/span[text()='Schedules']
        schedule_record.click();
        Thread.sleep(3000);

        WebElement selectdot=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.SELECTTHREEDOT)));
        selectdot.click();

        Thread.sleep(000);
        
        
        WebElement editScheduleButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.EDITSCHEDULEBUTTON)));

        // Click the "Edit Schedule" button
        editScheduleButton.click();

        Thread.sleep(2000);

        
        WebElement renamebutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.RENAME_BUTTON)));
        renamebutton.click();

        Thread.sleep(2000);
        WebElement newschedulename = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.NEW_SCHEDULE_NAME)));
        newschedulename.sendKeys(EditSchedules.SCHEDULE_NAME);  

        Thread.sleep(2000);
        WebElement businessjusti = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.RENAME_BUSINESS_JUSTI_BOX)));
        businessjusti.sendKeys(EditSchedules.BUSINESS_JUSTI);  
              
        Thread.sleep(2000);
        WebElement submit_form = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.SUBMIT_FORM)));
        submit_form.click();  
        Thread.sleep(2000); 
        
        driver.navigate().refresh();

        driver.close();
}
}