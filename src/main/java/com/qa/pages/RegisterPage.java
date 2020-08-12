package com.qa.pages;







import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterPage extends TestBase {

	public RegisterPage(AppiumDriver<MobileElement> driver){
	this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
//	public RegisterPage(AppiumDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
//		}
//	  public int implicitWaitTime;
//	  public RegisterPage(AppiumDriver<MobileElement> driver) {
//	        // TODO Auto-generated constructor stub
//	        this.driver = (AppiumDriver<MobileElement>) driver;
//	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//
//	    }
	@AndroidFindBy(xpath="//android.widget.EditText[@text='First Name'and @index='0']")
private AndroidElement firstname;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Invalid first name']")
private AndroidElement firstnameerror;
@AndroidFindBy(xpath="//android.widget.EditText[@text='Last Name'and @index='0']")
private AndroidElement lastname;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Invalid last name']")
private AndroidElement lastnameerror;
@AndroidFindBy(xpath="//android.widget.EditText[@text='Email'and @index='0']")
private AndroidElement email;
@AndroidFindBy(xpath="//android.widget.TextViesw[@text='Invalid email']")
private AndroidElement Wrongemail;
@AndroidFindBy(xpath="//android.widget.EditText[@text='Mobile Number'and @index='0']")
private AndroidElement mobile;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Invalid phone number']")
private AndroidElement phoneerror;
@AndroidFindBy(xpath="//android.widget.EditText[@text='Password' and @index='0']")
private AndroidElement password;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Password is Required']")
private AndroidElement passworderror;
@AndroidFindBy(xpath="//android.widget.EditText[@text='Confirm password'and @index='0']")
private AndroidElement confirmpassword;
@AndroidFindBy(xpath="//android.widget.TextView[@index='10']")
private AndroidElement confirmpassworderror;
@AndroidFindBy(xpath="//android.widget.TextView[@text='Register'and @index='0']")
private AndroidElement registerclick;


public void register() 
{
	  registerclick.click();
}


public void first(String first)
{
	firstname.sendKeys(first);
}

public void lastname(String last)
{
	lastname.sendKeys(last);
}

public void mail(String mail)
{
	email.sendKeys(mail);
}

public void mob(String mobno)
{
	mobile.sendKeys(mobno);
}



public void password(String pass)
{
	password.sendKeys(pass);
}

public void confirmpassword(String cnfrmpwd) throws InterruptedException
{
	confirmpassword.sendKeys(cnfrmpwd);
	Thread.sleep(2000);
	}
}



	
	

	



	
	

