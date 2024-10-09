package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout = 5000;
    }

    @Test
    void formTest() {
        open("/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("alex@mail.ru");
        $("#currentAddress").setValue("Moscow");
        $("#permanentAddress").setValue("Rostov");
        $("#submit").click();


        $("#output").$("#name").shouldHave(text("Alex"));
        $("#output").$("#email").shouldHave(text("alex@mail.ru"));
        $("#output").$("#currentAddress").shouldHave(text("Moscow"));
        $("#output").$("#permanentAddress").shouldHave(text("Rostov"));
    }
}
