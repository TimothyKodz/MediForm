import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class physicianMenuController implements Initializable{
    @FXML
    void toViewNotes(ActionEvent event) throws IOException {
        Parent viewNotesParent = FXMLLoader.load(getClass().getResource("viewNotes.fxml"));
        Scene viewNotesScene = new Scene(viewNotesParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(viewNotesScene);
        window.show();
    }
    
    @FXML
    void toPhysicianMedForm(ActionEvent event) throws IOException {
        Parent physicianMedFormParent = FXMLLoader.load(getClass().getResource("physicianMedicalForm.fxml"));
        Scene physicianMedFormScene = new Scene(physicianMedFormParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(physicianMedFormScene);
        window.show();
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
        Parent logout = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene logoutScene = new Scene(logout);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(logoutScene);
        window.show();
    }

    @FXML
    void backToEnterID(ActionEvent event) throws IOException {
        Parent backToID = FXMLLoader.load(getClass().getResource("enterID.fxml"));
        Scene backToIDScene = new Scene(backToID);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(backToIDScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
