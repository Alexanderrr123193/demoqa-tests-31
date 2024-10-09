package tests;

import static com.codeborne.selenide.Selenide.$;

public class CssXpathExamples {
    void cssXpath(){
        $("#userName").setValue("Alex");
        $("#mail").setValue("1");
        $("#mail");
    }
}
