package com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {
	public static WebDriver driver = Test_Runner.driver;
	@Given("^user Lanuch The Adactin Application$")
	public void user_Lanuch_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		Username.sendKeys("Dhilipan95");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("8C7OI4");
	}

	@Then("^user Click The Login Button And It Navigate to Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigate_to_Search_Hotel_Page() throws Throwable {
		WebElement Login = driver.findElement(By.xpath("//input[@id='login']"));
		Login.click();
	}

	@When("^user Select The Location In That Field$")
	public void user_Select_The_Location_In_That_Field() throws Throwable {
		WebElement Location = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(Location);
		s.selectByValue("Melbourne");	
	}

	@When("^user Select The Hotels In That Field$")
	public void user_Select_The_Hotels_In_That_Field() throws Throwable {
		WebElement Hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s1 = new Select(Hotel);
		s1.selectByValue("Hotel Hervey");
		}

	@When("^user Select The RoomType In That Field$")
	public void user_Select_The_RoomType_In_That_Field() throws Throwable {
	
		WebElement RoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2 = new Select(RoomType);
		s2.selectByIndex(3);
	
	}

	@When("^user Select The Number Of Rooms In That Field$")
	public void user_Select_The_Number_Of_Rooms_In_That_Field() throws Throwable {
	
		WebElement Number_Room = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3 = new Select(Number_Room);
		s3.selectByVisibleText("5 - Five");
	
	}

	@When("^user Enter The Check In Date In CheckInDate Field$")
	public void user_Enter_The_Check_In_Date_In_CheckInDate_Field() throws Throwable {
		WebElement FirstDate = driver.findElement(By.id("datepick_in"));
		FirstDate.clear();
		FirstDate.sendKeys("03/09/2023");
	
	}

	@When("^user Enter The Check Out Date In ChecKOutDate Field$")
	public void user_Enter_The_Check_Out_Date_In_ChecKOutDate_Field() throws Throwable {
	
		WebElement Lastdate = driver.findElement(By.id("datepick_out"));
		Lastdate.clear();
		Lastdate.sendKeys("06/09/2023");
	
	}

	@When("^user Select The AdultsPerRoom In That Field$")
	public void user_Select_The_AdultsPerRoom_In_That_Field() throws Throwable {
	
		WebElement Adults= driver.findElement(By.id("adult_room"));
		Select s4= new Select(Adults);
		s4.selectByValue("3");
	
	}

	@When("^user Select The ChildrenPerRoom In That Field$")
	public void user_Select_The_ChildrenPerRoom_In_That_Field() throws Throwable {
	
		WebElement Child = driver.findElement(By.id("child_room"));
		Select s5=new Select(Child);
		s5.selectByIndex(1);
	
	}

	@Then("^user Click The Login Serach Button And It Navigate To Select Hotel Page$")
	public void user_Click_The_Login_Serach_Button_And_It_Navigate_To_Select_Hotel_Page() throws Throwable {
	
		driver.findElement(By.id("Submit")).click();;
	}

	@When("^user Click Select Button$")
	public void user_Click_Select_Button() throws Throwable {
	
		driver.findElement(By.id("radiobutton_0")).click();
		
	}

	@Then("^user Click Continue Button And It Navigate To Book A Hotel Page$")
	public void user_Click_Continue_Button_And_It_Navigate_To_Book_A_Hotel_Page() throws Throwable {
		driver.findElement(By.id("continue")).click();
		
	}

	@When("^user Enter The First Name In That Field$")
	public void user_Enter_The_First_Name_In_That_Field() throws Throwable {
		WebElement FirstName = driver.findElement(By.id("first_name"));
		FirstName.sendKeys("Dhilip");
		
	}

	@When("^user Enter The Last Name In That Field$")
	public void user_Enter_The_Last_Name_In_That_Field() throws Throwable {
	
		WebElement LastName = driver.findElement(By.id("last_name"));
		LastName.sendKeys("Yuvi");
		
	}

	@When("^user Enter The Billing Address In That Field$")
	public void user_Enter_The_Billing_Address_In_That_Field() throws Throwable {
		WebElement Address = driver.findElement(By.id("address"));
			Address.sendKeys("no 2 , dfja,scs");
		
	}

	@When("^user Enter The Credit Card Number In ThaT Field$")
	public void user_Enter_The_Credit_Card_Number_In_ThaT_Field() throws Throwable {
		WebElement CreditCard = driver.findElement(By.id("cc_num"));
		CreditCard.sendKeys("3214202221345789");
		
	}

	@When("^user Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
		WebElement cc_type= driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cc_type);
		s6.selectByValue("VISA");
	}

	@When("^user Select The Month In That Expiry Date Field$")
	public void user_Select_The_Month_In_That_Expiry_Date_Field() throws Throwable {
	
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(month);
		s7.selectByValue("5");
	}

	@When("^user Select The Year In That Expiry Date Field$")
	public void user_Select_The_Year_In_That_Expiry_Date_Field() throws Throwable {
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s8 = new Select(year);
		s8.selectByValue("2015");
	}

	@When("^user Enter The CVV Number In The Field$")
	public void user_Enter_The_CVV_Number_In_The_Field() throws Throwable {
		WebElement CVV_Num = driver.findElement(By.id("cc_cvv"));
		CVV_Num.sendKeys("654");
		
	}

	@Then("^user Click The BookNow Button And It Navigate To Booking Confirmation$")
	public void user_Click_The_BookNow_Button_And_It_Navigate_To_Booking_Confirmation() throws Throwable {
		WebElement BookNow = driver.findElement(By.id("book_now"));
		BookNow.click();
		
	}

	@Then("^user Click Logout Button$")
	public void user_Click_Logout_Button() throws Throwable {
	   
	}

	
}
