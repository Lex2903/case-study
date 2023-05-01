package scholarship.management.system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;

public class MainPageController {

    @FXML
    private TextField searchField;
    @FXML
    private TableView<?> scholarshipTable;
    @FXML
    private TableColumn<?, ?> idColumn;
    @FXML
    private TableColumn<?, ?> nameColumn;
    @FXML
    private TableColumn<?, ?> descriptionColumn;
    @FXML
    private TableColumn<?, ?> amountColumn;
    @FXML
    private TableColumn<?, ?> deadlineColumn;

    private String authenticatedUser;

    public void setAuthenticatedUser(String authenticatedUser) {
        this.authenticatedUser = authenticatedUser;
    }

    @FXML
    public void handleSearch(ActionEvent event) {
        // Implement the search functionality here
    }

    @FXML
    public void handleAdd(ActionEvent event) {
        // Implement the add scholarship functionality here
    }

    @FXML
    public void handleEdit(ActionEvent event) {
        // Implement the edit scholarship functionality here
    }

    @FXML
    public void handleDelete(ActionEvent event) {
        // Implement the delete scholarship functionality here
    }
}
