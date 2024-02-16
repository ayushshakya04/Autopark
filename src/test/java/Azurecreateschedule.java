

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

// import utils.XPath;
import utils.AzureXpath;


public class Azurecreateschedule 
{
    WebDriver driver;
   
    @BeforeTest
    public void setup() throws InterruptedException
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://cloudeqincdemo2.service-now.com/side_door.do");
        // assertTrue( true );
        WebElement iframeElement=driver.findElement(By.id(AzureXpath.IFRAME_ELEMENT));
        driver.switchTo().frame(iframeElement);
        // Thread.sleep(5000L);
        
        //Login to the application

        driver.findElement(By.xpath(AzureXpath.LOGIN_XPATH)).sendKeys(AzureXpath.LOGIN_NAME);
        
        driver.findElement(By.xpath(AzureXpath.LOGINPASSWORD_XPATH)).sendKeys(AzureXpath.PASSWORD_NAME);
   
        driver.findElement(By.xpath(AzureXpath.LOGIN_BUTTON)).click();

        Thread.sleep(2000);

        driver.get("https://cloudeqincdemo2.service-now.com/rv1");

        driver.manage().window().maximize();

        Thread.sleep(3000);
        
        WebElement newScheduleButton = driver.findElement(By.xpath(AzureXpath.SCHEDULE_BUTTON_FIELD));
        newScheduleButton.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(AzureXpath.SCHEDULE_NAME_FIELD)).sendKeys(AzureXpath.SCHEDULE_NAME);



        //select the person name in request for section
        Thread.sleep(3000);
        
        //slecting the request for
        WebElement dropdown = driver.findElement(By.xpath(AzureXpath.REQUEST_FOR_DROPDOWN));
        dropdown.click();
        Thread.sleep(3000);


        WebElement select = driver.findElement(By.xpath(AzureXpath.SELECT_OPTION));
        select.click();
      



        //select the radion of azure and aws 
        Thread.sleep(2000);
        WebElement radio=driver.findElement(By.xpath(AzureXpath.AWS_RADIO));
        radio.click();


        //select application from the selector
      
        Thread.sleep(3000);
        WebElement application=driver.findElement(By.xpath(AzureXpath.APPLICATION));
        application.click();
       
       
        Thread.sleep(5000);   
        WebElement bankingapp = driver.findElement(By.xpath(AzureXpath.APPLICATION_NAME)); 
        bankingapp.click();

        //select server name
        Thread.sleep(5000);   
        WebElement server = driver.findElement(By.xpath(AzureXpath.SERVER)); 
        server.click();
        Thread.sleep(5000);   
        WebElement servername = driver.findElement(By.xpath(AzureXpath.SERVER_NAME)); 
        servername.click();
        System.out.println("clicked");


        //select timezone
        Thread.sleep(3000);
        WebElement timezoneDropdown = driver.findElement(By.xpath(AzureXpath.TIME_ZONE));
        timezoneDropdown.click();
        WebElement time=driver.findElement(By.xpath(AzureXpath.TIME_ZONE_NAME));
        time.click();  

        //start datepicker    

        Thread.sleep(3000); 
        WebElement startDatepickerInput = driver.findElement(By.xpath(AzureXpath.START_BUTTON));
        startDatepickerInput.sendKeys(AzureXpath.START_DATE);

        //end datepicker
        Thread.sleep(3000); 
        WebElement endDatepicker = driver.findElement(By.xpath(AzureXpath.END_BUTTON));
        endDatepicker.sendKeys(AzureXpath.END_DATE);

        //click on grid
        Thread.sleep(3000); 
        WebElement grid = driver.findElement(By.xpath(AzureXpath.SELECT_GRID));
        grid.click();

        WebElement grids = driver.findElement(By.xpath(AzureXpath.SELECT_GRIDS));
        grids.click();

        
        ///Bussiness justification text submit
        driver.findElement(By.xpath(AzureXpath.BUSSINESS_BUTTON)).sendKeys(AzureXpath.BUSSINESS_JUSTI);

        WebElement submitButton = driver.findElement(By.xpath(AzureXpath.SUBMIT_BUTTON));

        submitButton.click();

        Thread.sleep(5000);

        driver.navigate().refresh();

        // WebElement iframElements = driver.findElement(By.id("gsft_main"));
        // driver.switchTo().frame(iframElements);
        // System.out.println("clicked3");

        // Thread.sleep(5000);
        // WebElement back = driver.findElement(By.xpath("//a[@href='https://cloudeqincdemo2.service-now.com/rv1' and @class='pointer-hover']"));
        // back.click();
        // WebElement back = driver.findElement(By.xpath("//a[@ng-click='handleHomeLinkClick()' and @class='pointer-hover']"));
        // WebDriver iframDriver= driver.findElement(By.id("text_only_resize_iframe"));
        driver.close();

    }   
    


   
        
    }
