import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.DragAndDropOptions;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class TestSixLesson {
    @BeforeAll
static void beforeAll() {
    Configuration.holdBrowserOpen = true;
    Configuration.browserSize = "1920x1080";
    }
@Test
    void doubleTest () {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body").shouldHave(text("Soft Assertions"));
        $("[href=\"/selenide/selenide/wiki/SoftAssertions\"]").click();
        $(".markdown-body").shouldHave(text("junit5"));
        //- Откройте страницу Selenide в Github
        // - Перейдите в раздел Wiki проекта
        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        // - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
    }
    @Test
    void gitSolutionsTest (){
        open("https://github.com/");
        $$(".HeaderMenu-link").findBy(text("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link").findBy(text("Enterprises")).click();
        $("[id=\"hero-section-brand-heading\"]").shouldHave(text("I-powered developer platfor"));
        //На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover для Solutions.
        // Убедитесь что загрузилась нужная страница (например что заголовок - "Build like the best
    }
    @Test
    void dragAndDropTest () throws InterruptedException {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        Thread.sleep(1000);
        $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
        //опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions()
        // - Откройте https://the-internet.herokuapp.com/drag_and_drop
        // - Перенесите прямоугольник А на место В
        // - Проверьте, что прямоугольники действительно поменялись
        // - В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест,
        // если использовать её вместо actions()
    }
}
