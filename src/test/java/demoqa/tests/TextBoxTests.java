package demoqa.tests;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Tag("one_property_test")
public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = false;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void testBox(){
        String UserName = "Samuseu Vlad";

        open("/text-box");

        $("#userName").setValue(UserName);
        $("#userEmail").setValue("qa@gmail.com");
        $("#currentAddress").setValue("currentAddress");
        $("#permanentAddress").setValue("permanentAddress");
        $("#submit").click();


        $("#output").shouldBe(visible);
        $("#output #name").shouldHave(text("Name:"));
        $("#output #email").shouldHave(text("Email"));
        $("#output #currentAddress").shouldHave(text("Current Address"));
        $("#output #permanentAddress").shouldHave(text("Permananet Address"));
//        sleep(2000);
    }
}
