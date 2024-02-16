package utils;

public class AWSXpaths {
    // XPaths for login page
    public static final String IFRAME_ELEMENT = "gsft_main";
    public static final String LOGIN_XPATH = "//input[@type='text' and @name='user_name']";
    public static final String LOGIN_NAME = "Auto_Park";


    public static final String LOGINPASSWORD_XPATH = "//input[@type='password' and @name='user_password']";
    public static final String PASSWORD_NAME = "HEbf0zG47ln+R2GS3Na}gPj&JnMOx5rV";
    
    public static final String LOGIN_BUTTON = "//button[@name='not_important' and @id='sysverb_login']";

    // XPaths for schedule creation page
    public static final String SCHEDULE_BUTTON_FIELD = "//span[text()='New Schedule']";
    public static final String SCHEDULE_NAME_FIELD = "//input[@id='scheduleName']";
    public static final String SCHEDULE_NAME = "Testing";
    public static final String REQUEST_FOR_DROPDOWN = "//div[@id='s2id_autogen5']";
    public static final String SELECT_OPTION = "//div[@id='select2-result-label-11']";
    public static final String AWS_RADIO = "//input[@id='aws']";
    public static final String APPLICATION = "//div[@id='s2id_autogen7']";
    public static final String APPLICATION_NAME = "//body/div[@id='select2-drop']/ul[@id='select2-results-8']/li[1]";
    public static final String SERVER = "//input[@role='combobox' and @id='s2id_autogen10']";
    public static final String SERVER_NAME ="//body/div[@id='select2-drop']/ul[@id='s2id_autogen10_results']/li[1]";
    public static final String TIME_ZONE ="//select[@id='timeZone']";
    public static final String TIME_ZONE_NAME ="//option[contains(text(),'IST India Standard Time(UTC+5:30)')]";
    public static final String START_BUTTON ="//input[@id='strtdte']";
    public static final String START_DATE ="12192023";
    public static final String END_BUTTON="//input[@id='stpdte']";
    public static final String END_DATE ="12192023";
    public static final String SELECT_GRID="//table[@id='tablegrid']/tbody/tr[2]/td[24]";
    public static final String SELECT_GRIDS="//table[@id='tablegrid']/tbody/tr[2]/td[25]";
    public static final String BUSSINESS_BUTTON="//textarea[@id='bussjusti']";
    public static final String BUSSINESS_JUSTI="for testing purpose";
    public static final String SUBMIT_BUTTON="//div[@class='fields-container']/div/button[1]";
    // Add more XPaths as needed
}

// public class Xpath {
//     // XPaths for login page
//     public static final String IFRAME_ELEMENT = "gsft_main";
//     public static final String LOGIN_XPATH = "//input[@type='text' and @name='user_name']";
//     public static final String LOGINPASSWORD_XPATH = "//input[@type='password' and @name='user_password']";
//     public static final String LOGIN_BUTTON = "//button[@name='not_important' and @id='sysverb_login']";

//     // XPaths for schedule creation page
//     public static final String SCHEDULE_BUTTON_FIELD = "//a[@value='clear input' and @ng-click='definedWid()']";
//     public static final String SCHEDULE_NAME_FIELD = "//input[@id='scheduleName']";
//     public static final String REQUEST_FOR_DROPDOWN = "//div[@id='s2id_autogen5']";
//     public static final String SELECT_OPTION = "//div[@id='select2-result-label-11']";
//     public static final String AWS_RADIO = "//input[@id='azure']";
//     public static final String APPLICATION = "//div[@id='s2id_autogen7']";
//     public static final String APPLICATION_NAME = "//body/div[@id='select2-drop']/ul[@id='select2-results-8']/li[2]";
//     public static final String SERVER = "//input[@role='combobox' and @id='s2id_autogen10']";
//     public static final String SERVER_NAME ="//body/div[@id='select2-drop']/ul[@id='s2id_autogen10_results']/li[1]";
//     public static final String TIME_ZONE ="//select[@id='timeZone']";
//     public static final String TIME_ZONE_NAME ="//option[contains(text(),'IST India Standard Time(UTC+5:30)')]";
//     public static final String START_BUTTON ="//input[@id='strtdte']";
//     public static final String END_BUTTON="//input[@id='stpdte']";
//     public static final String SELECT_GRID="//table[@id='tablegrid']/tbody/tr[8]/td[24]";
//     public static final String SELECT_GRIDS="//table[@id='tablegrid']/tbody/tr[8]/td[25]";
//     public static final String BUSSINESS_BUTTON="//textarea[@id='bussjusti']";
//     public static final String SUBMIT_BUTTON="//button[@type='button' and @id='btn' and @ng-click='update();']";
//     // Add more XPaths as needed
// }