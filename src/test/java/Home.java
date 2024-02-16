// WITHOUT SCHEDULE


import java.time.DayOfWeek;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import utils.AWSXpaths;


public class Home 
{
    WebDriver driver;
   
    @BeforeTest
    public void setup() throws InterruptedException
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://cloudeqincdemo2.service-now.com/side_door.do");
        // assertTrue( true );
       
        final WebElement iframeElement=driver.findElement(By.id(AWSXpaths.IFRAME_ELEMENT));
       
        // WebElement iframeElement=driver.findElement(By.id(Utilities.iframeElementXpath));
        
       driver.switchTo().frame(iframeElement);
        // Thread.sleep(5000L);
        
        //Login to the application

        driver.findElement(By.xpath(AWSXpaths.LOGIN_XPATH)).sendKeys(AWSXpaths.LOGIN_NAME);
        
        driver.findElement(By.xpath(AWSXpaths.LOGINPASSWORD_XPATH)).sendKeys(AWSXpaths.PASSWORD_NAME);
   
        driver.findElement(By.xpath(AWSXpaths.LOGIN_BUTTON)).click();

        Thread.sleep(2000);

        driver.get("https://cloudeqincdemo2.service-now.com/rv1");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement home_button=driver.findElement(By.xpath("//span[text()='Home']"));
        home_button.click();
        
        Thread.sleep(2000);


        WebElement applications=driver.findElement(By.xpath("//div[@id='s2id_application']"));
        applications.click();

        Thread.sleep(3000);

        WebElement Application_Name=driver.findElement(By.xpath("//body/div[@id='select2-drop']/ul[@id='select2-results-2']/li[1]"));
        Application_Name.click();
        
        Thread.sleep(3000);

        WebElement Drop_down_click=driver.findElement(By.xpath("//table[@id='schedule-table']/tbody/tr[1]/td[1]/input"));
        Drop_down_click.click();

        Thread.sleep(3000);

        WebElement create_schedule_button=driver.findElement(By.xpath("//*[@id='x0622b12b476b611066cdd162736d4394']/div/button[1]"));
        create_schedule_button.click();
        //button[text()=' Create Schedule' and @class='create-schedule-button pointer-hover']
        Thread.sleep(3000);
        WebElement Schedule_box=driver.findElement(By.xpath(AWSXpaths.SCHEDULE_NAME_FIELD));
        Schedule_box.sendKeys(AWSXpaths.SCHEDULE_NAME);

        // driver.findElement(By.xpath(AWSXpaths.SCHEDULE_NAME_FIELD)).sendKeys(AWSXpaths.SCHEDULE_NAME);



        //select the person name in request for section
        Thread.sleep(3000);
        
        //slecting the request for
        WebElement dropdown = driver.findElement(By.xpath(AWSXpaths.REQUEST_FOR_DROPDOWN));
        dropdown.click();
        Thread.sleep(3000);


        WebElement select = driver.findElement(By.xpath("//div[@id='select2-drop']/ul[@id='select2-results-6']/li[1]"));
        select.click();
      



        //select the radion of azure and aws 
        // Thread.sleep(2000);
        // WebElement radio=driver.findElement(By.xpath(AWSXpaths.AWS_RADIO));
        // radio.click();


        //select application from the selector
      
        // Thread.sleep(3000);
        // WebElement application=driver.findElement(By.xpath(AWSXpaths.APPLICATION));
        // application.click();
       
       
        // Thread.sleep(5000);   
        // WebElement bankingapp = driver.findElement(By.xpath(AWSXpaths.APPLICATION_NAME)); 
        // bankingapp.click();

        //select server name
        // Thread.sleep(5000);   
        // WebElement server = driver.findElement(By.xpath(AWSXpaths.SERVER)); 
        // server.click();
        // Thread.sleep(5000);   
        // WebElement servername = driver.findElement(By.xpath(AWSXpaths.SERVER_NAME)); 
        // servername.click();
        // System.out.println("clicked");


        //select timezone
        Thread.sleep(3000);
        WebElement timezoneDropdown = driver.findElement(By.xpath(AWSXpaths.TIME_ZONE));
        timezoneDropdown.click();
        WebElement time=driver.findElement(By.xpath(AWSXpaths.TIME_ZONE_NAME));
        time.click();  

        //start datepicker    

        Thread.sleep(3000); 
        WebElement startDatepickerInput = driver.findElement(By.xpath(AWSXpaths.START_BUTTON));
        startDatepickerInput.sendKeys(AWSXpaths.START_DATE);

        //end datepicker
        Thread.sleep(3000); 
        WebElement endDatepicker = driver.findElement(By.xpath(AWSXpaths.END_BUTTON));
        endDatepicker.sendKeys(AWSXpaths.END_DATE);

        //click on grid
        Thread.sleep(3000); 



         LocalDate currentDate = LocalDate.now();

        // Get the current day of the week
        DayOfWeek currentDayOfWeek = currentDate.getDayOfWeek();
        int currentDayIndex = currentDayOfWeek.getValue();

    // Iterate through each XPath and perform the same action
    for (int i = 1; i <= 7; i++) {
        // Construct XPath dynamically based on the loop index
        String xpath = String.format("//table[@id='tablegrid']/tbody/tr[%d]/td[%d]", i + 1, 24 - i);
        String xpaths = String.format("//table[@id='tablegrid']/tbody/tr[%d]/td[%d]", i + 1, 25 - i);


        // Check if it's Monday (DayOfWeek.MONDAY is 1 in Java)
        if (currentDayIndex == i) {
            WebElement element = driver.findElement(By.xpath(xpath));
            element.click();
            WebElement element2=driver.findElement(By.xpath(xpaths));
            element2.click();
            // Add any additional logic you want to perform after clicking
        
            // Add any additional logic you want to perform after clicking
        }
    }

        // WebElement grid = driver.findElement(By.xpath(AWSXpaths.SELECT_GRID));
        // grid.click();

        // WebElement grids = driver.findElement(By.xpath(AWSXpaths.SELECT_GRIDS));
        // grids.click();

       Thread.sleep(3000); 
        ///Bussiness justification text submit
        driver.findElement(By.xpath(AWSXpaths.BUSSINESS_BUTTON)).sendKeys(AWSXpaths.BUSSINESS_JUSTI);

        WebElement submitButton = driver.findElement(By.xpath(AWSXpaths.SUBMIT_BUTTON));

        submitButton.click();

        driver.navigate().refresh();

        driver.close();



    }
}