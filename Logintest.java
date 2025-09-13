package Testcases;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pageobjects.Loginpageobjects;

public class Logintest {

@Test

public void login(){
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\NagarajYadav\\Downloads\\chromedriver-win64 (7)\\chromedriver-win64\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("https://o2.openmrs.org/openmrs/login.htm");
driver.manage().window().maximize();
PageFactory.initElements(driver, Loginpageobjects.class);
Loginpageobjects.username.sendKeys("Admin");
Loginpageobjects.password.sendKeys("Admin123");
Loginpageobjects.location.click();
Loginpageobjects.loginbutton.click();
Loginpageobjects.Regitser.click();
Loginpageobjects.givenname.sendKeys("RAHUL");
Loginpageobjects.familyname.sendKeys("S");
Loginpageobjects.nextbutton.click();
Loginpageobjects.gender.click();
Loginpageobjects.nextbutton.click();
Loginpageobjects.bday.sendKeys("05");
Loginpageobjects.bmonth.click();
Loginpageobjects.bmonthjan.click();
Loginpageobjects.byear.sendKeys("1996");
Loginpageobjects.nextbutton.click();
Loginpageobjects.state.sendKeys("TL");
Loginpageobjects.nextbutton.click();
Loginpageobjects.phonenumber.sendKeys("9988776655");
Loginpageobjects.nextbutton.click();
Loginpageobjects.relationshiptype.click();
Loginpageobjects.sibling.click();
Loginpageobjects.pname.sendKeys("kkt");
Loginpageobjects.nextbutton.click();
Loginpageobjects.submitbtn.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
Loginpageobjects.startvisit.click();
Loginpageobjects.confirm.click();
Loginpageobjects.attachment.click();
driver.navigate().refresh();
//Loginpageobjects.fileupload.click();
//Loginpageobjects.fileupload.sendKeys("C:\\Users\\NagarajYadav\\Downloads\\file.pdf");
Loginpageobjects.caption.sendKeys("Nil");
Loginpageobjects.uploadbtn.click();
driver.navigate().back();
Loginpageobjects.endvisit.click();
Loginpageobjects.yesbtn.click();
Loginpageobjects.svisit.click();
Loginpageobjects.confirmsvisit.click();
Loginpageobjects.vitals.click();
Loginpageobjects.height.sendKeys("150");
Loginpageobjects.nxtbtn.click();
Loginpageobjects.wt.sendKeys("55");
Loginpageobjects.nxtbtn.click();
Loginpageobjects.saveform.click();
Loginpageobjects.savebtn.click();
Loginpageobjects.endvisit.click();
Loginpageobjects.yesbtn.click();
WebElement el =  driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[8]/span/span"));
Actions a = new Actions(driver);
a.moveToElement(el).build().perform();
Loginpageobjects.mergevisit.click();
Loginpageobjects.checkbox.click();
Loginpageobjects.cbox.click();
Loginpageobjects.mvisitbtn.click();
Loginpageobjects.Return.click();
WebElement ele =  driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[8]/span/span"));
Actions ab = new Actions(driver);
a.moveToElement(ele).build().perform();
Loginpageobjects.addpastvisit.click();
Loginpageobjects.cancelbtn.click();
Loginpageobjects.dele.click();
Loginpageobjects.delete.click();
Loginpageobjects.reason.sendKeys("Nil");
Loginpageobjects.con.click();
}
}
