package Mahabis;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1flow {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://mahabis.com");
	
		Thread.sleep(6000);
		
		WebElement Product1 = driver.findElement(By.xpath("//*[text()='got it']"));	
	    Product1.click();//click on Notification pop up - Got it button
	    
		
	    WebElement Product = driver.findElement(By.xpath("//img[@alt='mahabis classic in larvik light grey']"));	
	    Product.click();//click on the mahabis product on homepage
	    
	    Thread.sleep(15000);//waiting for next page and Sign up pop up window
	    
	    WebElement SignupTextbox = driver.findElement(By.xpath("//input[@id='mce-EMAIL']"));	
	    SignupTextbox.sendKeys("ssss@gmail.com");//Entering email in Sign up textbox
	    
	    System.out.println("this code is work fine till here : 1");
	    
	    WebElement SignupButton = driver.findElement(By.xpath("//button[@id='newsletter_button']//span"));	
	    SignupButton.click();//Click on Signup buttton
	    
	    Thread.sleep(5000);//waiting for Continue shopping link in signup window
	    
	    WebElement ContinueShoppingButton = driver.findElement(By.xpath("//*[text()='continue shopping']"));	
	    ContinueShoppingButton.click();//click on Continue Shopping link
	    

	    WebElement ProductImage1 = driver.findElement(By.xpath("//img[@alt='Larvik Dark Grey Mahabis Classic']"));	
	    ProductImage1.click(); //Click on the Product image in Product Detail page
	    
	    WebElement ProductColorCircle1 = driver.findElement(By.xpath("//label[@for='sole_sb']"));	
	    ProductColorCircle1.click(); //Click on the product color in Product Detail page
	    
	    Thread.sleep(1000);
	    
	    WebElement GenderSelection1 = driver.findElement(By.xpath("//ul[@id='genderSelection']//li[2]"));	
	    GenderSelection1.click(); // Selecting the gender
	    

	    WebElement GenderFootSize = driver.findElement(By.xpath("//ul[@data-size-gender='men']//li[1]"));	
	    GenderFootSize.click(); //Selecting the foot size
	   
	    WebElement AddToCartButton = driver.findElement(By.xpath("//input[@value='add to cart']"));	
	    AddToCartButton.click();  //Click on the Add to Cart button on product detail page
	    
	    Thread.sleep(5000);//waiting for 
	    
	    WebElement QuantityIncrease = driver.findElement(By.xpath("//div[@class='cart-quantity-wrapper']//a[2]"));	
	    QuantityIncrease.click();//Click on the '+' increment button on
	    
	    WebElement CheckoutButton = driver.findElement(By.xpath("//div[@class='js-cart-subtotal-actions']//a[1]"));	
	    CheckoutButton.click();//click on the Checkout button on
	    
	         
	    
	}
	
	}


