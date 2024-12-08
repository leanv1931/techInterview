package pages;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControlsPage extends BasePage {

    private WebDriver driver;
    private WebDriverWait wait;
    
    private By removeButtonLocator = By.xpath("//button[text()='Remove']");
    private By addButtonLocator = By.xpath("//button[text()='Add']");
    private By checkboxMessageLocator = By.cssSelector("form[id='checkbox-example'] p[id='message']");
    private By checkboxLocator = By.id("checkbox");
    
    private By enableButtonLocator = By.xpath("//button[text()='Enable']");
    private By disableButtonLocator = By.xpath("//button[text()='Disable']");
    private By messageInputLocator  = By.cssSelector("form[id='input-example'] p[id='message']");
    private By inputLocator = By.cssSelector("#input-example input");
    
    public DynamicControlsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Espera explícita de 10 segundos
    }
    
    public void clickRemoveButton() {
        WebElement removeButton = driver.findElement(removeButtonLocator);
        removeButton.click();
    }

    public void clickAddButton() {
        WebElement addButton = driver.findElement(addButtonLocator);
        addButton.click();
    }

        
   
    public String getMessageText() {
        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxMessageLocator));
        return messageElement.getText();
    }
 
    
    public boolean isCheckboxDisplayed() {
        return driver.findElements(checkboxLocator).size() > 0;
    }
    
 
    public boolean isInputEnabled() {
        return driver.findElement(inputLocator).isEnabled();
    }


    public void clickEnableButton() {
        WebElement enableButton = driver.findElement(enableButtonLocator);
        enableButton.click();
    }
    
    public void clickDisableButton() {
        WebElement disableButton = driver.findElement(disableButtonLocator);
        disableButton.click();
    }
    
    public String getMessageTextForInput() {
        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(messageInputLocator));
        return messageElement.getText();
    }



}
