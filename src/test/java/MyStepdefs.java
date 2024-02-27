import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.Yandex;
import utilities.Driver;

import java.util.List;

public class MyStepdefs {
    Yandex yandex=new Yandex();
    @Given("go to {string}")
    public void goTo(String homePage) {
        Driver.getDriver().get("https://fleet.taxi.yandex.ru/drivers?status=working&park_id=80bdfac211584c879773c47f60748300");
    }

    @And("Input {string}")
    public void input(String userName) {
        yandex.userId.sendKeys(userName+ Keys.ENTER);


    }

    @And("Accept cookies")
    public void acceptCookies() {
        Driver.wait2(2);
        yandex.cookies.click();

    }

    @And("Click change login button")
    public void clickChangeLoginButton() {
        Driver.wait2(2);
        yandex.changeLogin.click();
    }

    @And("Input password as{string}")
    public void ınputPasswordAs(String password) {
        Driver.wait(2);
        yandex.password.sendKeys(password+ Keys.ENTER);

    }

    @And("Click to Ihsan Can")
    public void clickToIhsanCan() {
      Driver.wait(5);
    List<WebElement> st=  yandex.ihsanCan;
        System.out.println(st.size());
       // yandex.ihsanCan.click();
    }
}
