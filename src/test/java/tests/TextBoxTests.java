package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";  // Устанавливаем размер окна браузера
        Configuration.pageLoadStrategy = "eager";  // Ускоренная загрузка страницы
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout = 5000;  // Таймаут в 5 секунд
    }

    @Test
    void formTest() {
        open("/text-box");
        $("#userName").setValue("Alex");  // Вводим имя
        $("#userEmail").setValue("alex@mail.ru");  // Вводим email
        $("#currentAddress").setValue("Moscow");  // Вводим текущий адрес
        $("#permanentAddress").setValue("Rostov");  // Вводим постоянный адрес
        $("#submit").click();  // Кликаем на кнопку "Submit"

        // Проверяем результат
        $("#output").$("#name").shouldHave(text("Alex"));
        $("#output").$("#email").shouldHave(text("alex@mail.ru"));
        $("#output").$("#currentAddress").shouldHave(text("Moscow"));
        $("#output").$("#permanentAddress").shouldHave(text("Rostov"));
    }
}
