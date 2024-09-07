package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;

public class TextBox extends Baselibrary

{
	public TextBox ()
	{ PageFactory.initElements(driver, this);}	
	
@FindBy(xpath = "//a[text()='Practice']")
private WebElement practice;
public void clickonPractice() 
{
	practice.click();
}

@FindBy(xpath = "//button[@data-target='#elements']")
private WebElement Elements;
public void clickonElements() 
{
	Elements.click();
}

@FindBy(xpath = "//a[text()='text box']")
private WebElement textbox;
public void clickonTextBox() 
{
	textbox.click();}
}












