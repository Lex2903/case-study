package scholarship.management.system;

import java.io.IOException;
import java.sql.Connection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    public void handleLogin(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Authenticate the user with the database here

        FXMLLoader loader = new FXMLLoader(getClass().getResource("main_page.fxml"));
        Parent mainPage = loader.load();

        MainPageController mainPageController = loader.getController();

        // Set up the main page with the authenticated user's details
        mainPageController.setAuthenticatedUser(username);

        Scene mainPageScene = new Scene(mainPage);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(mainPageScene);
        window.show();
    }
}
