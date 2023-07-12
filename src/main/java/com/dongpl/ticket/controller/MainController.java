package com.dongpl.ticket.controller;

import com.dongpl.ticket.TicketApplication;
import com.dongpl.ticket.service.SeleniumService;
import com.dongpl.ticket.view.LoginView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import javax.annotation.Resource;

@FXMLController
public class MainController {

    @Resource
    private LoginView loginView;

    @Resource
    private SeleniumService seleniumService;

    public void toBack(ActionEvent actionEvent) {
        TicketApplication.getScene().setRoot(loginView.getView());
        Stage stage = TicketApplication.getStage();
        stage.setTitle("登录界面");
        stage.setFullScreen(false);
    }

    public void startService(ActionEvent actionEvent) {
        seleniumService.start();
    }

}
