package org.sef.student;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.sef.student.Login.Login;
import org.sef.student.Services.Champions;
import org.sef.student.Services.Items;
import org.sef.student.Services.Users;

import java.io.IOException;


public class Main{
    Button button;
    public static void main(String[] args) throws IOException {
        Users.loadUsersFromFile();
        Login.run(args);
    }
}
