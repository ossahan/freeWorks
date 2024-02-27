package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class Yandex {
    public Yandex() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='gdpr-popup-v3-button gdpr-popup-v3-button_id_all']")
    public WebElement cookies;


    @FindBy(xpath = "//*[@class='ymUhCn bINQmj cnKsTd Dmxgvi APwJTj mkRYWc XofGvm eohKQl JJEUJm NSmUEf EGWSnd pOovWi WrNoSc uikJoc shlKBl']")
    public WebElement changeLogin;

    @FindBy(id = "passp-field-login")
    public WebElement userId;


    @FindBy(id = "passp-field-passwd")
    public WebElement password;


    @FindBy(xpath = "//table/tbody/tr[4]")
    public List<WebElement> ihsanCan;
}
