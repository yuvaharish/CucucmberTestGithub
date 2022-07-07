package utility;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void loadbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		dataBase();
		
		
	}
	
	public static void loadurl(String url) {
		driver.get(url);
	}

	public static void typeData(WebElement element,String data) {
		element.sendKeys(data);
	}
	
	public static void enterbtn(WebElement element) {
		element.submit();
	}
	
	public static void clickelement(WebElement element) {
		element.click();
	}
	
	public static void dataBase() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=DriverManager.getConnection("jdbc:mysql://root@localhost/kingsuperraj");
	Statement creat = conn.createStatement();
	ResultSet executeQuery = creat.executeQuery("Select * from Superhero");
	while (executeQuery.next()) {
		String string = executeQuery.getString(4);
		System.out.println(string);
	}
	
	}
	
	
}
