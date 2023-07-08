package com.dongpl.ticket;

import com.dongpl.ticket.splashScreen.CustomLoadingView;
import com.dongpl.ticket.view.LoginView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
//        launch(TicketApplication.class, LoginView.class, new CustomLoadingView(), args);
        launch(TicketApplication.class, LoginView.class, args);
    }

}
