package net.seamlessly.pages;

import net.seamlessly.utilities.BrowserUtils;
import net.seamlessly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

//   @FindBy(css = "#checkbox-allnewfiles")
//   protected WebElement NewFile;
//
//   @FindBy(css = "#checkbox-allexistingfiles")
//   protected WebElement existingFile;
//
//   @FindBy(css = "#ioc-dialog-fileexists-content")
//   protected WebElement fileExists;
//
//   @FindBy(css = ".continue")
//   protected WebElement continueButton;
//
//   @FindBy(css = ".cancel primary")
//    protected WebElement cancelButton;

   @FindBy(xpath = "(//span[@class='displayname'])[2]")
   protected WebElement newFolder;

   @FindBy(xpath = "//input[@value='New folder']")
   protected WebElement folderNameInput;

   @FindBy(xpath = "//li/a/form/input[@type='submit']")
   protected WebElement folderSubmit;

   @FindBy(xpath = "//a[@class='menuitem action action-movecopy permanent']")
   protected WebElement moveOrCopy;

   @FindBy(xpath = "//span[@class='filename-parts__first']")
   protected List<WebElement> chooseFolder;

   @FindBy(xpath = "//button[@class='primary']")
   protected WebElement moveButton;

   @FindBy(xpath = "//div[@class='oc-dialog-buttonrow twobuttons aside']/button[contains(text(),'Copy')]")
   protected WebElement copyButton;

   @FindBy(xpath = "//li[@data-id='trashbin']")
   protected WebElement deletedFiles;

   @FindBy(xpath = "//li[@class=' action-delete-container']")
   protected WebElement deleteFile;



   public void uploadFile(String fileName){
       addIcon.click();
       uploadFile.sendKeys((System.getProperty("user.dir") + "\\src\\test\\resources\\uploadedFiles\\"+fileName));
       waitUntilProgressbarDisappear();
//       if (fileExists.isDisplayed()){
//           cancelButton.click();
//       }
       BrowserUtils.waitFor(3);
   }

//   public String isUploaded(String uploadedName) {
//
//       for (WebElement file:files) {
//           if (uploadedName.contains(file.getText())) {
//               return file.getText();
//           }
//
//       }
//       return null;
//
//   }

    public void waitUntilProgressbarDisappear() {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.get(), 1000);
            wait.until(ExpectedConditions.invisibilityOf(progressbar));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void createFolder(String folderName) {
        addIcon.click();
        newFolder.click();
        folderNameInput.sendKeys(folderName);
        folderSubmit.click();
        BrowserUtils.waitFor(3);
    }

//    public String isCreated(String createdFolder) {
//
//        for (WebElement file:files) {
//
//            if (createdFolder.equals(file.getText())) {
//                return file.getText();
//            }
//        }
//        return null;
//
//    }

    public String isUploadedOrCreated(String uploadedOrCreated) {
       if(uploadedOrCreated.contains(".")) {

           for (WebElement file: files) {
               if (uploadedOrCreated.split("\\.")[0].equals(file.getText())) {
                   return file.getText();
               }

           }

       }
       else {
           for (WebElement file: files) {
               if (uploadedOrCreated.equals(file.getText())) {
                   return file.getText();
               }
           }
       }
        return null;
    }

    public void moveTo(String item, String folder) {
       int i=0;
       for (WebElement file:files) {
            i++;
            if (file.getText().equals(item)) {
               Driver.get().findElement(By.xpath("(//a[@class='action action-menu permanent'])"+"["+i+"]")).click();
               BrowserUtils.waitFor(2);
               moveOrCopy.click();
                for (WebElement fld:chooseFolder) {
                    if (fld.getText().equals(folder)) {
                        fld.click();
                        moveButton.click();
                    }
                }
            }
        }
    }

    public void openItem(String itemName) {
       navigateTo("files");
        for (WebElement item:files) {
            if(item.getText().equals(itemName)) {
                item.click();
            }
        }
    }

    public void scrollDown() {
        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        for (int i=0; i<10; i++) {
            jse.executeScript("window.scrollBy(0,250)");
            BrowserUtils.waitFor(1);
        }

    }

    public void copyTo(String item, String folder) {
        int i=0;
        for (WebElement file:files) {
            i++;
            if (file.getText().equals(item)) {
                Driver.get().findElement(By.xpath("(//a[@class='action action-menu permanent'])"+"["+i+"]")).click();
                BrowserUtils.waitFor(2);
                moveOrCopy.click();
                for (WebElement fld:chooseFolder) {
                    if (fld.getText().equals(folder)) {
                        fld.click();
                        copyButton.click();
                    }
                }
            }
        }
    }

    public String isInDeletedFile(String item) {
       String result;
       deletedFiles.click();
       scrollDown();
       result=Driver.get().findElement(By.xpath("//tr//span[text()='"+item+"']")).getText();
       return result;
    }

    public void deleteItem(String item) {
        int i = 0;
        for (WebElement file : files) {
            i++;
            if (file.getText().equals(item)) {
                Driver.get().findElement(By.xpath("(//a[@class='action action-menu permanent'])" + "[" + i + "]")).click();
                BrowserUtils.waitFor(2);
                deleteFile.click();
            }
        }

    }

}
