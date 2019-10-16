/*
Nombre: Daniel Gonzalez Lopez
Fecha: 24/09/2019
 */
package login2;

import javafx.geometry.Insets;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login2 extends Application {
    @Override
     public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Text scenetitle = new Text("Bienvenido");
        scenetitle.setId("Bienvenido");
        grid.add(scenetitle, 0, 0, 2, 1);
        
        Label userName = new Label("Usuario: ");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Contraseña:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        Button btn = new Button();
        btn.setText("Iniciar sesion");
        grid.add(btn,0,3);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Text i =new Text("Conectando...");
                i.setId("inicio");
                grid.add(i,1,3);
            }
        });

        Scene scene = new Scene(grid, 500, 330);
        scene.getStylesheets().add(Login2.class.getResource("Login2.1.css").toExternalForm());
        primaryStage.setScene(scene);
       
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}

