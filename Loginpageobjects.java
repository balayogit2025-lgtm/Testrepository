package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpageobjects {

@FindBy (id="username")
public static WebElement username;

@FindBy (id="password")
public static WebElement password;

@FindBy (id="Inpatient Ward")
public static WebElement location;

@FindBy (id="loginButton")
public static WebElement loginbutton;

@FindBy (xpath = "//*[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]")
public static WebElement Regitser;

@FindBy (name="givenName")
public static WebElement givenname;

@FindBy (name="familyName")
public static WebElement familyname;

@FindBy (id="next-button")
public static WebElement nextbutton;

@FindBy (xpath = "//*[@id=\"gender-field\"]/option[1]")
public static WebElement gender;

@FindBy (id="birthdateDay-field")
public static WebElement bday;

@FindBy (id="birthdateMonth-field")
public static WebElement bmonth;

@FindBy (xpath = "//*[@id=\"birthdateMonth-field\"]/option[2]")
public static WebElement bmonthjan;

@FindBy (id="birthdateYear-field")
public static WebElement byear;

@FindBy (id="stateProvince")
public static WebElement state;

@FindBy (name="phoneNumber")
public static WebElement phonenumber;

@FindBy (id="relationship_type")
public static WebElement relationshiptype;

@FindBy (xpath = "//*[@id=\"relationship_type\"]/option[3]")
public static WebElement sibling;

@FindBy (xpath = "//*[@id=\"relationship\"]/p[2]/input[1]")
public static WebElement pname;


@FindBy (xpath = "/html/body/div/div[3]/form/div[1]/div[5]/p[1]/input")
public static WebElement submitbtn;

@FindBy (xpath = "/html/body/div[1]/div[3]/div[9]/div[2]/div/ul/li[1]/a/div/div[2]")
public static WebElement startvisit;

@FindBy (id="start-visit-with-visittype-confirm")
public static WebElement confirm;

@FindBy (xpath = "//*[@id=\"attachments.attachments.visitActions.default\"]/i")
public static WebElement attachment;

@FindBy (xpath = "/html/body/div/div[3]/div[3]/div[1]/att-file-upload/div[3]/div/div[1]/form/div[2]")
public static WebElement fileupload;

@FindBy (xpath = "/html/body/div/div[3]/div[3]/div[1]/att-file-upload/div[3]/div/div[2]/textarea")
public static WebElement caption;

@FindBy (xpath = "/html/body/div/div[3]/div[3]/div[1]/att-file-upload/div[3]/div/div[2]/span/button[1]")
public static WebElement uploadbtn;

@FindBy (xpath = "/html/body/div[1]/div[3]/div[9]/div/div[1]/div[3]/div[1]/div[2]/a[1]")
public static WebElement endvisit;

@FindBy (xpath = "//*[@id=\"end-visit-dialog\"]/div[2]/button[1]")
public static WebElement yesbtn;

@FindBy (xpath = "//*[@id=\"noVisitShowVisitCreationDialog\"]")
public static WebElement svisit;

@FindBy (xpath = "//*[@id=\"start-visit-with-visittype-confirm\"]")
public static WebElement confirmsvisit;

@FindBy (xpath = "//*[@id=\"referenceapplication.realTime.vitals\"]")
public static WebElement vitals;

@FindBy (xpath = "//*[@id=\"w8\"]")
public static WebElement height;

@FindBy (id="next-button")
public static WebElement nxtbtn;

@FindBy (xpath = "//*[@id=\"w10\"]")
public static WebElement wt;

@FindBy (xpath = "/html/body/div[1]/div[3]/div[3]/a[1]")
public static WebElement saveform;

@FindBy (xpath = "/html/body/div[1]/div[3]/div[4]/form/div[2]/div/p[1]/button")
public static WebElement savebtn;

@FindBy (xpath = "/html/body/div[1]/div[3]/div[8]/span/span")
public static WebElement act;

@FindBy (xpath = "/html/body/div[1]/div[3]/div[8]/ul/li[3]/a/i")
public static WebElement mergevisit;

@FindBy (xpath = "/html/body/div/div[3]/form/table/tbody/tr[1]/td[1]/input")
public static WebElement checkbox;

@FindBy (xpath = "/html/body/div/div[3]/form/table/tbody/tr[2]/td[1]/input")
public static WebElement cbox;

@FindBy (xpath = "/html/body/div/div[3]/form/div/input[2]")
public static WebElement mvisitbtn;

@FindBy (xpath = "/html/body/div/div[3]/form/div/input[1]")
public static WebElement Return;

@FindBy (xpath = "/html/body/div[1]/div[3]/div[8]/ul/li[2]/a")
public static WebElement addpastvisit;

@FindBy (xpath = "/html/body/div[7]/div/div/div[2]/button[1]")
public static WebElement cancelbtn;

@FindBy (xpath = "/html/body/ul/li[2]/a")
public static WebElement dele;

@FindBy (xpath = "/html/body/div[1]/div[3]/div[9]/div[2]/div/ul/li[8]/a/div/div[2]")
public static WebElement delete;

@FindBy (xpath = "/html/body/div[5]/div/div/div[2]/input")
public static WebElement reason;

@FindBy (xpath = "/html/body/div[5]/div/div/div[2]/button[1]")
public static WebElement con;

}
