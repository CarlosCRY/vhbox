package com.ccasais.vhbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Login extends Application {
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();
        Label labelTitle = new Label("LOGIN DAM");
        VBox.setMargin(labelTitle, new Insets(10, 0,10, 0));
        Label labelUser = new Label("Usuario");
        VBox.setMargin(labelUser, new Insets(10, 0,5, 0));
        TextField inputUser = new TextField();
        VBox.setMargin(inputUser, new Insets(5, 0,20, 0));
        inputUser.setMaxWidth(160);
        Label labelPass = new Label("Contraseña");
        VBox.setMargin(labelPass, new Insets(10, 0,5, 0));
        TextField inputPass = new TextField();
        VBox.setMargin(inputUser, new Insets(5, 0,20, 0));
        inputPass.setMaxWidth(160);
        Button btEntry = new Button("Entrar");
        Button btRegister = new Button("Registrarse");
        root.getChildren().addAll(labelTitle, labelUser, inputUser, labelPass, inputPass);

        root.setAlignment(Pos.CENTER);

        scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main (String[] args) { launch();}
}
