package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class Facebook_login extends Base_Page
{
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbtn;
	
	public Facebook_login(WebDriver driver)
	{
		super(driver);
	}
	public void setEmail(String mail)
	{
		email.sendKeys(mail);
	}
	public void setPass(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void passBtn()
	{
		loginbtn.click();
	}

}

