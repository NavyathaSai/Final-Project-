
package test_Book;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TC_004_GiftCard extends BaseClass {

	WebDriver driver;

	TC_004_GiftCard(WebDriver driver) {
		this.driver = driver;
	}

	By giftcart = By.xpath("//*[@id='header']/section/div/ul[2]/li[3]/a");
	By bday = By.xpath("//section[@class='_14QEd']//li[3]");

	public void GiftCard() throws InterruptedException, IOException {
		Thread.sleep(2000);

		driver.findElement(giftcart).click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(2000);

		driver.findElement(bday).click();
		Thread.sleep(2000);

	}

}
