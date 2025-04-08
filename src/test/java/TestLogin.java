import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestLogin {
  @BeforeAll
static void beforeAll() {
    Configuration.holdBrowserOpen = true;
    Configuration.browserSize = "1920x1080";
  }
  @Test
    void fillFormTest () {
      open("http://uitestingplayground.com/");
      $("[href=\"/textinput\"]").click();
      $("#newButtonName").setValue("EDS");
      $("#updatingButton").click();
      $("#updatingButton").shouldHave(text("EDS"));
//      $("#APjFqb").setValue("1");
//      $("#userEmail").setValue("Freeman");
//      $("#currenrAddress").setValue("Kievskaya");
//      $("#permanentAddress").setValue("Moskovskaya");
//      $("[jsname=uFMOof]").click();
//      $("#output").shouldHave(text("Gordon"));

  }
}
