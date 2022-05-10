package net.seamlessly.pages;

import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.ConfigurationReader;
import net.seamlessly.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(css ="input#user" )
    public WebElement userLoginBox;

    @FindBy(css ="input#password" )
    public WebElement userPasswordBox;

    @FindBy(css ="input#submit-form" )
    public WebElement loginButton;

    @FindBy(css ="a#lost-password")
    public WebElement forgotLabel;

    @FindBy(xpath ="//p[@class='warning wrongPasswordMsg']")
    public WebElement errorMessage;

    @FindBy(xpath ="//input[@id='reset-password-submit']")
    public WebElement resetPasswordButton;

    @FindBy(xpath ="//div[@class='logo']")
    public WebElement seamlesslyLogo;

    @FindBy(xpath ="//a[@class='toggle-password']")
    public WebElement toogleButton;

  public static   String message;





    public LoginPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    public void login(){

      //  userLoginBox.sendKeys(ConfigurationReader.get("username"));
        userLoginBox.sendKeys(ConfigurationReader.get("username"));
        userPasswordBox.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();


    }


    public void login(String submitType){

        if (submitType.equals("submitButton")){
          userLoginBox.sendKeys(ConfigurationReader.get("username"));
          userPasswordBox.sendKeys(ConfigurationReader.get("password"));
          loginButton.click();
      }
        if (submitType.equals("enterKey")){
            userLoginBox.sendKeys(ConfigurationReader.get("username"));
            userPasswordBox.sendKeys(ConfigurationReader.get("password") + Keys.ENTER);

        }



    }

  public void login(String userName,String password,String submitType){
 if (submitType.equals("submitButton")){
     userLoginBox.sendKeys(userName);
     userPasswordBox.sendKeys(password);
     loginButton.click();

 }
 if (submitType.equals("enterKey")){
     userLoginBox.sendKeys(userName);
     userPasswordBox.sendKeys(password + Keys.ENTER);

 }

      if (userLoginBox.getText().isEmpty() && userPasswordBox.getText().isEmpty()){
        String  message1=userPasswordBox.getAttribute("validationMessage");
          String  message2=userLoginBox.getAttribute("validationMessage");
     if (message1.isEmpty()){
         message=message2;
     }else{
         message=message1;
     }

      }

  }

}
