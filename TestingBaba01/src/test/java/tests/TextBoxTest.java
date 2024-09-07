package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import pages.TextBox;

public class TextBoxTest extends Baselibrary
{
TextBox ob;

@BeforeTest
public void launchURL() {
      launchBrowser();
	ob = new TextBox();
}

@Test(priority = 1)
public void Practice() {
	ob.clickonPractice();
}

@Test(priority = 2)
public void Elements() {
	ob.clickonElements();
}

@Test(priority = 3)
public void Textbox() {
	ob.clickonTextBox();
}
}
