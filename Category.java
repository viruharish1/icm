package icm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Category {
	
	public WebDriver driver = new ChromeDriver();
	@BeforeTest()
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	}

 
	@Test(priority=1,enabled=true)
	public void Login() throws InterruptedException
	{

		driver.get("http://220.225.128.97:9100");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.switchTo().defaultContent();
		
		 driver.manage().window().maximize();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("username")));
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin");
		
		WebDriverWait wait2 = new WebDriverWait(driver, 60);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("password")));
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("admin");
		
		WebDriverWait wait3 = new WebDriverWait(driver, 60);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[3]/form/button")));
		
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[3]/form/button"));
		login.click();		
		
	}
	
	public void close()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/form/div[1]/button")));
		
		WebElement close = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[1]/button"));
		close.click();  
	}
	
	public void saveclose()
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/form/div[3]/button[3]")));
		
		WebElement saveclose = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div[3]/button[3]"));
		saveclose.click();
	}
	
	@Test(priority=2,enabled=true)
	public void company()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.switchTo().defaultContent();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 200);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[1]/li")));
		
		WebElement company = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[1]/li"));
		company.click();
		
		WebElement company2 = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[1]/li/ul/li[1]/a/span[2]"));
		company2.click();
	
		WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("disableCreateButton")));
		
		WebElement addcompany = driver.findElement(By.id("disableCreateButton"));
		addcompany.click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("field_name")));
		
		WebElement username = driver.findElement(By.id("field_name"));
		username.sendKeys("testcom");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("field_street_address")));
		
		WebElement street = driver.findElement(By.id("field_street_address"));
		street.sendKeys("6th cross street");
		
		WebDriverWait wait5 = new WebDriverWait(driver, 200);
		wait5.until(ExpectedConditions.elementToBeClickable(By.id("field_postalcode")));
		
		WebElement pcode = driver.findElement(By.id("field_postalcode"));
		pcode.sendKeys("632602");
		
		WebDriverWait wait6 = new WebDriverWait(driver, 200);
		wait6.until(ExpectedConditions.elementToBeClickable(By.id("field_registration_number")));
		
		WebElement regno = driver.findElement(By.id("field_registration_number"));
		regno.sendKeys("2222");
		
		saveclose();
		
		close();

	}
	
	@Test(priority=3,enabled=true)
	public void master()
	{
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		driver.switchTo().defaultContent();
		
		WebDriverWait wait7 = new WebDriverWait(driver, 200);
		wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[3]/li")));
		
		WebElement master = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[3]/li"));
		master.click();
	}
	
	@Test(priority=4,enabled=true)
	public void category()
	{
		driver.switchTo().defaultContent();
		
		WebElement category = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[3]/li/ul/li[2]/a"));
		category.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 200);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("disableCategoryCreateButton")));
		
		WebElement addcategory = driver.findElement(By.id("disableCategoryCreateButton"));
		addcategory.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("field_name")));
		
		WebElement name = driver.findElement(By.id("field_name"));
		name.sendKeys("qacat");
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("field_description")));
		
		WebElement description = driver.findElement(By.id("field_description"));
		description.sendKeys("Qa category description");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/form/div[3]/button[3]")));
		
		saveclose();
		
		close();
				
	}
	
	@Test(priority=5,enabled=true)
	public void location()
	{
		master();
		
		WebElement location = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[3]/li/ul/li[1]"));
		location.click();
		
		WebElement addlocation = driver.findElement(By.id("disableLocationCreateButton"));
		addlocation.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 200);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("field_name")));
		
		WebElement name = driver.findElement(By.id("field_name"));
		name.sendKeys("qa location");
		
		WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("desc")));
		
		WebElement description = driver.findElement(By.id("desc"));
		description.sendKeys("new qa location");
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("field_longitude")));
		
		WebElement longitude = driver.findElement(By.id("field_longitude"));
		longitude.sendKeys("90.33");
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("field_latitude")));
		
		WebElement latitude = driver.findElement(By.id("field_latitude"));
		latitude.sendKeys("80.33");
		
		saveclose();
		
		close();

	}
	
	@Test(priority=6,enabled=true)
	public void catlocrelation() throws InterruptedException 
	{
		master();
		
		WebElement category = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[3]/li/ul/li[2]/a"));
		category.click();
		
		WebDriverWait wait1 = new WebDriverWait(driver, 200);
		wait1.until(ExpectedConditions.elementToBeClickable(By.id("searchQuery")));
		
		WebElement catname = driver.findElement(By.id("searchQuery"));
		catname.sendKeys("qacat");
		
		WebElement search = driver.findElement(By.xpath("//*[@id='searchForm']/form/button[1]"));
		search.click();
		
		WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/table/tbody/tr/td[2]/div/div")));
		
		WebElement select = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/table/tbody/tr/td[2]/div/div"));
		select.click();
		
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disableAllCategoryElement']/div/ul/li[5]")));
		
		WebElement selectloc = driver.findElement(By.xpath("//*[@id='disableAllCategoryElement']/div/ul/li[5]"));
		selectloc.click();
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='location']/div[1]/div/div/div/button")));
		
		WebElement addloc = driver.findElement(By.xpath("//*[@id='location']/div[1]/div/div/div/button"));
		addloc.click();
		
		WebDriverWait wait5 = new WebDriverWait(driver, 200);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disableAllCategoryLocationElement']/div[2]/typeahead/div/ul[1]/li/input")));
		
		WebElement addlocation = driver.findElement(By.xpath("//*[@id='disableAllCategoryLocationElement']/div[2]/typeahead/div/ul[1]/li/input"));
		addlocation.sendKeys("qa location");
		
		WebElement addloca = driver.findElement(By.xpath("//*[@id='disableAllCategoryLocationElement']/div[2]/typeahead/div/ul[2]"));
		addloca.click();		
		
		saveclose();
		
		WebDriverWait wait6 = new WebDriverWait(driver, 200);
		wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/form/div[1]/button"))).isDisplayed();
		
		Thread.sleep(2000); 		
		
		close();
		
	}
	
	@Test(priority=7,enabled=true)
	public void template() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		
		WebDriverWait wait = new WebDriverWait(driver, 200);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[2]")));
		
		WebElement template = driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[2]"));
		template.click();
		
		WebElement addlocation = driver.findElement(By.id("disableTemplateCreateButton"));
		addlocation.click();
		
		driver.findElement(By.id("field_Name")).sendKeys("Qa Template");
		driver.findElement(By.id("field_Description")).sendKeys("Comments for qa temp");
		 
		driver.findElement(By.xpath("//*[@id='tempDetails']/div[3]/div[1]/md-autocomplete")).click(); 
        driver.findElement(By.id("input-2")).sendKeys("qacat");
        driver.findElement(By.id("ul-2")).click();		
     
        
        WebDriverWait wait2 = new WebDriverWait(driver, 200);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='field_validFrom']")));
		
		WebElement fromdate = driver.findElement(By.xpath("//*[@id='field_validFrom']"));
		fromdate.sendKeys("01-05-2017"); 	
		
		WebDriverWait wait3 = new WebDriverWait(driver, 200);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='field_validTo']")));
			
		WebElement todate = driver.findElement(By.xpath("//*[@id='field_validTo']"));
		todate.sendKeys("30-05-2017"); 	
		
		driver.findElement(By.id("field_checkinType")).click();
		
		WebDriverWait wait4 = new WebDriverWait(driver, 200);
		wait4.until(ExpectedConditions.elementToBeClickable(By.id("field_checkinType")));
		
		WebElement checkin = driver.findElement(By.id("field_checkinType"));
		checkin.sendKeys("GPS");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait5 = new WebDriverWait(driver, 200);
        wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disableAllTemplateElement']/div[2]/ul/li[2]/a")));
        
        WebElement reqtemplate = driver.findElement(By.xpath("//*[@id='disableAllTemplateElement']/div[2]/ul/li[2]/a"));
        reqtemplate.click();
        
		WebDriverWait wait6= new WebDriverWait(driver, 200);
        wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='field_request_name']")));
        
        WebElement name = driver.findElement(By.xpath("//*[@id='field_request_name']"));
        name.click();
        
        driver.findElement(By.xpath("//*[@id='field_request_name']")).sendKeys("qa request");
        
        WebDriverWait wait7 = new WebDriverWait(driver, 200);
        wait7.until(ExpectedConditions.elementToBeClickable(By.id("field_usergroup")));
        
        WebElement ugroup = driver.findElement(By.id("field_usergroup"));
        ugroup.sendKeys("Requestor");
        
        saveclose();
        
        close();
      
	}
	
	@Test(priority=8,enabled=true)
	public void user() 
	{
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/ul[2]/li/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id='disableUserCreateButton']")).click();
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='details']/div[3]/div[1]/input")).sendKeys("Qauser");
		
		driver.findElement(By.xpath("//*[@id='details']/div[4]/div[1]/input")).sendKeys("Qauser");
		driver.findElement(By.xpath("//*[@id='details']/div[5]/div[1]/input")).sendKeys("Qauser");
		driver.findElement(By.xpath("//*[@id='details']/div[6]/div[1]/input")).sendKeys("Qa@localhost");	
		
		driver.findElement(By.xpath("//*[@id='details']/div[7]/div[1]/md-autocomplete")).click(); 
		driver.findElement(By.id("input-4")).sendKeys("testcom");	
        driver.findElement(By.id("ul-4")).click();
        
        saveclose();
        close();
	}
		
	@AfterTest()
	public void quit()
	{
		System.out.println("Execution completed succesfully");
	
	}

}
