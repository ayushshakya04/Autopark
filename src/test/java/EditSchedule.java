import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import utils.EditSchedules;


public class EditSchedule {
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
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));

        WebElement iframeElement=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(EditSchedules.IFRAME_ELEMENT)));
        driver.switchTo().frame(iframeElement);
        // Thread.sleep(5000L);
        
        //Login to the application

        WebElement Login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.LOGIN_XPATH)));
        Login.sendKeys(EditSchedules.LOGIN_NAME);
        
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.LOGINPASSWORD_XPATH)));
        password.sendKeys(EditSchedules.PASSWORD_NAME);
   
        WebElement submitbutton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.LOGIN_BUTTON)));
        submitbutton.click();

        Thread.sleep(3000);

        String url="https://cloudeqincdemo2.service-now.com/autopark";
        driver.get(url);

        driver.manage().window().maximize();

        Thread.sleep(3000);

        //  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
        // WebElement gridrow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.GRIDONE)));
        // gridrow.click();

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

        Thread.sleep(2000);
        
        
        WebElement editScheduleButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.EDITSCHEDULEBUTTON)));

// Click the "Edit Schedule" button
        editScheduleButton.click();

        Thread.sleep(2000);

        // WebElement ScheduleiframeElement=driver.findElement(By.xpath("//iframe[@id='text_only_resize_iframe']"));
        // driver.switchTo().frame(ScheduleiframeElement);
        // System.out.println("click");

        // Thread.sleep(2000);

        WebElement startDatepickerInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.STARTDATE)));
        startDatepickerInput.sendKeys(EditSchedules.START);
        System.out.println("click1");
        Thread.sleep(1000);

        //end datepicker
         
        WebElement endDatepicker = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.ENDDATE)));
        endDatepicker.sendKeys(EditSchedules.END);
        System.out.println("click2");

        List<String> buttonXpaths = Arrays.asList(
          "//button[@id='ma20']",
          "//button[@id='ma21']",
          "//button[@id='ta20']",
          "//button[@id='ta21']",
          "//button[@id='wa20']",
          "//button[@id='wa21']",
         "//button[@id='Ta18']",
          "//button[@id='Ta21']",
          "//button[@id='fa20']",
          "//button[@id='fa21']",
          "//button[@id='sa20']",
          "//button[@id='sa21']",
          "//button[@id='Sa20']",
          "//button[@id='Sa21']"
  );

  // Loop through the button XPaths in pairs
  for (int i = 0; i < buttonXpaths.size(); i += 2) {
     

      // Use the XPath to find the first button in the pair
      WebElement button1 = driver.findElement(By.xpath(buttonXpaths.get(i)));

      // Click on the first button
      button1.click();

      // Use the XPath to find the second button in the pair
      WebElement button2 = driver.findElement(By.xpath(buttonXpaths.get(i + 1)));

      // Click on the second button
      button2.click();

      // Perform additional actions if needed
      // ...
  }

        // WebDriverWait wait = new WebDriverWait(driver, 10);
        // WebElement wednesdayRow = driver.findElement(By.xpath("//tr[td/button[text()=' WED ']]"));
        // // Find all button elements in the last two columns of the Wednesday row
        // List<WebElement> buttons = wednesdayRow.findElements(By.xpath("./td[position() = last() - 1 or position() = last()]/button"));
        
        // // Check if there are at least two buttons in the list
        // if (buttons.size() >= 2) {
        //     // Perform actions on the last two buttons
        //     buttons.get(1).click(); // Last button
        //     buttons.get(0).click(); // Second-to-last button
        // }

        // driver.switchTo().alert().dismiss();
        
    // rough things
        //  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // By dynamicElementLocator = By.xpath("//*[@class='cursor-hover']/table/tbody/tr[6]/td[21]");
        // WebElement dynamicElement = wait.until(ExpectedConditions.presenceOfElementLocated(dynamicElementLocator));
        // dynamicElement.click();

        // Thread.sleep(2000); 

      
        // WebElement gridrow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.GRIDONE)));
        // gridrow.click();
        // System.out.println("click3");

        
        // WebElement gridcolumn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.GRIDTWO)));
        // gridcolumn.click();


    //     clickButtonsForDayAndHour(driver, "ma", 20);
    //     clickButtonsForDayAndHour(driver, "ma", 21);
    //     clickButtonsForDayAndHour(driver, "ta", 20);
    //     clickButtonsForDayAndHour(driver, "ta", 21);
    //     clickButtonsForDayAndHour(driver, "wa", 20);
    //     clickButtonsForDayAndHour(driver, "wa", 21);
        
    //     clickButtonsForDayAndHour(driver, "Ta", 20);
    //     clickButtonsForDayAndHour(driver, "Ta", 21);
    //     clickButtonsForDayAndHour(driver, "fa", 20);
    //     clickButtonsForDayAndHour(driver, "fa", 21);
    //     clickButtonsForDayAndHour(driver, "sa", 20);
    //     clickButtonsForDayAndHour(driver, "sa", 21);
    //     clickButtonsForDayAndHour(driver, "Sa", 20);
    //     clickButtonsForDayAndHour(driver, "Sa", 21);

        Thread.sleep(2000);

        WebElement bussinessjustification= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.BUSINESSBUTTON)));
        bussinessjustification.sendKeys(EditSchedules.BUSINESSJUSTI);

        Thread.sleep(2000);

        WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EditSchedules.SUBMITBUTTON)));
        submit.click();
        
        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.close();

    }

    // private static void clickButtonsForDayAndHour(WebDriver driver, String dayButtonIdPrefix, int hour) {
    //     // Construct the button ID based on the day and hour
    //     String buttonId = dayButtonIdPrefix + hour;
    
    //     // Find the hourly button by ID
    //     WebElement hourlyButton = driver.findElement(By.id(buttonId));
    
    //     // Click the hourly button
    //     hourlyButton.click();
    // }
    
}


