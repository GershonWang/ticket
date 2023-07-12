package com.dongpl.ticket.service.impl;

import com.dongpl.ticket.service.SeleniumService;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

@Service
public class SeleniumServiceImpl implements SeleniumService {

    @Override
    public void start() {
        Platform.runLater(() -> {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.damai.cn/");
            Stage primaryStage = new Stage();
            // 创建 JavaFX WebView
            WebView webView = new WebView();
            // 设置 WebView 的宽度和高度
            webView.setPrefSize(600, 800);
            // 将 Selenium 控制的网页加载到 WebView 中
            webView.getEngine().load(driver.getCurrentUrl());
            // 创建 JavaFX 布局
            VBox root = new VBox(webView);
            // 创建场景并显示主舞台
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Selenium WebView Example");
            primaryStage.show();
            // 关闭浏览器驱动程序时停止 Selenium 进程
            primaryStage.setOnCloseRequest(event -> {
                driver.quit();
            });
        });
    }

}
