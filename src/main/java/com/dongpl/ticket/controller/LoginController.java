package com.dongpl.ticket.controller;

import com.dongpl.ticket.TicketApplication;
import com.dongpl.ticket.service.UserService;
import com.dongpl.ticket.view.MainView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Resource;

@FXMLController
public class LoginController {
    @FXML
    public TextField username;
    @FXML
    public TextField password;
    @Resource
    private MainView mainView;

    @Resource
    private UserService userService;

    @FXML
    public void login() {
        String username = this.username.getText();
        if (StringUtils.isBlank(username)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("用户名不能为空");
            alert.show();
            return;
        }
        String password = this.password.getText();
        if (StringUtils.isBlank(password)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("密码不能为空");
            alert.show();
            return;
        }
        String pass = userService.getPasswordByUserName(username);
        if (StringUtils.isBlank(pass)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("用户名不存在");
            alert.show();
            return;
        }
        if (!password.equals(pass)) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("密码错误");
            alert.show();
            return;
        }
        TicketApplication.getScene().setRoot(mainView.getView());
        Stage stage = TicketApplication.getStage();
//        stage.setFullScreen(true);
        stage.setTitle("主界面");
    }

    @FXML
    public void exit() {
        Platform.exit();
    }

}
