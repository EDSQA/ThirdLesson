import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import java.nio.channels.ConnectionPendingException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class JUnit {
  @Test
    void fillFormTest () {
    Configuration.holdBrowserOpen = true;
      open("https://demoqa.com/text-box");
      $("[id=userName]").setValue("Gordon");
      $("#userEmail").setValue("Freeman");
      $("#currenrAddress").setValue("Kievskaya");
      $("#permanentAddress").setValue("Moskovskaya");
      $("#submit").click();
      $("#output").shouldHave(text("Gordon"));

  }
}
