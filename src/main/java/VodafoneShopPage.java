import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VodafoneShopPage {
    private WebDriver driver;
    private WebDriverWait wait;
    public VodafoneShopPage(WebDriver driver) {
        this.driver = driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://eshop.vodafone.com.eg/eshop/");

    }
    By shopByBrand = By.linkText("Shop By Brand");
    By iphoneBrand = By.linkText("iPhone");
    By addToCart = By.xpath("//button[contains(text(),'Add to Cart')]");
    By proceedToCheckout = By.xpath("//a[contains(text(),'Proceed to Checkout')]");
    By deliveryOption = By.xpath("//select[@id='delivery-option']");
    By addressDetails = By.xpath("//textarea[@id='address-details']");
    By continueBtn = By.xpath("//button[contains(text(),'Continue')]");
    By fullNameError = By.xpath("//div[contains(text(),'Please enter your full name')]");
    public void selectLanguage(String language) {
        // code to select language
    }

    public void selectIphone() {
        // code to select iPhone from Shop By Brand section
    }

    public void selectMobile() {
        // code to select a mobile from the list
    }

    public void addToCart() {
        // code to add the selected mobile to the cart
    }

    public void proceedToCheckout() {
        // code to proceed to checkout
    }

    public void selectDeliveryOption(String deliveryOption) {
        // code to select delivery option
    }

    public void selectDeliverToMyAddress() {
        // code to select "Deliver to My Address"
    }

}
