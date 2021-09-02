package net.seamlessly.pages;

import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class FilesPage extends BasePage {
   public FilesPage(){
       PageFactory.initElements(Driver.get(), this);
   }

   @FindBy(css = ".button.new")
    protected WebElement addIcon;

   @FindBy(css = "#file_upload_start")
    protected WebElement uploadFile;

   @FindBy(xpath = "//span[@class='innernametext']")
    protected List<WebElement> files;

   @FindBy(css = "#uploadprogressbar")
   protected WebElement progressbar;

   @FindBy(css = "#checkbox-allnewfiles")
   protected WebElement NewFile;

   @FindBy(css = "#checkbox-allexistingfiles")
   protected WebElement existingFile;

   @FindBy(css = "#ioc-dialog-fileexists-content")
   protected WebElement fileExists;

   @FindBy(css = ".continue")
   protected WebElement continueButton;

    @FindBy(css = ".cancel primary")
    protected WebElement cancelButton;


   public void uploadFile(String fileName){
       addIcon.click();
       uploadFile.sendKeys((System.getProperty("user.dir") + "\\src\\test\\resources\\uploadedFiles\\"+fileName));
       waitUntilProgressbarDisappear();
//       if (fileExists.isDisplayed()){
//           cancelButton.click();
//       }
   }

   public String isUploaded(String uploadedName) {

       for (WebElement file:files) {
           if (uploadedName.contains(file.getText())) {
               return file.getText();
           }

       }
       return null;
   }

    public void waitUntilProgressbarDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 1000);
            wait.until(ExpectedConditions.invisibilityOf(progressbar));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
