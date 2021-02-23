package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import POM_class.Facebook_login;
import generic.Base_Test;
import generic.Generic_read_excel;
import generic.Webdriver_generic;

public class ValidLogin extends Base_Test
{
	@Test
	public void login()
	{
		String uname = Generic_read_excel.getData("Sheet1",0,0);
		String pwd = Generic_read_excel.getData("Sheet1",0,1);
		Facebook_login fb=new Facebook_login(driver);
		fb.setEmail(uname);
		fb.setPass(pwd);
		fb.passBtn();
		Assert.fail();
	}
}
