package com.timetracking.actitime.automation1.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[Text()='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerButton;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerNameTextField;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptionTextField;
	
	@FindBy(xpath=""

}
