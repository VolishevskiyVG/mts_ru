package moblie.tests.ios;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;


import io.qameta.allure.selenide.AllureSelenide;
import moblie.drivers.IosBrowserstackDriver;
import moblie.helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

class IosTestBase {

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = IosBrowserstackDriver.class.getName();
        Configuration.browserSize = null;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void addAttachments() {
        String sessionId = sessionId().toString();

//        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();

        closeWebDriver();

        Attach.addVideo(sessionId);
    }
}
