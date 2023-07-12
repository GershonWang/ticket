package com.dongpl.ticket.service.impl;

import com.dongpl.ticket.service.SeleniumService;
import javafx.application.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

@Service
public class SeleniumServiceImpl implements SeleniumService {

    @Override
    public void start() {
        Platform.runLater(() -> {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver/linux64/114.0.5735.90/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://detail.damai.cn/item.htm?spm=a2oeg.home.card_0.ditem_0.591b23e1kV4fgA&id=602770049661");
            String title = driver.getTitle();
            System.out.println(title);
//        driver.quit();
        });
    }

}
