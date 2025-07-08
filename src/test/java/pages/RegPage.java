
package pages;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegPage {

    public RegPage openPage() {
        open("https://ultimateqa.com/filling-out-forms/");
        return this;
    }

    public RegPage setOneName(String value) {
        $("#et_pb_contact_name_0").setValue(value);
        return this;
    }
}
