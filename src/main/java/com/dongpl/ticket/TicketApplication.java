package com.dongpl.ticket;

import com.dongpl.ticket.splashScreen.CustomLoadingView;
import com.dongpl.ticket.view.LoginView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/chromedriver/linux64/114.0.5735.90/chromedriver");
//        launch(TicketApplication.class, LoginView.class, new CustomLoadingView(), args);
        launch(TicketApplication.class, LoginView.class, args);
    }

}
